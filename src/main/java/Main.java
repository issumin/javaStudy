import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int sum1 =0; //홀수
        int sum2 =0;
        for(int i=1; i<=30; i++){
            if(i%2 == 0){
                sum2 +=i;
                continue;
            }
            sum1 += i;
        }
        System.out.println("홀수: "+ sum1 + "" +"짝수: "+sum2);
    }
}