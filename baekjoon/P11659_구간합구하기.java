import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P11659_구간합구하기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int countNum = Integer.parseInt(st.nextToken());
        int askNum = Integer.parseInt(st.nextToken());
        long[] S = new long[countNum + 1];
        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= countNum; i++) {
            S[i] = S[i-1] + Integer.parseInt(st.nextToken());
        }
        for (int q = 0; q < askNum; q++) {
            st = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());
            System.out.println(S[j] - S[i-1]);
        }
    }
}
