package codingpractice;

import java.util.Scanner;

public class Ex02 {
    
    public static int powerMod(int a, int b, int m) {
        int result = 1;
        a = a % m;
        
        while (b > 0) {
            if (b % 2 == 1) {
                result = (result * a) % m;
            }
            b = b / 2;
            
            a = (a * a) % m;
        }
        
        return result;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        for (int i = 0; i < T; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            
            int result = powerMod(a, b, 10);
            
            if (result == 0) {
                System.out.println(10);
            } else {
                System.out.println(result);
            }
        }
        
        sc.close();
    }
}