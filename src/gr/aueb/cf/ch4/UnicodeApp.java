package gr.aueb.cf.ch4;

public class UnicodeApp {
    public static void main(String[] args) {
        int codePoint = 0x1f600;
        System.out.println("Smiley: \ud83D\uDE03");
        System.out.print("Smiley: ");
        System.out.println(Character.toChars(codePoint));
    }
}
