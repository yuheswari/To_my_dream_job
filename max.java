import java.util.*;
public class max{
    public static void main(String[]args){
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt(); // First input: number of elements
            int uk[] = new int[n];
            for(int i = 0; i < n; i++) {
                uk[i] = sc.nextInt(); // Read each element
            }
            int max = uk[0];
            for(int i = 1; i < n; i++) {
                if(uk[i] < max) {
                    max = uk[i];
                }
            }
            System.out.println(max); // Output the maximum value
    }
}