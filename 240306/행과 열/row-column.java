import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.4
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        for(int i = 1; i < n+1; i++){
           for(int q = 1; q < m+1; q++){
            System.out.print(i * q + " ");
           }
            System.out.println();
        }
    }
}