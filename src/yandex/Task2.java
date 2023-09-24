package yandex;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.StreamTokenizer;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

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
