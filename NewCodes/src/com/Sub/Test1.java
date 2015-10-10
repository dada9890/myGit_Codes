package com.Sub;

import com.Super.GrandFather;

public class Test1 {
	public static void main(String[] args) {
		GrandFather	t=new GrandFather();
		Father r=new Father();
		System.out.println(t.a);
		//System.out.println(t.c);
		System.out.println(r.a);
		System.out.println(r.c);
		
	}

}
