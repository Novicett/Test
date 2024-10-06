class Solution {
    public int solution(int[] array, int n) {
        
        // 정답 리턴값
        int answer = 0;
        
        // 확장 for문 
        for(int num : array) {
            if(num == n) answer++;            
        }
        
        return answer;
    }
}