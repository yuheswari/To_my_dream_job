import java.util.*;
public  class ele{
    public static void main(String[]args){
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the ele:");
        int ele=sc.nextInt();
        int n =sc.nextInt();
        int uk[]=new int[n];
        for(int i=0;i<n;i++){
            uk[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
        if(ele==uk[i]){
            System.out.println("found");
            break;
        }
        }

        
        for(int i=0;i<n;i++){
            System.out.print(uk[i]);
        }
    }
}












