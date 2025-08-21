public class even_odd{
    public static void main(String[]args){
        int []arr ={2,4,6,8,9,12,56};
        for(int i=0;i<arr.length;i++){
            if(arr[i] %2==0){
                System.out.println("its even");
            }
            else{
                System.out.println("its odd");
            }
        }
    }
}