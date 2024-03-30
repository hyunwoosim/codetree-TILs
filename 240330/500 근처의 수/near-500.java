import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10];
     
        int max = 0;
        int cnt=0;
        int[] arr2 = new int[10];
        for(int i = 0; i < 10; i++){
            arr[i] = sc.nextInt();
            if(arr[i]>= max && arr[i] <500){
                max = arr[i];
            }
            if(arr[i]> 500){
                arr2[i] =arr[i];
               
              
            }
        }
        int min = 1000;
        
        for(int i =0; i < 10; i++){
                if(arr2[i] < min && arr2[i]> 500){
                    min = arr2[i];
                }
        }
        
        System.out.print(max+ " "+ min);
    }
}