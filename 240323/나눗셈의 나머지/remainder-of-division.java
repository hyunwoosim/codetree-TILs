import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();
      int b = sc.nextInt();
        int[] countArr = new int[10];
        int[] arr = new int[100];
        int sum = 0;

        for(int i = 0; i <100; i++){
            arr[i] = a%b;
            countArr[arr[i]]++;
            a/=b;
            if(a <=1){
            break;
            }
        }
    
        for(int i = 0; i < 10; i++){
          sum += countArr[i] * countArr[i];
        }
        System.out.println(sum);
    }
}