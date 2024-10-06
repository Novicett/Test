import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        // 가변설정
        // List -> ArrayList 인터페이스 활용
        List<Integer> data = new ArrayList<Integer>();
        
        // i문 : array길이만큼 반복
        // j문 : array[i] number 만큼 반복
        for(int i = 0; i <arr.length; i++){
            for(int j = 0; j <arr[i]; j++){
                data.add(arr[i]);
            }
        }
        
        Integer change[] = data.toArray(new Integer[0]); // 배열로 변환
        
        int answer[] = new int[change.length];
        
        
        for(int i = 0; i < change.length; i++){
            answer[i] = change[i];
        }
        
        
        return answer;
    }
} // 계산결과 이게 더 안좋음