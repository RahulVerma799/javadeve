public class Revers {
    public static void main(String args[]){
        int number[]={23,54,76,87,98,909};

        revser(number);

        for(int i=0;i<number.length;i++){
            System.out.println(number[i]);

        }



    }

    public static void revser(int number[]){
        int first=0, last=number.length-1;

        while(first<last){
            int temp=number[last];
            number[last]=number[first];
            number[first]=temp;

            first++;
            last--;
        }
    }
    
}
