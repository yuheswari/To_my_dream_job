import java.util.*;
public class praa{
    public static void main(String[]args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the size of an array:");
        int n =sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter the "+n+"elements");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            System.out.println(arr[i]+" ");
        }
    }
}