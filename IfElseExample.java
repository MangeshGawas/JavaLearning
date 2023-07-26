import java.sql.SQLOutput;

public class IfElseExample {
    public static void main(String[] args) {
        int num = 10;
        if ( num > 0){
            System.out.println("Positive Number");
        }else if(num < 0){
            System.out.println("Negative Number");
        }else {
            System.out.println("The number is zero");
        }
    }
}
