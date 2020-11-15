package algorithm;

import java.util.Arrays;

//나누어 떨어지는 숫자 배열 (프로그래머스)
//https://programmers.co.kr/learn/courses/30/lessons/12910
//
//제한사항
//arr은 자연수를 담은 배열입니다.->ok
//정수 i, j에 대해 i ≠ j 이면 arr[i] ≠ arr[j] 입니다.
//divisor는 자연수입니다.->ok
//array는 길이 1 이상인 배열입니다.


class Solution {
    public int[] solution(int[] arr, int divisor) {
       
    	int[] temp;
    	int[] arr2;
    	int count = 0;
    	
    	for (int i = 0; i < arr.length; i++) {
    		if (arr[i] % divisor == 0) {
    			count++;
    		}
    	}
    	
    	if (count == 0) {
			temp = new int[1];
			temp[0] = -1;
			return temp;
		}
    	
    	arr2 = new int[count];
    	
    	for (int i = 0; i < arr.length; i++) {
    		if (arr[i] % divisor == 0) {
    			for (int j = 0; j < count; j++ ) { 
    				arr2[j] = arr[i]; 
    			}
    		}
    	}
    	
    	Arrays.sort(arr2);
		return arr2;
    	
	
		
    	
   	}
 }

public class P12910 {

	public static void main(String[] args) {
		Solution s = new Solution();
		s.solution(IntArray, Divisor);
		

	}

}
