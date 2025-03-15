package gr.aueb.cf.ch14;

public class PointMain {

    public static void main(String[] args) {
        Point point = new Point();
        Point2D point2D = new Point2D();
        Point3D point3D = new Point3D();


        doMovePlus10(point);
        doMovePlus10(point2D);
        doMovePlus10(point3D);

    }

    public static void doMovePlus10(Point point) {
        point.movePlus10();
    }
}
