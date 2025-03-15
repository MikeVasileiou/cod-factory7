package gr.aueb.cf.ch14;

public class Point3D extends Point2D{

    private double z;

    public Point3D() {
        super(); //Constructor chaining Point->Point2D->Point3D
        z = 0;
    }

    public Point3D(double x, double y, double z) {
        super(x, y);
        this.z = z;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }
}
