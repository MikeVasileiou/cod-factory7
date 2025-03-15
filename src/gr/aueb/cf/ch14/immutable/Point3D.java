package gr.aueb.cf.ch14.immutable;

/**
 * Point3D should be immutable
 */
public class Point3D {

    private Point point;
    private int z;

    public Point3D() {
        point = new Point();
        z = 0;
    }

    public Point3D(Point point, int z) {
        this.point = new Point(point.getX(), point.getY());
        this.z = z;
    }

    public Point getPoint() {
        return point;
    }

    public void setPoint(Point point) {
        this.point = point;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }
}
