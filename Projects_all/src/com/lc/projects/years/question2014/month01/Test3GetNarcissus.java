package com.lc.projects.years.question2014.month01;

/**
 * @author liangchao
 * 2014年1月6日下午10:06:53
 */

//题目：打印出所有的 "水仙花数 "，
//所谓 "水仙花数 "是指一个三位数，其各位数字立方和等于该数本身。
//例如：153是一个 "水仙花数 "，因为153=1的三次方＋5的三次方＋3的三次方。   
public class Test3GetNarcissus {
	public static void main(String[] args) {
		getAllNarcissus();
	}
	
	
	public static void getAllNarcissus(){
		for (int i = 100; i < 1000; i++) {
			judgetNarcissus(i);
		}
	}
	
	public static boolean judgetNarcissus(int n){
		if(n < 100 || n>999){
			System.out.println(n+"不能小于100,并且不能大于999");
			return true;
		}
		//得到百位数
		int hundreds = n /100 ;
		//得到十位数
		int decade = (n - hundreds * 100) /10;
		//得到个位数
		int unit = (n - hundreds * 100 - decade *10);
		
		int sumOfCube = unit*unit*unit + decade*decade*decade + hundreds*hundreds*hundreds;
		if(sumOfCube == n){
			System.out.println(n+"是水仙花数！"+ n +"="
					+hundreds+"*"+hundreds+"*"+hundreds+"+"
					+decade+"*"+decade+"*"+decade+"+"
					+unit+"*"+unit+"*"+unit);
			return true;
		}
		return false;
	}
}


