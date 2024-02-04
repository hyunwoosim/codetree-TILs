import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int cnt = 0;
        int sum = 0;
        double sumT =0;

        for( int i =1; i<=n; i++){
            int a = sc.nextInt();
            sum +=a;
            cnt++;
        }
        sumT = (double)sum/cnt;

        System.out.printf("%s %.1f",sum, sumT);
    }
}