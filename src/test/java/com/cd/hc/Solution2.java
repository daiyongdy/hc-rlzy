package com.cd.hc;

public class Solution2 {
	
	public static int MinOperateSteps(int x,int y, int z){
		int max = Math.max(Math.max(x, y),z);
		
		int sum = max-x+max-y+max-z;
		
		if(sum%2==0)
			return sum/2;
		else
			return (sum+3)/2;
		
	}

	public static void main(String[] args) {
		System.out.println(MinOperateSteps(1,2,4));
	}

}