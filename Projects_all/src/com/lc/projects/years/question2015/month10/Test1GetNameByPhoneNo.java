package com.lc.projects.years.question2015.month10;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
/**
 * In a cell phone's keyboard, different no has different char.
 * give you a number, get the all combinations the possible.
 * @author LC
 *
 */
public class Test1GetNameByPhoneNo {
	public static void main(String[] args) {
		Map<String, List<String>> allMap = new HashMap<String, List<String>>();
		
		List<String> list1 = new ArrayList<String>();
		list1.add(" ");
		
		List<String> list2 = new ArrayList<String>();
		list2.add("A");
		list2.add("B");
		list2.add("C");
		
		List<String> list3 = new ArrayList<String>();
		list3.add("D");
		list3.add("E");
		list3.add("F");
		
		List<String> list4 = new ArrayList<String>();
		list4.add("G");
		list4.add("H");
		list4.add("I");
		
		List<String> list5 = new ArrayList<String>();
		list5.add("J");
		list5.add("K");
		list5.add("L");
		
		List<String> list6 = new ArrayList<String>();
		list6.add("M");
		list6.add("N");
		list6.add("O");
		
		List<String> list7 = new ArrayList<String>();
		list7.add("P");
		list7.add("Q");
		list7.add("R");
		list7.add("S");
		
		List<String> list8 = new ArrayList<String>();
		list8.add("T");
		list8.add("U");
		list8.add("V");
		
		List<String> list9 = new ArrayList<String>();
		list9.add("W");
		list9.add("X");
		list9.add("Y");
		list9.add("Z");
		
		List<String> list0 = new ArrayList<String>();
		list0.add("+");
		
		allMap.put("0", list0);
		allMap.put("1", list1);
		allMap.put("2", list2);
		allMap.put("3", list3);
		allMap.put("4", list4);
		allMap.put("5", list5);
		allMap.put("6", list6);
		allMap.put("7", list7);
		allMap.put("8", list8);
		allMap.put("9", list9);
		

		String phone = "3022";
		List<List<String>> noList = new LinkedList<List<String>>();
		for (int i = 0; i < phone.length(); i++) {
			String key = String.valueOf(phone.charAt(i));
			noList.add(allMap.get(key));
		}
		
		List<List<String>> result = merge(noList);
		
		System.out.println(result.get(0));
		
	}
	
	
	public static List<List<String>> merge(List<List<String>> list){
		if(list.size() < 2){
			return list;
		}else{
			List<String> list0 = list.get(0);
			List<String> list1 = list.get(1);
			list.remove(0);
			list.remove(0);
			//merger the first and second list to one
			List<String> newList = new LinkedList<String>();
			for(String s0 : list0){
				for(String  s1 : list1){
					StringBuilder sb = new StringBuilder();
					sb.append(s0);
					sb.append(s1);
					newList.add(sb.toString());
				}
			}
			list.add(0,newList);
			
			return merge(list);
			
		}
		
	}
}
