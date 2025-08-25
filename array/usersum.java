import java.util.*;
public class usersum{
    public static void main(String[]args){
        int sum =0;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[]arr=new int[n];
        for(int i=0;i<n;i++){
            sum=sum+arr[i];
        }
        for(int i=0;i<n;i++){
        System.out.println(sum);
        }

    }
}