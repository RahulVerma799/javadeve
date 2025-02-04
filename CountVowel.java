import java.util.Scanner;

public class CountVowel {
    public static void main(String args[]){
        String s=new String();
        int i=0;
        int vol=0;
         int con=0;
            Scanner sc=new Scanner(System.in);
            System.out.println("");
            s=sc.nextLine();
            s=s.toUpperCase();

            for(i=0;i<s.length();i++){
                char c=s.charAt(i);
                if(c!=' '){
                    if(c=='A'||c=='E'||c=='I'||c=='O'||c=='U'){
                        vol++;
                    }else{
                        con++;
                    }
                }
            }
            System.out.println("numbor of voewl"+vol);
            System.out.println("Nber of consonent"+con);
    }
    
}
