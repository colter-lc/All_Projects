package com.lc.projects.years.question2014.month01;


/**
 * @author LC
 *
 */
//题目：古典问题：有一对兔子，从出生后第3个月起每个月都生一对兔子，小兔子长到第四个月后每个月又生一对兔子，假如兔子
//都不死，问每个月的兔子总数为多少？

//解答方法 迭代 根据规律 得到的是对数

public class Test1GetRabits {
	public static void main(String[] args) {
		int n = 4;
		System.out.println(f(n));
	}
	
	public static int f(int month){
		if(month==1 || month==2){
			return 1;
		}else{
			return f(month-1) + f(month-2);
		}
	}
}