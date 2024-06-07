import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        char[] arr = new char[100];
        int count =0;

        for(int i = 0; i < str1.length(); i++){
           if(str1.charAt(i) != ' '){
           arr[count] = str1.charAt(i);
            count++;
           }
           
        }     
        for(int i = 0; i < str2.length(); i++){
           if(str2.charAt(i) != ' '){
           arr[count] = str2.charAt(i);
            count++;
           }
        }   
        for(int i = 0; i <count; i++){
            System.out.print(arr[i]);
        }
    }
}