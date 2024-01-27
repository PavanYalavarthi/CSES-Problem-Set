/*
Problem Statement:
    A number spiral is an infinite grid whose upper-left square has number 1.
    Here are the first five layers of the spiral:
                    1 2 9 10 25
                    4 3 8 11 24
                    5 6 7 12 23
                    16 15 14 13 22
                    17 18 19 20 21
    Your task is to find out the number in row y and column x.
    Input
        The first input line contains an integer t: the number of tests.
        After this, there are t lines, each containing integers y and x.
    Output
        For each test, print the number in row y and column x.
    Constraints
        1 ≤ t ≤ 10^5
        1 ≤ y, x ≤ 10^9
    Example 
        Input: 3 2 3 1 1 4 2
        Output: 8 1 15
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

class NumberSpiral {
    public static void main(String[] args) {
        FastReader sc=new FastReader();
        PrintWriter out=new PrintWriter(System.out);
        long n = sc.nextLong();
        for(long i  = 0; i<n;i++) {
            long row = sc.nextLong(), col = sc.nextLong();
            if( row > col ){
                if( row % 2 == 1) out.println((row - 1) * (row -1) + col );
                else out.println(row * row - col + 1);
            } else {
                if( col % 2 == 1) out.println( col * col - row + 1);
                else out.println((col - 1) * (col - 1) + row );
            }
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