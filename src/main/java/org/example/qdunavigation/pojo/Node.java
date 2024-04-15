package org.example.qdunavigation.pojo;

public class Node {
    private String node_no;
    private double pos_x;
    private double pos_y;
    public String getNode_no() {
        return node_no;
    }

    public void setNode_no(String node_no) {
        this.node_no = node_no;
    }

    public double getPos_x() {
        return pos_x;
    }

    public void setPos_x(double pos_x) {
        this.pos_x = pos_x;
    }

    public double getPos_y() {
        return pos_y;
    }

    public void setPos_y(double pos_y) {
        this.pos_y = pos_y;
    }
    @Override
    public String toString(){
        return getNode_no();
    }

}
