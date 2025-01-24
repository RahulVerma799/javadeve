public class Reverse {
    public static void main(String args[]){
            int num[]={23,45,67,89,99};
            Reversed(num);
    }
    public static void Reversed(int num[]){
        int first=0;
        int last=num.length-1;


        while(first<last){
            int temp=num[last];
            num[last]=num[first];
            num[first]=temp;

            first++;
            last--;
        }
    }

    
}
