class Solution {
    public int solution(String my_string) {
        int answer = 0;
        for (char c : my_string.toCharArray()) {
            if (c - '0' > 0 && c - '0' < 10) {
                answer += c - '0';
            }
        }
        return answer;
    }
}