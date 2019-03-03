package Interview;

public class StringReverse {


    public static void stringReverse1(String str){
        for (int i = str.length()-1; i >=0; i--) {
            System.out.print(str.charAt(i));
        }

    }

    public static void main(String[] args) {
        stringReverse1("Hello world");

    }
}
