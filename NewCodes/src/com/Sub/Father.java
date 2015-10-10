package com.Sub;

import com.Super.GrandFather;

public class Father extends GrandFather {
	public int a=7;
	public int c=9;
	public int add1()
	{
		int d=a*c;
		return d;
	}

}
