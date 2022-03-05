import java.io.*;
import java.util.*;

public class Code {
    //<--------------------------------FAST------------------------------------------------>//
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter out = new PrintWriter(System.out);
    static StringTokenizer tok;
    static int nextInt() throws IOException{
        return Integer.parseInt(next());
    }
    static long nextLong() throws IOException {
        return Long.parseLong(next());
    }
    static String next() throws IOException{
        if (tok==null || !tok.hasMoreTokens()) tok = new StringTokenizer(in.readLine());
        return tok.nextToken();
    }
    static int[] nextIntArray(int n) throws IOException {
        int[] A = new int[n];
        for (int i = 0; i < A.length; i++) A[i] = nextInt(); return A;
    }
    static long[] nextLongArray(long n) throws IOException {
        long[] A = new long[(int) n];
        for (int i = 0; i < A.length; i++) A[i] = nextLong(); return A;
    }
    //<------------------------------------------------------------------------------------>//
    public static void main(String[] args) throws IOException {
        int t = 1;
        //t = nextInt();
        while(t-->0) {
            test();
            out.flush();
        }
    }
    static void test() throws IOException{
        int[] array = {5,1,7,2,2,6,4};
        MySort sorter = new QuickSort();
        sorter.sort(array);
        System.out.println(Arrays.toString(array));
    }


}