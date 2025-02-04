public class subArray {
    public static void main(String args[]){
        int number[]={2,3,45,65,67,78};
        printSubArray(number);
    }

    public static void printSubArray(int number[]){
        for(int i=0;i<number.length;i++){
            int start=i;
            for(int j=i;j<number.length;j++){
                int end=j;
                for(int k=start;k<end;k++){
                    System.out.print(number[k]+" ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
    
}
