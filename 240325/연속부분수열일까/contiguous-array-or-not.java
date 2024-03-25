import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n1= sc.nextInt();
        int n2= sc.nextInt();
        int[] A = new int[100];
        int[] B = new int[100];
        int cnt = 0;
        for(int i = 0; i < n1; i++){
            A[i] = sc.nextInt();
        }
        for(int i = 0; i < n2; i++){
            B[i] = sc.nextInt();
        }
        for(int i = 0; i< n1; i++){

            for(int q = 0; q< n2; q++){
                if(A[i] == B[q]&& A[i+1]==B[q+1]){
                   cnt++;
                }
               
            }
        }
        if(cnt >=2){
            System.out.print("Yes");
        }else{
            System.out.print("No");
        }
    }
}