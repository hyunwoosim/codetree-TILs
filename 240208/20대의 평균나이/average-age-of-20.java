import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
int sum = 0;
int cnt = 0;
        while(true){
            int a = sc.nextInt();
           
            if(a>=20 && a<30){
             sum +=a;
                cnt++;
            }else {
                double d = (double) sum/cnt;
                System.out.printf("%.2f",d);
                break;
            
        }
    }
}
}