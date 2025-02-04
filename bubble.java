public class bubble {
    public static void main(String args[]){  
        int num[]={23,54,65,21,33,66,35};
        bubbleSort(num);
        printArr(num);
    }

    public static void bubbleSort(int num[]){
        for(int i=0;i<num.length-1;i++){
            for(int j=0;j<num.length-1-i;j++){
                if(num[j]>num[j+1]){
                    int temp=num[j];
                    num[j]=num[j+1];
                    num[j+1]=temp;

                }
            }
        }
    }
    public static void printArr(int num[]){
        for(int i=0;i<num.length;i++){
            System.out.print(num[i]+" ");
        }
        System.out.println();
    }
    
    
}
