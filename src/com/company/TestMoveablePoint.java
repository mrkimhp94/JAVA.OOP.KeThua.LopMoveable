package com.company;

public class TestMoveablePoint {
    public static void main(String[] args) {
        MoveablePoint moveablePoint;
        moveablePoint= new MoveablePoint(1.5f,2.6f,1.2f,2.5f);
        System.out.println(moveablePoint.getSpeed());
        System.out.println(moveablePoint.Move());
    }
}
