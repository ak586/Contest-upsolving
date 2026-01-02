

public class NewOperation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T-- > 0) {
            int N = sc.nextInt();
            long[] A = new long[N];

            for (int i = 0; i < N; i++) {
                A[i] = sc.nextLong();
            }
            
            long minVal = A[0];
            for (int i = 1; i < N; i++) {
                minVal = minVal + 2 * A[i];
            }

            long maxVal = A[N - 1];
            for (int i = N - 2; i >= 0; i--) {
                maxVal = A[i] + 2 * maxVal;
            }
            System.out.println(minVal+ " "+ maxVal);
            
        }
    }
    }

