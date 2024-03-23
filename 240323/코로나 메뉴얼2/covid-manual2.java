import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        
        int[] numberArr = new int[11];
        char[] arr= new char[5];
        int[] officeArr = new int[4];
 

        for(int i =0; i<3; i++){
            arr[i] =sc.next().charAt(0);
            numberArr[i] = sc.nextInt();

            if(arr[i] =='Y' && numberArr[i]>=37){
                    officeArr[0]++;
            }else if(arr[i]=='N' && numberArr[i]>=37){
                officeArr[1]++;
            }else if(arr[i] == 'Y' && numberArr[i] <=36){
                officeArr[2]++;
            }else {
                officeArr[3]++;
            }

        }

        for(int i = 0; i<4; i++){
        System.out.print(officeArr[i] + " ");
        }
        if(officeArr[0] == 2){
            System.out.print("E");
        }
    }
}