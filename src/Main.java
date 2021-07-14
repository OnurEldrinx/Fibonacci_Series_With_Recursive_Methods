import java.util.Scanner;

public class Main {
    public static void main(String[] args){

    // 0 1 1 2 3 5 8 13 21 34 55 89 144

        int n;

        Scanner x = new Scanner(System.in);
        System.out.print("Which element of the fibonacci series do you want to print: ");
        n = x.nextInt();

        System.out.println(n + ".Element : " + fibonacciNthElement(n));


    }

    static int fibonacciNthElement(int N){

           if (N == 1 || N == 2){

               return 1;

           }else{

               return fibonacciNthElement(N-1) + fibonacciNthElement(N-2);

           }

    }

}
