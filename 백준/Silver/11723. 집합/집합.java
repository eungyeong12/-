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
        Set<Integer> set = new HashSet<>();
        StringBuilder sb = new StringBuilder();

        for(int i=0; i<n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            switch (st.nextToken()) {
                case "add":
                    int num = Integer.parseInt(st.nextToken());
                    if(!set.contains(num)) set.add(num);
                    break;
                case "check":
                    num = Integer.parseInt(st.nextToken());
                    if(set.contains(num)) sb.append("1\n");
                    else sb.append("0\n");
                    break;
                case "remove":
                    num = Integer.parseInt(st.nextToken());
                    if(set.contains(num)) set.remove(num);
                    break;
                case "toggle":
                    num = Integer.parseInt(st.nextToken());
                    if(set.contains(num)) set.remove(num);
                    else set.add(num);
                    break;
                case "all":
                    set.clear();
                    for(int j=1; j<=20; j++)
                        set.add(j);
                    break;
                case "empty":
                    set.clear();
                    break;
                default:
                    break;
            }
        }
        System.out.println(sb);
    }
}
