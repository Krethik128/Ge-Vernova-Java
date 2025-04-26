package com.gevernova.builtinfunctions.leveltwo;

import java.util.Scanner;
import java.util.Arrays;

public class FindPrimeNum {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        Boolean[] isPrime =new Boolean[n+1];
        Arrays.fill(isPrime,true);
        // Step 2: 0 and 1 are not prime
        isPrime[0] = false;
        isPrime[1] = false;
        for(int i=2;i*i<n;i++){ //using Sieve of Eratosthenes Algorithm
            if(isPrime[i]) {       //if prime then mark all its factors as false
                for (int j = i * i; j <= n; j += i) {
                    isPrime[j] = false;
                }
            }
        }
        System.out.println("Prime numbers up to " + n + ":"); // Printing the prime numbers
        for (int i = 2; i <= n; i++) {
            if (isPrime[i]) {
                System.out.print(i + " ");
            }
        }


    }
}
