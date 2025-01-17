package com.shweta.staticblock;

public class StaticNotes2 {
    static int eid;
	//initializing variables
	static {
		eid = 111;
	}
//	static void assign() {
//		eid = 333;
//	}
	static void display() {
		System.out.println("eid= "+eid);
	}
	public static void main(String[] args) {

		StaticNotes2 x = new StaticNotes2();
		//  x.assign();
		x.display();
	}

}
