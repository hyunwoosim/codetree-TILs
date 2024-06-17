import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();
        String str1 = A+B;
        String str2 = B+A;
        int a = Integer.parseInt(str1);
        int b = Integer.parseInt(str2);
       
       System.out.println(a+b);
    }
}