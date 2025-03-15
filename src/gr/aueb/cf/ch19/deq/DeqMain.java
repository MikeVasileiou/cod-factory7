package gr.aueb.cf.ch19.deq;

public class DeqMain {

    public static void main(String[] args) {
        MyStack<Integer> intStack = new MyStack<>();



        intStack.puch(1);
        intStack.puch(2);
        intStack.puch(3);
        intStack.puch(4);


        int topVal = intStack.pop();
        System.out.println(topVal);

        intStack.forEach(System.out::println);

    }
}
