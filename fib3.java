
import java.math.BigInteger;


public class Fib {
public static void main(String[] args) {
        int FibonacciCount = 4000;
        BigInteger fibonacci [] = new BigInteger[FibonacciCount];
        //declare object called fibonacci [] as an array 
        fibonacci[0]=BigInteger.ONE;
        fibonacci[1]=BigInteger.ONE;
        fibonacci[2]=BigInteger.ONE;
        //initialize the fibonacci object to 1 using the BigInteger constant ONE
        
        for(int j = 3;j<FibonacciCount;j++){
        fibonacci[j]= fibonacci[j-1].add(fibonacci[j-2]).add(fibonacci[j-3]);
            
        }
        for(int i= 0;i<FibonacciCount;i++){
        System.out.println(fibonacci[i]+"");
        }
    }
}
