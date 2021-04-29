package Collections.P01_CommonChild;


import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(lcs(sc.nextLine(), sc.nextLine()));
    }

    public static int lcs (String st1, String st2) {
        int n = st1.length();
        int m = st2.length();

        int[][] arr = new int[n+1][m+1];

        for (int i = 1; i < n+1; ++i)
            for (int j = 1; j < m+1; ++j) {
                int cur = arr[i-1][j-1] + (st1.charAt(i-1)==st2.charAt(j-1) ? 1 : 0);
                arr[i][j] = Math.max( Math.max(arr[i][j-1], arr[i-1][j]), cur);
            }

        return arr[n][m];
    }
}