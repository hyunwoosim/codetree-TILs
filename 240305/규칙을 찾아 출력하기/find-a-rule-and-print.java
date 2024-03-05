import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int i = 0; i < n; i++){
            for(int q = 0; q < n; q++){
                if(i == 0 || i == (n-1) || q < i || q==(n-1)){
               System.out.print("* ");    
             
            
                }
                else{
                    System.out.print("  ");
                }
                
               
            }
            
            System.out.println();
        }
    }
}