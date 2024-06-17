import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        int len1 = str1.length();
        int len2 = str2.length();
        String A = "";
        String B = "";
        for(int i = 0 ; i < len1; i++){
            if(str1.charAt(i) >= '0' && str1.charAt(i) <= '9') {
                A += str1.charAt(i);
            }
        }

        for(int i = 0 ; i < len2; i++){
            if(str2.charAt(i) >= '0' && str2.charAt(i) <= '9') {
                B += str2.charAt(i);
            }
        }

        int C = Integer.parseInt(A);
        int D = Integer.parseInt(B);

        System.out.println(C + D);
    }
}