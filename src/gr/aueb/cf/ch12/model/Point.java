package gr.aueb.cf.ch12.model;

public class Point {
    private static int noOfPoint = 0;
    private int x;
    private int y;



    public Point() {
        noOfPoint++;
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
        noOfPoint++;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
