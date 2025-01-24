public class larges {
    public static void main(String args[]){
        int numm[]={21,34,54,65};
        System.out.println(getLargest(numm));
    }

    public static int getLargest(int numm[]){
        int largest=Integer.MIN_VALUE;

        for(int i=0;i<numm.length;i++){
            if(largest<numm[i]){
                largest=numm[i];
            }
        }
        return largest;
    }
    
}
