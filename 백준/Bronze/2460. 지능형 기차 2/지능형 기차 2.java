import java.util.*;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        int[] num = new int[10];
        for(int i=0 ;i<10; i++) {
            count -= sc.nextInt();
            count += sc.nextInt();
            num[i] = count;
        }

        System.out.println(Arrays.stream(num).max().getAsInt());
    }
}