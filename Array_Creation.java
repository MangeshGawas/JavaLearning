import java.util.Scanner;

public class Array_Creation {
    public static void main(String[] args) {
        //user defined array
        int n;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the no. of elements in array");
        n = s.nextInt();
        int a[ ] = new int[n];
        int b[ ] = new int[n+1]; // when user want to add new element at specific index

        //loop , here user can add element in array
        for( int i = 0; i < n; i++){
            a[i]=s.nextInt();  //a[0], a[1], a[2]...a[n]
        }
        System.out.println("Elements are :");
        //loop , here we are printing elements from an array
        for (int i = 0; i<n; i++){
            System.out.println(a[i] + "Here is an Array element");
        }

        //when user want to insert value at particular index then
        System.out.println("enter index of new value to be insert");
        int m  = s.nextInt(); //user defined index

        System.out.println("enter new value to be insert");
        int p = s.nextInt(); //user defined value

        for (int i = 0; i<n+1 ;i++){
            if(i<m){
                b[i]=a[i];
            }
            else if(i==m){
                b[i]= p;
            }
            else {
                b[i]= a[i-1];
            }

        }

        for (int i = 0; i<n+1; i++){
            System.out.println(b[i] + "Here is an Array with newly inserted element");
        }

    }
}
