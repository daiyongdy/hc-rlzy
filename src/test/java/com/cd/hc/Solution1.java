package com.cd.hc;

public class Solution1 {
	public static String maxSubsequence( String s){
		StringBuffer subsquence = new StringBuffer("");
		for(int i = 0; i < s.length();i++){
			insert(s.charAt(i),subsquence);
		}
		return subsquence.toString();
	}

	private static void insert(char aim, StringBuffer subsquence) {
		
		int left = 0;
		int right = subsquence.length();
		int mid ;

		while(left<right){// ÓÃ¶þ·Ö²éÕÒÕÒµ½×Ó×Ö·û´®ÖÐµÚÒ»Ò»¸ö±ÈÄ¿±ê×Ö·ûÐ¡µÄ×Ö·ûËùÔÚÎ»ÖÃ
			 mid = (left+right)/2;
			if(subsquence.charAt(mid)<aim){
				right=mid;
			}
			else{
				if(left==mid)
					break;
				left = mid;
			}
		}
		
		subsquence.delete(right, subsquence.length());
		subsquence.append(aim);
		return;
	}

	public static void main(String[] args) {
		String s = "defbac";
		System.out.println(maxSubsequence(s));
	}
}