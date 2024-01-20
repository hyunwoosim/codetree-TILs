import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 10; i<=n ;--i ){
                int f = i;
               
             if(f%2 == 1 && f%3 == 0){
            System.out.println(f);
        }
        }
    }
}