import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int len = str.length();
        int sum = 0;

        for(int i = 0 ; i < len; i++) {
            if(str.charAt(i) >= '0' && str.charAt(i) <= '9') {
                sum += (str.charAt(i) - '0');

            }
        }
        System.out.print(sum);
    }
}