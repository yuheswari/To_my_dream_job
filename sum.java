import java.util.*;
public class sum{
    public static void main(String[]args){
        Scanner sc =new Scanner(System.in);
         int sum =0;
        int n =sc.nextInt();
        int uk[]=new int[n];
        for(int i=0;i<n;i++){
        uk[i]=sc.nextInt();

        
        }
        for(int i=0;i<n;i++){
            sum =sum+uk[i];

        }

        System.out.println(sum);
            
            



    }
}