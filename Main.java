import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner takeNumber = new Scanner(System.in);
       int a = takeNumber.nextInt();
       int b = takeNumber.nextInt();
       int Ans = Sum(a,b);
        System.out.println(Ans);
    }
    private static int Sum(int a ,int b){

         int sum = a + b;
         return sum;

    }
}