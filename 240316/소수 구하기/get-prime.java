import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
    // 변수 선언 및 입력
        int n = sc.nextInt();

        // 1부터 n까지 소수를 구합니다.
        for(int i = 1; i <= n; i++) {
            if(i == 1) continue;
            boolean isprime = true;
            
            for(int j = 2; j < i; j++)
                if(i % j == 0) isprime = false;
            
            if(isprime)
                System.out.print(i + " ");
        }
    }
}