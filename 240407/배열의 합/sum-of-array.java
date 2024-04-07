import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[4];

        for(int i = 0; i < 4; i++){
           int sum =0;
            for(int q = 0; q<4; q++){
                arr[q] = sc.nextInt();
                 sum += arr[q];
            }
            System.out.println(sum);
        }   
    }
}