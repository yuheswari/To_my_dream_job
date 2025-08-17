import java.util.*;
public class arr{
    public static void main(String[]args){
        System.out.print("enter the user val:");

        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        System.out.println("the val of n is:"+n);
        int uk[]=new int[n];
        for(int i =0;i<n;i++){
            uk[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){ //i=0,1,2,3,4
            System.out.print(uk[i]); 
        }
    }
}