import java.io.*;
import java.util.*;

public class TemperatureBalance {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine()); // Number of test cases

        while (T-- > 0) {
            int N = Integer.parseInt(br.readLine()); // Number of chambers
            String[] input = br.readLine().split(" ");

            int[] A = new int[N];
            for (int i = 0; i < N; i++) {
                A[i] = Integer.parseInt(input[i]);
            }

            // Calculate the minimum seconds needed
            long result = calculateMinimumSeconds(A, N);
            sb.append(result).append("\n");
        }

        System.out.print(sb.toString());
    }

    private static long calculateMinimumSeconds(int[] A, int N) {
        long totalMoves = 0;
        long imbalance = 0;

        for (int i = 0; i < N; i++) {
            imbalance += A[i];
            totalMoves += Math.abs(imbalance);
        }

        return totalMoves;
    }
}
