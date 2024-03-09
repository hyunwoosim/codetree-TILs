import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++){
            for(int q = 1; q <= n; q++){
                System.out.print(i + " * " + q + " = " + (i*q));
                if(q < n){
                    System.out.print(", ");
                }
            }
                System.out.println();
        }
    }
}