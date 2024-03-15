import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 0;

        for(int i = 1; i <=n; i++){
            for(int q = 1; q<=(n-cnt); q++){
               if(q>1){
                System.out.print(" / "+i+" * "+ q+" = "+(i*q));
               }else{
                System.out.print(i+" * "+ q+" = "+(i*q));
               }
            }
            System.out.println();
            cnt++;
        }
    }
}