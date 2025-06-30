import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Alice_Bob {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);

        int T = Integer.parseInt(br.readLine()); // Read number of test cases

        while (T-- > 0) {
            int n = Integer.parseInt(br.readLine()); // Read n
            StringTokenizer st = new StringTokenizer(br.readLine()); // Read array elements as a line

            HashSet<Integer> aSet = new HashSet<>();
            int minValA = Integer.MAX_VALUE; // Initialize with max value to find true minimum

            int[] a = new int[n]; // Store elements in an array to iterate over them
            for (int i = 0; i < n; i++) {
                int val = Integer.parseInt(st.nextToken());
                a[i] = val;
                aSet.add(val); // Add to set for O(1) average lookup
                if (val < minValA) {
                    minValA = val; // Update minimum value
                }
            }

            boolean bobWins = false;
            for (int i = 0; i < n; i++) {
                int ai = a[i];
                double sqrtAi = Math.sqrt(ai);
                int floorSqrtAi = (int) Math.floor(sqrtAi); // Cast to int truncates decimal

                // Condition 1: floor(sqrt(Ai)) is NOT in the array
                if (!aSet.contains(floorSqrtAi)) {
                    // Condition 2: There exists Aj in array such that Aj <= sqrt(Ai)
                    // We only need to check if the minimum value in A satisfies this
                    if (minValA <= sqrtAi) {
                        bobWins = true;
                        break; // Bob wins, no need to check further A_i values
                    }
                }
            }

            if (bobWins) {
                pw.println("Yes");
            } else {
                pw.println("No");
            }
        }

        pw.flush(); // Flush the output buffer
        pw.close(); // Close the print writer
        br.close(); // Close the buffered reader
    }
}