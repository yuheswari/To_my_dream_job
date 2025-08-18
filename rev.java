import java.util.*;
public class rev{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int uk[]=new int[n];
        for(int i=n-1;i>=0;i--){
            uk[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            System.out.println(uk[i]);
        }
    }
}