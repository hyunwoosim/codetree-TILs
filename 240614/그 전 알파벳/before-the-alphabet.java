import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        char a = sc.next().charAt(0);
        int A = (int) a;

        if(a != 'a') {
            A--;
            System.out.println((char)A);
       
        }else {
            A = 122;
            System.out.println((char)A);
        }
    }
}