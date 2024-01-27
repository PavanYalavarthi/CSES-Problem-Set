/*
Problem Statement:
    Your task is to divide the numbers 1,2,. . . ,n into two sets of equal sum.
    Input:
        The only input line contains an integer n. 
    Output:
        Print ”YES”, if the division is possible, and ”NO” otherwise. 
        After this, if the division is possible, print an example of how to create the sets. 
        First, print the number of elements
        in the first set followed by the elements themselves in a separate line, and then,
        print the second set in a similar way. 
    Constraints:
        1 <= n <= 10^6
    Example 1:
        Input: 
            7
        Output: 
            YES 
            4 
            1 2 4 7 
            3 3 5 6 
    Example 2 :
        Input: 
            6
        Output: 
            NO
*/

/*
Solution:
    Logic here is to give both the extremes to sets alternatively i.e., 1 & n goes to set 1 and 2 & (n-1) goes to set 2 ...
    So, the numbers need to get divided by 4 as 4 numbers are poped up for each round.
    If % 4 = 0, means we can distribute numbers as per above logic
    If % 4 = 1, means 1 number is remaining at end, which cant be given to any set, so no possibility
    If % 4 = 2, means 2 numbers are remaining, even if each is distributed among to 2 sets, we cant achieve equal sum
    If % 4 = 3, means 3 number are remaining. We can distribute this if one number = sum of other 2. Or simply give 1,2 to one set 
        and 3 to other. Now you left with count of numbers divisible by 4. And start spliting. Only difference is this time the numbers are 4,5...n
*/


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

class TwoSets {
    public static void main(String[] args) {
        FastReader sc=new FastReader();
        PrintWriter out=new PrintWriter(System.out);
        long n = sc.nextLong();
        if(n%4 == 1 || n%4 == 2) out.println("NO");
        else{
            out.println("YES");
            long start = 1;
            if(n%4 == 3) {
                out.println((n+1) / 2);
                out.print(1 + " " + 2 + " ");
                start = 4;
            } else{
                out.println(n/2);
            }
            for(long i= start,j=n;i<j;i+=2,j-=2){
                out.print(i + " " + j + " ");
            }
            out.println();
            out.println(n/2);
            if(start == 4) out.print(3 + " ");
            for(long i= start+1,j=n-1;i<j;i+=2,j-=2){
                out.print(i + " " + j + " ");
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