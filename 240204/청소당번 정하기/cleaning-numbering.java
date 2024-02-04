import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int c = 0; //2일
        int h = 0; //3일
        int t = 0; //12일
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++ )
        if(i%12 ==0){
            t++;
        } else if(i%3==0){
            h++;
        } else if(i%2==0){
            c++;
        }
        System.out.printf("%s %s %s",c,h,t);
    }
}