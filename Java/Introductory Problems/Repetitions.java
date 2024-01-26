/*
Problem Statement:
    You are given a DNA sequence: a string consisting of characters A, C, G,
    and T. Your task is to find the longest repetition in the sequence. This is a
    maximum-length substring containing only one type of character. Input The
    only input line contains a string of n characters. Output Print one integer: the
    length of the longest repetition. Constraints
    1 ≤ n ≤ 106
    Example Input: ATTCGGGA
    Output: 3
*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

class Repetitions {
    public static void main(String[] args) {
        FastReader sc=new FastReader();
        PrintWriter out=new PrintWriter(System.out);
        String s = sc.next();
        int maxi = 1, count = 0, ans = 1;
        char ch = '0';
        for(char c : s.toCharArray()){
            if( ch == c ){
                count++;
            } else {
                ans = Math.max(ans, count);
                count = 1;
                ch = c;
            }
        }
        ans = Math.max(ans, count);
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