/*
Problom Statement:
    Your task is to calculate the number of trailing zeros in the factorial n!. For
    example, 20!=2432902008176640000 and it has 4 trailing zeros. 
    Input 
        The only input line has an integer n. 
    Output 
        Print the number of trailing zeros in n!.
    Constraints
        1 <= n <= 109
    Example 
        Input: 20
        Output: 4
*/

/*
Solution:
    Since 10 = 2 * 5, number of times 5 can divide n!
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

class TrailingZeros {
    public static void main(String[] args) {
        FastReader sc=new FastReader();
        PrintWriter out=new PrintWriter(System.out);
        long n = sc.nextLong();
        long ans = 0;
        while(n >= 5) {
            ans += n/5;
            n /= 5;
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
