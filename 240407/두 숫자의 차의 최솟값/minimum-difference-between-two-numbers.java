import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        
        for(int i =0; i<n; i++){
            arr[i]= sc.nextInt();            
        }
        int min = arr[1] - arr[0];   

        for(int i = 0; i < n-1; i++){
           if(min >  arr[i+1]- arr[i]){
             min =  arr[i+1] - arr[i];
           }
           
        }
        System.out.println(min);
    }
}