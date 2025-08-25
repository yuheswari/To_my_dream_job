class avg{
    public static void main(String[]args){
        int num[]= {10,30,78,97,45};
        int sum =0;
        for(int i=0;i<num.length;i++){
            sum=sum+num[i];
        }
        int avg = sum/num.length;
        System.out.println(avg);
    }
}