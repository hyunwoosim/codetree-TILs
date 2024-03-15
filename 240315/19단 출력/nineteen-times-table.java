import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        
        for(int i =1; i <= 19; i++){
            for(int q = 1; q<=19; q++){
            if(q ==19){
            System.out.println(i+" * "+q + " = " +(i*q));               
            }else if(q%2==0){
                System.out.println(i+" * "+q + " = " +(i*q));
            }else{
                System.out.print(i+" * "+q + " = " +(i*q)+" / ");
            }
            }
            
        }
    }
}