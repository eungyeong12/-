import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

    static Stack<Integer> stack;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        stack = new Stack<>();

        for(int i=0; i<n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            switch (st.nextToken()) {
                case "push":
                    int num = Integer.parseInt(st.nextToken());
                    stack.push(num);
                    break;
                case "top":
                    if(!stack.isEmpty()) System.out.println(stack.peek());
                    else System.out.println(-1);
                    break;
                case "size":
                    System.out.println(stack.size());
                    break;
                case "pop":
                    if(!stack.isEmpty()) System.out.println(stack.pop());
                    else System.out.println(-1);
                    break;
                case "empty":
                    if(stack.isEmpty()) System.out.println(1);
                    else System.out.println(0);
                    break;
                default:
                    break;

            }
        }
    }
}
