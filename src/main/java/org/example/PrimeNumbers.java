package org.example;
import java.util.List;

public class PrimeNumbers {

    public static void main(String[] args) {
        int coef = ManualInput.number();
        int n = (int) (Math.random() * coef);

        List<Integer> primeNumbers = PrimeNums.PrimeNumbers(n);

        int maxOnesPrimeNumber = PrimeNums.MaxOnes(primeNumbers);

        System.out.println("Random number is " + n);
        System.out.println("Prime number with most ones in it: " + maxOnesPrimeNumber);
    }


}