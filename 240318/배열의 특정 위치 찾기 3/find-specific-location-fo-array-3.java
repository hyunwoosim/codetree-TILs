import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc= new Scanner(System.in);
      int[] arr = new int[100];
        int sum = 0;
        int cnt = 0;

            for(int i = 0; i < 100; i++){
                arr[i] = sc.nextInt();
                    cnt++;
                    if(arr[i]== 0)
                    break;
            }
            for(int i = cnt-1; i >=cnt-4; i--){
                sum += arr[i];
            }
            System.out.println(sum);
    }
}