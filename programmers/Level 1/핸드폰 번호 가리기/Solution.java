class Solution {
    public String solution(String phone_number) {
        String answer = "";
        String[] number_array = phone_number.split("");
        for(int i = 0; i < number_array.length; i++) {
            if(i < (number_array.length - 4)) {
                answer += "*";
            } else {
                answer += number_array[i];
            }
        }
        
        return answer;
    }
}
