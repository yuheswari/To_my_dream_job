import java.util.*;
public class user{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Enter the size of an array:"+n);

        int[]arr= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            System.out.println("the array is:"+arr[i]);
        }
    }
}
    