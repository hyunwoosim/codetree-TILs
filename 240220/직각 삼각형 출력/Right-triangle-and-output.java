import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int j = 1;
        for(int i = 0; i <n; i++){
            for(int m=0; m<j; m++){
            System.out.print("*");
            }
            j+=2;
        System.out.println();
        }
    }
}