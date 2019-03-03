package Interview;

public class PhisBase {

    public static void phisBase(int i){
        if(i % 3 ==0 && i % 5 == 0){
            System.out.println("PhisBase");
        }
        else if(i%3==0){
            System.out.println("Phis");
        }
        else if(i%5==0){
            System.out.println("Base");
        }
    }

    public static void main(String[] args) {
        phisBase(5);

    }
}
