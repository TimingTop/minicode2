package com.hrc.minicode.entity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyNum {
	//数字
	private int key;
	private List<String> letters;//候选字母
	public int getKey() {
		return key;
	}
	public void setKey(int key) {
		this.key = key;
	}
	public List<String> getLetters() {
		return letters;
	}
	public void setLetters(List<String> letters) {
		this.letters = letters;
	}
	public MyNum(int key,String[] lettersArr) {
		this.key=key;
		letters=new ArrayList<String>(Arrays.asList(lettersArr));
	}
}
