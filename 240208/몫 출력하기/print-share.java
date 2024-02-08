import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
       
        
        int cnt = 0;
        
        while(true) {
            // 변수 선언 및 입력
            int n;
            n = sc.nextInt();

            // n이 홀수라면 아무 작업도 하지 않고, n이 짝수라면 n/2를 출력하는 작업을 3번 한 뒤 종료합니다.
            if(n % 2 == 1)
                continue;
            
            System.out.println(n / 2);
            cnt++;
            
            if(cnt >= 3)
                break;
        }
    }
}