import java.util.Scanner;

public class Travel_Restrictions {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();

        for (int i = 0; i < t; i++) {
            int l= scan.nextInt();
            
            
            char ch[] = scan.next().toCharArray();
            
            int a=0;
            int b=0;
            
            for(int j=0;j<l;j++){
                if(ch[j]=='A'){
                   a++;
                }
                else{
                   b++;
                }
            }
            
            int result=Math.abs(a-b);
            
            if(result==1){
                   System.out.println("Case #"+(i+1)+": Y");
            }
            else{
                   System.out.println("Case #"+(i+1)+": N");
            }
        }

    }
}
