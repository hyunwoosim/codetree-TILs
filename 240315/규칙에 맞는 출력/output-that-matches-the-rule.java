import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();
       
        for(int i = n;i>=1; i--){
           int cnt =i;
            for(int q = n; q>=i; q--){
            System.out.print(cnt+" ");
            cnt++;
            }
            System.out.println();
        }
    }
}