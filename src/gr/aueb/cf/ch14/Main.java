package gr.aueb.cf.ch14;

import gr.aueb.cf.ch14.model.Point;
import gr.aueb.cf.ch14.services.CodingFactorySingleton;
import gr.aueb.cf.ch14.services.HelloUtil;
import gr.aueb.cf.ch14.model.Teacher;

public class Main {

    public static void main(String[] args) {
        Teacher teacher1 = new Teacher(1, "Mike", "Vasileiou");
        Teacher teacher2 = new Teacher(2, "A.", "Giannoutsou");
        Teacher teacher3 = new Teacher(1, "C.", "Papadopoulos");

        HelloUtil.sayHello();

        Point p1 = Point.getInstance();
        Point p2 = Point.getRandomPoint();



        CodingFactorySingleton cf1 = CodingFactorySingleton.getInstance();
        CodingFactorySingleton cf2 = CodingFactorySingleton.getInstance();


        System.out.println(cf1);
        System.out.println(cf2);

        System.out.println(p1);
        System.out.println(p2);


    }
}
