package yandex;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.StreamTokenizer;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) throws IOException {
        int n = CustomReader.readInt();
        int[] mass = new int[n+1];
        mass[0] = 1;
        int ans = 0;

        for (int i = 1;i<=n;i++){
            int Ri = CustomReader.readInt();
            mass[i] = mass[Ri] + 1;
            ans = Math.max(ans,mass[i]);
        }
        System.out.println(ans);
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
