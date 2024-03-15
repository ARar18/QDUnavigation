package org.example.qdunavigation;

import org.example.qdunavigation.mapper.NodeMapper;
import org.example.qdunavigation.pojo.Node;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

@SpringBootTest
class QduNavigationApplicationTests {
    @Autowired
    DataSource dataSource;

    @Test
    void contextLoads() {
        System.out.println(dataSource.getClass());
        try {
            Connection connection = dataSource.getConnection();
            System.out.println(connection);
            connection.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
    @Autowired
    NodeMapper nodeMapper;
    public void toTest(){
        List<Node> nodes = nodeMapper.findAll();
        nodes.forEach(e-> System.out.println(e));
    }

}
