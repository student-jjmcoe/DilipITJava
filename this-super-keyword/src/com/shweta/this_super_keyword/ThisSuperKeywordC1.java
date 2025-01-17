package com.shweta.this_super_keyword;

public class ThisSuperKeywordC1 extends ThisSuperKeywordP1 {

	int a = 100;
	int b = 200;
	public void m1(int a , int b) {
		System.out.println(a+b);
		System.out.println(this.a+this.b);
		System.out.println(super.a+super.b);
	}
	public static void main(String[] args) {
		ThisSuperKeywordC1 p = new ThisSuperKeywordC1();
		p.m1(11,22);

	}

}
