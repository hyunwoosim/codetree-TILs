import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = Integer.toString(n);
        int len = str.length();
        int sum = 0;

        for(int i = 0; i < len; i++){
            sum += str.charAt(i) - '0';
        }
        System.out.println(sum);
    }
}