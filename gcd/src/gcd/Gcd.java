
package gcd;

import java.util.LinkedList;

/**
 *
 * @author csteyrer
 */
public class Gcd {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(gcdEucledian(16, 24));
        System.out.println(gcdPrimeFactors(16, 24));
        
        System.out.println();
        
        System.out.println(gcdEucledian(350, 200));
        System.out.println(gcdPrimeFactors(350, 200));
        
        System.out.println();
        
        System.out.println(gcdEucledian(36, 180));
        System.out.println(gcdPrimeFactors(36, 180));
        
        System.out.println();
        
        System.out.println(gcdEucledian(160, 140));
        System.out.println(gcdPrimeFactors(160, 140));
        
        System.out.println();
        
        System.out.println(gcdEucledian(36, 180));
        System.out.println(gcdPrimeFactors(36, 180));
    }
    
    public static int gcdPrimeFactors(int number1, int number2){
        int gcd = 1;
        LinkedList<Integer> primeFactors1 = new LinkedList<>();
        LinkedList<Integer> primeFactors2 = new LinkedList<>();
        
        getPrimeFactors(number1, primeFactors1);
        getPrimeFactors(number2, primeFactors2);
        
        int count1 = 0;
        int count2 = 0;
        
        while(count1 < primeFactors1.size() && count2 < primeFactors2.size()){
            int num1 = primeFactors1.get(count1);
            int num2 = primeFactors2.get(count2);
            if(num1 < num2){
                count1++;
            }
            else if(num1 > num2){
                count2++;
            }
            else{
                gcd *= num1;
                count1++;
                count2++;
            }
        }
        
        return gcd;
        
        
        
        
    }
    
    public static void getPrimeFactors(int number, LinkedList<Integer> list)
    {
        int divider = 2;
        while(number != 1){
            
            if(number % divider == 0){
                list.add(divider);
                number /= divider;
            }
            else{
                divider++;
            }
                
          
        }
    }
    
    public static boolean isPrime(int number)
    {
        for (int i = 2; i < number; i++) {
            if(number % i == 0){
                return false;   
            }
        }
        
        return true;
        
    }
    
    public static int gcdEucledian(int number1, int number2){
        
        if(number2 == 0){
            return number1;
        }
        
        return gcdEucledian(number2, number1 % number2);
    }
    
}
