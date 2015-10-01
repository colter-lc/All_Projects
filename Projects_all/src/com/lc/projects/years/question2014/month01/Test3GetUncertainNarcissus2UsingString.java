package com.lc.projects.years.question2014.month01;
/**
 * 
 * @author liangchao
 * @date 2014年1月6日下午10:26:12
 */
//题目：打印出所有的 "水仙花数 "，
//所谓 "水仙花数 "是指一个三位数，其各位数字立方和等于该数本身。
//例如：153是一个 "水仙花数 "，因为153=1的三次方＋5的三次方＋3的三次方。  
//类似于test3  得到不确定位数的“水仙花数”

//用分解字符串的方法
//n位数 为每位数的n次方之和

public class Test3GetUncertainNarcissus2UsingString {
	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		getAllNarcissus(7);
		long end = System.currentTimeMillis();
		System.out.println(end-start);
	}
	
	public static void getAllNarcissus(int digit){
		if(digit <1){
			System.out.println("传入数字不正确.");
			return;
		}
		//digit位数字最小的数字
		int small = getSmall(digit);
		System.out.println("最小的数字是:"+small);
		
		//得到最大的数字
		int big = getBig(digit);
		System.out.println("最大的数字是"+big);
		
		for (int i = small; i <= big; i++) {
			judgetNarcissus(i,digit);
		}
	}
	
	private static int getSmall(int digit){
		StringBuffer sbs = new StringBuffer();
		sbs.append("1");
		for (int i = 1; i < digit; i++) {
			sbs.append("0");
		}
		int small = Integer.parseInt(sbs.toString());
		return small;
	}
	private static int getBig(int digit){
		StringBuffer sbb = new StringBuffer();
		for (int i = 1; i <= digit; i++) {
			sbb.append("9");
		}
		int big = Integer.parseInt(sbb.toString());
		return big;
	}
	
	public static boolean judgetNarcissus(int n, int digit){
		//拼接显示数据
		StringBuffer sb = new StringBuffer();
		sb.append(n+"是水仙花数！"+ n +"=");
		
		
		String temp = String.valueOf(n);
		int sum = 0;
		for (int i = 0; i < temp.length(); i++) {
			String everyStr = temp.substring(i,i+1);
			int every = Integer.parseInt(everyStr);
			int tempProduct = 1;
			for (int j = 1; j <= digit; j++) {
				tempProduct = tempProduct*every;
			}
			sum += tempProduct;
			if(sum > n)
				return false;
			sb.append(every+"的"+digit+"次方"+"+");
		}
		if(sum == n){
			System.out.println(sb.toString().substring(0,sb.length()-1));
			return true;
		}
		return false;
	}
}
