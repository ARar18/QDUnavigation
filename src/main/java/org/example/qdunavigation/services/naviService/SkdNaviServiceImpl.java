package org.example.qdunavigation.services.naviService;

import org.apache.poi.ss.usermodel.*;
import org.example.qdunavigation.mapper.BuildingMapper;
import org.example.qdunavigation.mapper.NodeMapper;
import org.example.qdunavigation.pojo.Node;
import org.example.qdunavigation.pojo.Path;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Service
public class SkdNaviServiceImpl implements SkdNaviServiceI{
    @Autowired
    MultistepNaviServiceImpl multistepNaviService;
    @Autowired
    BuildingMapper buildingMapper;
    @Autowired
    NodeMapper nodeMapper;
    @Override
    public List<Path> skdNavi(MultipartFile file, int week, int day, Node placeForNoon, Node startPlace, Node endPlace, Node placeForSpare) {
        try {
            InputStream inputStream = file.getInputStream();
            Workbook workbook = WorkbookFactory.create(inputStream);
            Sheet sheet = workbook.getSheetAt(0);
            List<Node> nodes = new ArrayList<>();
            if(startPlace != null){
                nodes.add(startPlace);
            }
            for(int i = 3; i <= 8; i ++){
                Row row=sheet.getRow(i);
                Cell cell=row.getCell(day);
                //System.out.println(cell.getStringCellValue());
                String building = checkCurrentCellCourse(cell.getStringCellValue(), week);
                if(!building.isEmpty()){
                    building = building.substring(0, 3);
                    nodes.add(nodeMapper.findById(buildingMapper.findByName(building).getBuildingNode()));
                    System.out.println(building);
                }
                else {
                    if(placeForSpare != null){
                        nodes.add(placeForSpare);
                    }
                }
                if(i == 4 && placeForNoon != null){
                    nodes.add(placeForNoon);
                }
            }
            if(endPlace != null){
                nodes.add(endPlace);
            }
            List<Path> ret = multistepNaviService.multistepNavi(nodes);
            return ret;

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static String checkCurrentCellCourse(String cellContent, int currentWeek) {
        String[] blocks = cellContent.split("\n\n"); // 分割不同课程块

        for (String block : blocks) {
            String[] lines = block.split("\n");
            // 确保每个课程块有足够的行数
            if (lines.length >= 4) {
                if(Objects.equals(lines[0], "")){ lines[0] = lines[1]; lines[1] = lines[2]; lines[2] = lines[3]; lines[3] = lines[4];}
                String weekInfo = lines[2].replaceAll("\\[周\\]", "").replaceAll("\\(|\\)", "");
                String building = lines[3];

                // 处理周次信息
                if (weekInfo.contains("-")) {
                    // 处理范围周次，如 "1-8"
                    String[] range = weekInfo.split("-");
                    int startWeek = Integer.parseInt(range[0]);
                    int endWeek = Integer.parseInt(range[1]);
                    if (currentWeek >= startWeek && currentWeek <= endWeek) {
                        return building;
                    }
                } else {
                    // 处理单独列出的周次，如 "1,3,7,9,11,13,15,17"
                    String[] weeks = weekInfo.split(",");
                    for (String week : weeks) {
                        if (Integer.parseInt(week.trim()) == currentWeek) {
                            return building;
                        }
                    }
                }
            }
        }

        return ""; // 如果当前单元格没有课
    }
}
