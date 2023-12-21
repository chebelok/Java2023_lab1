package org.example;

import java.util.ArrayList;
import java.util.List;

public class PrimeNums {
    public static List<Integer> PrimeNumbers(int n) {
        List<Integer> primeNumbers = new ArrayList<>();

        for (int i = 2; i <= n; i++) {
            boolean isPrime = true;
            for (int j = 2; j <= Math.sqrt(i) ; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println( i );
                primeNumbers.add(i);
            }
        }
        return primeNumbers;
    }


    public static int MaxOnes(List<Integer> primeNumbers) {
        int maxOnesPN = 0;
        int maxCount = 0;

        for (int primeNumber : primeNumbers) {
            int count = countOnes(primeNumber);
            if (count >= maxCount) {
                maxCount = count;
                maxOnesPN = primeNumber;
            }
        }

        return maxOnesPN;
    }

    public static int countOnes(int number) {
        int count = 0;

        String binaryNumber = Integer.toBinaryString(number);
        for(int i = 0; i < binaryNumber.length(); i++){
            if(binaryNumber.charAt(i) == '1'){
                count++;
            }

        }
            return count;
    }
}
