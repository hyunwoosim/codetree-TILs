import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int q = sc.nextInt();
        int[] arr = new int[100];


        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }


        for(int w = 0; w < q; w++){
            int type = sc.nextInt();
        

            if(type == 1){
                int a = sc.nextInt();
                System.out.println(arr[a -1]);
            }
            else if(type == 2) {
                int a =sc.nextInt();
                int idx = -1;
                for(int t = 0; t < n; t++){   
                if(arr[t] == a){
                   
                    idx = t;
                    break;
                }
                }
                    System.out.println(idx+1);
                
            }else{
                int a = sc.nextInt();
                int b = sc.nextInt();
                for(int r = a-1; r <b; r++){
                    System.out.print(arr[r]+ " ");
                }
                System.out.println();
            }
        }
        
    }
}