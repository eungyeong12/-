class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        boolean b = false;
        for (int i=0; i<num_list.length; i++) {
            if (num_list[i] < 0) {
                return i;
            }
        }
        return -1;
    }
}