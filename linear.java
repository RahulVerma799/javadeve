public class linear {
    public static void main(String args[]){
        int arrays[]={23,45,7,87,65,67};
        int key=65;

        int index=leinearSearch(arrays, key);
        
        if(index== -1){
        System.out.println("Not fount");
        }
        else{
            System.out.println("found at"+index);
        }
    }

    public static int leinearSearch(int arrays[],int key){
        for(int i=0;i<arrays.length;i++){
            if(arrays[i]==key){
                return i;
            }
        }
        return -1;
    }
    
}
