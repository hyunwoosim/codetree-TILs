import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 0;
        for(int i = 0 ; i < n ; i++){
            for(int q = 0 ; q < n; q++){
                if(i%2==0){
                    cnt++;
                System.out.print(cnt + " ");
                
                }else{
                    cnt+=2;
                    System.out.print(cnt+" ");
                }
            }
            System.out.println();
        }

    }
}