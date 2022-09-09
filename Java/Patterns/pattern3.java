/*

*                       *
*   *               *   *
*   *   *       *   *   *
*   *   *   *   *   *   *

*/

import java.util.Scanner;

class pattern3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k=n+1;
        int l=1;
        for(int i = 1; i<=n; i++) {
            for(int j=l;j>0;j--) {
                System.out.print("*\t");
            }
            for(int j=k;j>0;j--) {
                System.out.print("\t");
            }
            if(i==n) l--;            
            for(int j=l;j>0;j--) {
                    System.out.print("*\t");
            }
            System.out.println();
            k-=2;
            l++;
        }
        
    }
}