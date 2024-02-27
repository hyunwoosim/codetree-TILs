import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        for(int i = 0; i < ((2*n+1)); i++){
            if(i%2 ==0){
                for(int q = 0; q < (2*n+1); q++){
                    System.out.print("* ");
                }
            }else{
                for(int w = 0; w < (2*n+1); w++){
                    if(w%2==0){
                        System.out.print("*   ");
                    }
                }
            }


            System.out.println();
        }
    }
}