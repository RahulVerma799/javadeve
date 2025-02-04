public class selection {
    public static void main(String args[]){
        int num[]={88,44,77,33,66,11,32};
    }

    public static void SelectionSort(int num[]){
        for(int i=0;i<num.length-1;i++){
            int minPos=i;
            for(int j=i+1;j<num.length-1;j++){
                if(num[minPos]>num[j]){
                    minPos=j;
                }
            }

            int temp=num[minPos];
            num[minPos]=num[i];
            num[i]=temp;
        }
    }
    
}
