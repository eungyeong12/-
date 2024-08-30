import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][5];
        for(int i=0; i<n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j=0; j<5; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        Set<Integer> set;
        int max = 0;
        int student = 0;
        for(int i=0; i<n; i++) {
            set = new HashSet<>();
            for(int j=0; j<5; j++) {
                for(int k=0; k<n; k++) {
                    if(k==i) continue;
                    if(arr[i][j] == arr[k][j])
                        set.add(k);
                }
            }

            if(set.size() > max) {
                student = i;
                max = set.size();
            } else if(set.size() == max) {
                student = i < student ? i : student;
            }
        }

        System.out.println(student + 1);
    }
}
