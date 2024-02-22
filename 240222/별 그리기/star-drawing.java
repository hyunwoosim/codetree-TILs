import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 0; i < n; i++){
                for(int m =0; m < n - (i + 1); m++){
                    System.out.print(" ");
                }
                for(int j = 0; j < (2 * i) +1; j++){
                    System.out.print("*");
                }
                System.out.println();
        }

        for(int q = 0; q < n-1; q++){
            for(int m = 0; m < q+1; m++){
                System.out.print(" ");
            }
            for(int j = 0; j < (2 *n)- (2 * q) -3; j ++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}