package com.hrc.minicode.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.hrc.minicode.entity.MyNum;
import com.hrc.minicode.util.MyUtil;

public class MyService {
    public static List<String> getLetters(List<MyNum> myNums,int[] input){
    	List<String> oldLetters=new ArrayList<String>();
    	if(myNums!=null && !myNums.isEmpty()) {
    		Map<Integer,List<String>> lettersMap=MyUtil.myNumsToMap(myNums);
    		for(int i:input) {
    			if(lettersMap.containsKey(i)) {
    				List<String> newLetters=lettersMap.get(i);
    				if(newLetters!=null && !newLetters.isEmpty()) {
    					//需要拼接字符
        				if(oldLetters.isEmpty()) {
        					//先初始化一个默认值
        					oldLetters.add("");
        				}
        				List<String> newResult=new ArrayList<String>();
        				for(String oldLetter:oldLetters) {
        					for(String newLetter:newLetters) {
        						newResult.add(oldLetter+newLetter);
        					}
        				}
        				if(!newResult.isEmpty()) {
        					oldLetters=newResult;
        				}
    				}
    				
    			}
    		}
    	}
    	return oldLetters;
    }
}
