import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<t; i++) {
            Set<Integer> set = new HashSet<>();
            int n = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j=0; j<n; j++)
                set.add(Integer.parseInt(st.nextToken()));

            int m = Integer.parseInt(br.readLine());
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<m; j++) {
                int num = Integer.parseInt(st.nextToken());
                if(set.contains(num))
                    sb.append("1\n");
                else
                    sb.append("0\n");
            }
        }
        System.out.println(sb);
    }
}
