package com.lc.projects.years.question2014.month01;

// 题目：判断101-200之间有多少个素数，并输出所有素数。
public class Test2FindOdd {
	public static void main(String[] args) {
		for (int i = 101; i <= 200; i++) {
			if(isPrime(i))
				System.out.println(i);
		}
	}
	public static boolean isPrime(int n) {
		//得到平方根
		int sqrt = (int)Math.sqrt(n);
		for(int i=2; i<=sqrt; i++){
			//能否被整除
			int divide = n % i;
			if(divide == 0)
				return false;
		}
		return true;
	}
}
