import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();

        String A = a+b;
        String B = b+a;



        if(A.equals(B)){
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}