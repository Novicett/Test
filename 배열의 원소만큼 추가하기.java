class Solution {
    public int[] solution(int[] arr) {
        
        int number = 0; // answer의 길이를 만들어주는 number
        int answerC = 0; // answer에 값을 넣기위한 변수 
        
        for(int i : arr){
            number = number + i;      
        } // 확장 for문
        
        int answer [] = new int[number]; 
        // System.out.print(number);
        
        // 이중 for문
        // i문 arr길이만큼 반복
        // j문 i의 인덱스에 있는 number만큼 반복
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i]; j ++){
                answer[answerC] = arr[i];
                answerC = answerC + 1;
            }
        }
        
        
        return answer;
    }
}