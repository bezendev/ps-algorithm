class Solution {
    // x의 타입은 int가 아니라 long이어야 한다. 
    public long[] solution(long x, int n) {
        long[] answer = new long[n];

        for(int i = 0; i < n; i++){
            answer[i] = x * (i + 1);
        }

        return answer;
    }
}
