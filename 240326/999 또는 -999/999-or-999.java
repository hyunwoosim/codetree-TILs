import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[100];
        arr[0] = sc.nextInt();
        int max = arr[0];
        int min = arr[0];

       
        for(int i = 0; i < 100; i++){
            arr[i] = sc.nextInt();
            if(arr[i] == 999 || arr[i] == -999){
                break;
            }
            if(arr[i] > max ){
                max = arr[i];
            }
            if(min >= arr[i]){
                min = arr[i];
            }
        }
        System.out.print(max + " " + min);
    
    }
}