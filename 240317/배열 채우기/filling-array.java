import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        
        int[] arr = new int[10];
        int cnt = 0;

        // 10개의 정수를 배열에 입력받으며 0이 있는지 확인합니다.
        for(int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
            if(arr[i] == 0)
                break;
            cnt++;
        }

        // 0이 입력되기 전까지의 수를 반대 순서로 출력합니다.
        for(int i = cnt - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}