import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n-(i+1); j++){
                System.out.print(" ");
            }
            for(int q = 0; q <= i; q++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int m = 0; m < n - 1; m++){
            for(int g = m + 1; g > 0 ; g-- ){
                System.out.print(" ");
            }
            for(int e = n-(m+1);  e > 0 ; e--){
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}