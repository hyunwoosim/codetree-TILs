import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        char a = sc.next().charAt(0);
        
        if(a != 'z'){
            int A = (int) a;
            A++;
            System.out.println((char) A);
        } else{
            int A = (int) a;
            A = 65;
            System.out.println((char) A);
        }
    }
}