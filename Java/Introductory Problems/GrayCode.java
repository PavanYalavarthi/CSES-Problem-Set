/*
Problem Statement:
    Given a string, your task is to reorder its letters in such a way that it becomes a palindrome (i.e., it reads the same forwards and backwards).
    
    Input
    The only input line has a string of length n consisting of characters A–Z.
    Output
    Print a palindrome consisting of the characters of the original string. You may print any valid solution. If there are no solutions, print "NO SOLUTION".
    Constraints
    
    1 <= n <= 10^6
    
    Example
    Input:
    AAAACACBA
    
    Output:
    AACABACAA
*/

/*
Solution:
   we needed to get count of every alphabet in the string. 
   
   As we needed palindrome, maximum permissable odd count chanracter is one, where can we place that in middle

   remaining we keep placing at the extremes
*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

class GrayCode {
    public static void main(String[] args) {
        FastReader sc = new FastReader();
        PrintWriter out = new PrintWriter(System.out);
        int n = sc.nextInt();
        // Loop through all numbers from 0 to 2^n - 1
        for (int i = 0; i < (1 << n); i++) {
            // Calculate Gray code using the formula: i ^ (i >> 1)
            int gray = i ^ (i >> 1);
            
            // Convert to binary string and pad with leading zeros
            String binary = Integer.toBinaryString(gray);
            String paddedBinary = String.format("%" + n + "s", binary).replace(' ', '0');
            
            out.println(paddedBinary);
        }
        out.close();
    }
}

// Fast input reader for handling large inputs efficiently
class FastReader {
    BufferedReader br;
    StringTokenizer st;

    public FastReader() {
        br = new BufferedReader(new InputStreamReader(System.in));
    }

    String next() {
        while (st == null || !st.hasMoreElements()) {
            try {
                st = new StringTokenizer(br.readLine());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return st.nextToken();
    }

    int nextInt() {
        return Integer.parseInt(next());
    }

    long nextLong() {
        return Long.parseLong(next());
    }

    double nextDouble() {
        return Double.parseDouble(next());
    }

    String nextLine() {
        String str = "";
        try {
            if (st.hasMoreTokens()) {
                str = st.nextToken("\n");
            } else {
                str = br.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return str;
    }
}