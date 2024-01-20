import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = n; i <=100; i++){
            if(90 <= i){
                System.out.print('A' + " ");
            }else if( 80 <= i){
                System.out.print('B' + " ");
            }else if(70 <= i){
                System.out.print('C'+ " ");
            }else if(60 <= i){
                System.out.print('D'+ " ");
            }else{
                System.out.print('F' + " ");
            }
        }
    }
}