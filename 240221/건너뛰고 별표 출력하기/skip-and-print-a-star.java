import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int cnt = 0;
        for(int i = 0; i < (n*2)-1; i++){
            for(int j = 0; j <=cnt; j++){
                System.out.print("*");
            }
                System.out.println();
                System.out.println();

                if(i <n-1){
                    cnt++;
                }else{
                    cnt--;
                }
        }
    }
}