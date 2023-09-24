package yandex;

import java.io.*;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) throws IOException {
        int n = CustomReader.readInt();
        int m = CustomReader.readInt();
        int c1 = CustomReader.readInt();
        int c4 = CustomReader.readInt();

        if(n < m) {
            int k = m-n;
            if (c1 * 4 <= c4) {
                System.out.println(c1*k);
            }
            else {
                int c4Count = (int)Math.round((double)k/4);
                k -= c4Count * 4;
                if(k > 0) {
                    System.out.println(c4*c4Count + Math.min(c4,c1*k));
                }
                else
                    System.out.println(c4*c4Count);
            }
        }
        else System.out.println(0);
    }
    private static class CustomReader
    {
        private static StreamTokenizer st = new StreamTokenizer(new BufferedInputStream(System.in));
        private static Scanner sc = new Scanner(System.in);
        public static int readInt() throws IOException {
            st.nextToken();
            return (int)st.nval;
        }
        public static String readStr() {
            return sc.next();
        }
    }
}
