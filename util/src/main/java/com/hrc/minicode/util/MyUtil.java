package com.hrc.minicode.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.hrc.minicode.entity.MyNum;

public class MyUtil {
    private MyUtil() {
    }
    //默认初始化数据
    public static List<MyNum> getDefaultData(){
    	List<MyNum> li=new ArrayList<MyNum>();
    	MyNum num0=new MyNum(0,new String[]{""});
    	MyNum num1=new MyNum(1,new String[]{""});
    	MyNum num2=new MyNum(2,new String[]{"a","b","c"});
    	MyNum num3=new MyNum(3,new String[]{"d","e","f"});
    	MyNum num4=new MyNum(4,new String[]{"g","h","i"});
    	MyNum num5=new MyNum(5,new String[]{"j","k","l"});
    	MyNum num6=new MyNum(6,new String[]{"m","n","o"});
    	MyNum num7=new MyNum(7,new String[]{"p","q","r","s"});
    	MyNum num8=new MyNum(8,new String[]{"t","u","v"});
    	MyNum num9=new MyNum(9,new String[]{"w","x","y","z"});
    	li.add(num0);
    	li.add(num1);
    	li.add(num2);
    	li.add(num3);
    	li.add(num4);
    	li.add(num5);
    	li.add(num6);
    	li.add(num7);
    	li.add(num8);
    	li.add(num9);
    	return li;
    }
    public static Map<Integer,List<String>> myNumsToMap(List<MyNum> li){
    	Map<Integer,List<String>> result=new HashMap<Integer,List<String>>();
    	if(li!=null) {
    		for(MyNum myNum:li) {
    			List<String> letters=new ArrayList<String>();
    			if(myNum.getLetters()!=null && !myNum.getLetters().isEmpty()) {
    				for(String letter:myNum.getLetters()) {
    					letters.add(letter);
    				}
    			}else {
    				letters.add("");
    			}
    			result.put(myNum.getKey(), letters);
    		}
    	}
    	return result;
    }
}