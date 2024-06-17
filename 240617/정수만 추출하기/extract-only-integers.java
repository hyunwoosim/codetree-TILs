import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();
        
        int len1 = A.length();
        int len2 = B.length();
        String C ="";
        String D ="";

        for(int i = 0; i < len1; i++){
            if(A.charAt(i) >= '0' && A.charAt(i) <= '9'){
                C += (A.charAt(i) - '0');
               
            } else{
                break;
            }
        }
         for(int i = 0; i < len2; i++){
            if(B.charAt(i) >= '0' && B.charAt(i) <= '9'){
                D += (B.charAt(i) - '0');
                
            } else{
                break;
            }
        }
        int a = Integer.parseInt(C);
        int b = Integer.parseInt(D);

        System.out.println(a+b);

    }
}