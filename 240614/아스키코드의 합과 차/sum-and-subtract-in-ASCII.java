import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        char a = sc.next().charAt(0);
        char b = sc.next().charAt(0);

        int A = (int) a;
        int B = (int) b;

        System.out.print(A+B + " ");
        if( A> B){
        System.out.print(A-B);   
        } else{
            System.out.print(B-A);   
        }
    }
}