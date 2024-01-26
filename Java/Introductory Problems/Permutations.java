/*
Problem Statement:
    A permutation of integers 1,2,. . . ,n is called beautiful if there are no adjacent
    elements whose difference is 1. Given n, construct a beautiful permutation if
    such a permutation exists. Input The only input line contains an integer n.
    Output Print a beautiful permutation of integers 1,2,. . . ,n. If there are several
    solutions, you may print any of them. If there are no solutions, print ”NO
    SOLUTION”. Constraints
    1 ≤ n ≤ 106
    Example 1 
        Input: 5
        Output: 4 2 5 3 1 
    Example 2 
        Input: 3
        Output: NO SOLUTION
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

class Permutations {
    public static void main(String[] args) {
        FastReader sc=new FastReader();
        PrintWriter out=new PrintWriter(System.out);
        /*
            For n = 1, we can achieve as there is only single element
            For n=2 & 3, we can't achieve 
            For n >= 4, we can achieve this by setting permutation with adjacent elements to hold difference 2
        */
       int n=sc.nextInt();
       if ( n == 1 ) out.print('1');
       else if ( n < 4 ) out.print("NO SOLUTION");
       else {
            for( long i = 2; i <= n; i+=2) out.print(i + " ");
            for( long i = 1; i <= n; i+=2) out.print(i + " ");
       }
       out.close();
    }
}

// For fast I/O : https://www.geeksforgeeks.org/fast-io-in-java-in-competitive-programming/
class FastReader {
    BufferedReader br;
    StringTokenizer st;

    public FastReader()
    {
        br = new BufferedReader(new InputStreamReader(System.in));
    }

    String next()
    {
        while (st == null || !st.hasMoreElements()) {
            try {
                st = new StringTokenizer(br.readLine());
            }
            catch (IOException e) {
                e.printStackTrace();
            }
        }
        return st.nextToken();
    }

    int nextInt() { return Integer.parseInt(next()); }

    long nextLong() { return Long.parseLong(next()); }

    double nextDouble() { return Double.parseDouble(next()); }

    String nextLine()
    {
        String str = "";
        try {
            if(st.hasMoreTokens()){
                str = st.nextToken("\n");
            }
            else{
                str = br.readLine();
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        return str;
    }
}