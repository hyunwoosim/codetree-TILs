import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int s = sc.nextInt();
        int e = sc.nextInt();
        int cnt =0;

        for(int i = s; i <= e; i++){
            int sum= 0;
            for(int q = 1; q <= i; q++){
                if(i%q == 0){
                    sum++;
                }
            }
            if(sum ==3){
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}