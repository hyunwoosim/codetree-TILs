import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int len = str.length();
        int q = sc.nextInt();
        
        for(int i = 0 ; i < q; i++){
            int q2 = sc.nextInt();

            if(q2 == 1) {
                str = str.substring(1,len) + str.substring(0,1);
                System.out.println(str);
            }
            if(q2 == 2) {
                str = str.substring(len-1,len) + str.substring(0,len-1);
                System.out.println(str);
            }
            if(q2 == 3) {
                StringBuffer sb = new StringBuffer(str);
                str = sb.reverse().toString();
                System.out.println(str);
                  
            }
        }
    }
}