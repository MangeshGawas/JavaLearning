import java.util.Scanner;

public class ArrayElement_Deletion {
    public static void main(String[] args) {
        int n , m ,p;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the no of element in array");
        n = s.nextInt();
        int a[] = new int[n];
        int b[]=new int[n-1]; //when user want to delete the element size of the array is n-1
        System.out.println("Enter the value");

        for(int i=0; i<n; i++){
            a[i]= s.nextInt();
        }
        for(int i=0; i<n; i++){
            System.out.println("Array element are:" + a[i]);
        }

        System.out.println("Enter the index of value to be deleted ");

        m = s.nextInt();// this will take the index that which element to delete
        for(int i =0 ; i<a.length;i++){
            if(i<m){
                b[i]=a[i];
            }
            else if(i==m){
                continue;
            }
            else{
                b[i-1]=a[i];
            }
        }
        for(int i=0; i<n-1; i++){
            System.out.println(b[i]);
        }
    }
}
