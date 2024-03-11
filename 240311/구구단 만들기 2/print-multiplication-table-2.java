import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        for(int i = 1; i <= 4; i++){
            for(int q = 9; q >= a; q--) {
                    if(q<=b ){
                        System.out.print(q + " * " + (i * 2)+ " = " + ((i*2)*q));
                    if( a<q ){
                    System.out.print(" / ");
                    }
            }
            
        }
    System.out.println();
    }
}}