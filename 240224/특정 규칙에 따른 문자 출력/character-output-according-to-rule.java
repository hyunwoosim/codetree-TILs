import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 0 ; i < n; i++){
            for(int j = 0; j < n-(i+1); j++){
                System.out.print("  ");
            }
            for (int m=0; m <=i; m++){
                System.out.print("@ ");
            }
        
            System.out.println();
        }
        for(int k = 0; k < n-1; k++){
               for(int q = 0; q < n-(k+1); q++){
                System.out.print("@ ");
               }
            System.out.println();
            }
    }
}