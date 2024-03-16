import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
 int m = sc.nextInt();

        // m회 반복합니다.
        for(int i = 0; i < m; i++) {
            // 변수 선언 및 입력
            int n = sc.nextInt();
            int ans = 0;
            
            // n이 1이 될 때까지 3n + 1을 반복합니다.
            while(n != 1) {
                if(n % 2 == 0)
                    n /= 2;
                else
                    n = n * 3 + 1;
                
                ans++;
            }
            
            System.out.println(ans);
        }
    }
}