package pal;

import java.util.Scanner;

public class palindromos {

    public static void main(String[] args) {
        System.out.println(verPalindromo());
    }

    static boolean verPalindromo(){
        Scanner intro = new Scanner(System.in);

        String variable = (intro.next());

        StringBuffer rev = new StringBuffer(variable).reverse();

        String strRev = rev.toString();

        return(variable.equalsIgnoreCase(strRev));
    }

}
