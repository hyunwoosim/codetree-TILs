import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = n;
        for(int i = 1 ; i <= n; i++) {
            for(int q = 0; q < n; q++){
                if(q%2==0){
                System.out.print(i);
                }else {
                    System.out.print(cnt);
                }
            }
            System.out.println();
            cnt--;
        }
    }
}