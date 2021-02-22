package com.company;

public class TestPoint {
    public static void main(String[] args) {
        Point point = new Point();
        point = new Point(1.2f,2.5f);
        System.out.println(point.getXY());
    }
}
