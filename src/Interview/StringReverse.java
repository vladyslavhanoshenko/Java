package Interview;

public class StringReverse {


    public static void stringReverse1(String str){
        for (int i = str.length()-1; i >=0; i--) {
            System.out.print(str.charAt(i));
        }
        System.out.println();
    }

    public static void stringReverse2(String str){
        char[] temp = str.toCharArray();

        for (int i = temp.length-1; i >=0 ; i--) {
            System.out.print(temp[i]);

        }
        System.out.println();

    }

    public static void main(String[] args) {
        stringReverse1("Hello world");
        stringReverse2("teaHello World");

    }
}
