package Pattern;

import java.util.Scanner;

public class AlphabetSquare3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
        for (int i = 1 ; i<=n ; i++){
             char ch;
             if ( i % 2 == 0) {
                 ch = (char) (i + 64);
             }else {
                 ch = (char) (i+ + 96);
             }

        for (int j =1 ; j<=n ; j++){

            System.out.print(ch + " ");
        }
        System.out.println();
    }
}
}
