import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

       int[] list = new int[n];
        

        for(int i = 0;  i<n; i++){
            list[i] = sc.nextInt();
        }

        for(int i : list){
            if(i %2 ==1 && i%3==0){
                System.out.println(i);
            }
        }

}

}