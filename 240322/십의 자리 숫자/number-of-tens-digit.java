import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int[] countArr = new int[10];
        int[] arr = new int[100];

        for(int i = 0 ; i < 100; i++){
            arr[i] = sc.nextInt();
            if(arr[i] == 0){
            break;
            }

            if(arr[i] < 10)
                continue;
            countArr[arr[i] / 10]++;
            
        }

        for(int i =1; i <=9; i++) {
            System.out.println(i + " - "+ countArr[i]);
        }
    }
}