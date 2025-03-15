package gr.aueb.cf.ch17.builder;

public class main {
    public static void main(String[] args) {
        Book book1 = new Book.Builder(1,"12456").build();
        Book book2 = new Book.Builder(2, "35567")
                .author("Th")
                .title("Java")
                .build();
    }

}
