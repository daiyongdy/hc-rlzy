package com.cd.hc;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] num = {90,124, 990};
        Arrays.sort(num);
        //排序后计算三个数中两两之间最大差n1与最小差n2
        int n1 = num[2]-num[0];
        int n2 = num[2]-num[1];
        int count = 0;
        //判断两种情况
        if((n1-n2) %2 == 1) {
            count = n2 + (n1-n2)/2 + 2;
        }
        else {
            count = n2 + (n1-n2)/2;
        }
        System.out.println(count);
    }
}