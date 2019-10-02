/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primeNo;

import java.util.Scanner;

class Prime {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int testCase = s.nextInt();
        while(testCase>0){
        int firstNumber = s.nextInt();
        int secondNumber = s.nextInt();
        Prime pr = new Prime();
        int no = pr.noOfBits(firstNumber, secondNumber);
        System.out.println(no);
        testCase--;
        }
    }

    public int noOfBits(int L, int R) {
        int primeBitSet = 0;
        int y = 0;//30887 89384
        for (int i = L; i <= R; i++) {

            int count = 0;
            y = i;
            while (y > 0) {
                count += y & 1;
                y >>= 1;
            }

            if (!isPrime(count)) {
                primeBitSet++;
            }

        }
        return primeBitSet;

    }

    public boolean isPrime(int count) {
        boolean flag = false;
        if (count == 1 || count == 0) {
            flag = true;
        } else {
            for (int b = 2; b <= count / 2; ++b) {
                // condition for nonprime number
                if (count % b == 0) {
                    flag = true;
                    break;
                }
            }
        }
        return flag;
    }
}
