package com.company;

public class MoveablePoint extends Point {
    private float xSpeed;
    private float ySpeed;
    public MoveablePoint(){};
    public MoveablePoint(float xSpeed,float ySpeed){
        this.xSpeed= xSpeed;
        this.ySpeed= ySpeed;
    }
    public MoveablePoint(float x,float y,float xSpeed,float ySpeed){
        super(x,y);
        this.xSpeed =xSpeed;
        this.ySpeed=ySpeed;
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }
    public void setSpeed(float xSpeed,float ySpeed){
        setxSpeed(xSpeed);
        setySpeed(ySpeed);
    }
    public MoveablePoint getSpeed(){
        return new MoveablePoint(super.getX(),super.getY(),xSpeed,ySpeed);
    }

    @Override
    public String toString() {
        return super.toString()+"\n"+"Speed{" +
                "xSpeed=" + xSpeed +
                ", ySpeed=" + ySpeed +
                '}';
    }
        public MoveablePoint Move(){
        super.setXY(super.getX()+xSpeed,super.getY()+ySpeed);
        return this;
    }
}
