/*
Problem Statement:
    Consider an algorithm that takes as input a positive integer n. If n is even,
    the algorithm divides it by two, and if n is odd, the algorithm multiplies it by
    three and adds one. The algorithm repeats this, until n is one. For example,
    the sequence for n=3 is as follows:
    3 → 10 → 5 → 16 → 8 → 4 → 2 → 1
    Your task is to simulate the execution of the algorithm for a given value of
    n. Input The only input line contains an integer n. Output Print a line that
    contains all values of n during the algorithm. Constraints
    1 ≤ n ≤ 10^6
    Example Input: 3
    Output: 3 10 5 16 8 4 2 1
*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

class WeirdAlgorithm {
    public static void main(String[] args) {
        FastReader sc=new FastReader();
        PrintWriter out=new PrintWriter(System.out);
        long n = sc.nextLong();
        while ( n != 1) {
            out.print(n + " ");
            if( (n & 1) == 0) n >>= 1;
            else n = 3 * n + 1;
        }
        out.print('1');
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