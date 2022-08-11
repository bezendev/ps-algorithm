class Solution {
    public boolean solution(int x) {
        String number = "" + x;
        int sum = 0;
        for(int i = 0; i < number.length(); i++) {
            sum += (number.charAt(i) - '0');
        }
        
        return x % sum == 0;
    }
}
