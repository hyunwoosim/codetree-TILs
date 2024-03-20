import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[100];
        
        for(int i = 1; i <3; i++){
            arr[i] = sc.nextInt();
            System.out.print(arr[i]+ " ");
        }

        for(int i = 3 ; i < 11; i++){
            arr[i] = arr[i-1] + 2*arr[i-2];
            System.out.print(arr[i] + " ");
        }
    }
}