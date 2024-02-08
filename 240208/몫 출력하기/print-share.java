import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
       
        
        for(int i = 0; i<=3; i++){
             int n = sc.nextInt();
                int a= 0;
               
            if((n%2==0)){
              a= n/2;    
           
                System.out.println(a);
        
            }
     
     
        }
    }
}