/*
Problem Statement:
    You are given all numbers between 1,2,. . . ,n except one. Your task is to
    find the missing number. Input The first input line contains an integer n. The
    second line contains n-1 numbers. Each number is distinct and between 1 and
    n (inclusive). Output Print the missing number. Constraints
    2 ≤ n ≤ 2 · 10^5
    Example Input: 5 2 3 1 5
    Output: 4
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

class MissingNumber {
    public static void main(String[] args) {
        FastReader sc=new FastReader();
        PrintWriter out=new PrintWriter(System.out);
        long n = sc.nextLong();
        long ans = n;
        //Picked XOR as bitwise operations are faster
        for(long i = 1; i< n; i++){
            long element = sc.nextLong();
            ans ^= (i ^ element);
        }
        out.print(ans);
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