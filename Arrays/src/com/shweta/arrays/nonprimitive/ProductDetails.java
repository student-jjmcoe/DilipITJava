package com.shweta.arrays.nonprimitive;

public class ProductDetails {
	public int id;
	public String name;
	public double price;
	
	public static void main(String[] args) {
		ProductDetails[] products = new ProductDetails[5];
//		ProductDetails[] products = {p1,p2,p3,p4,p5};
		products[1]= new ProductDetails();  // "shweta" no99no bcs it is an object
		 
		ProductDetails p = products[0];
		System.out.println(p);
		p = products[1];
		System.out.println(p);
		
		ProductDetails product1 = new ProductDetails();
		ProductDetails product2 = new ProductDetails();
		System.out.println(product1);
		System.out.println(product2);
		
		ProductDetails product3 = product1;//same
		System.out.println(product3);
		
		p = products[0];
		System.out.println(p);
		
		p = products[1];
		System.out.println(p.id);
		System.out.println(p.name);
		System.out.println(p.price);
		
		System.out.println();
		p.id = 999;
		p.name ="mobile";
		p.price = 9999.99;
		System.out.println(p.id);
		System.out.println(p.name);
		System.out.println(p.price);
		
		System.out.println("******************");
		
		ProductDetails p3 = new ProductDetails();
		p3.id = 111;
		p3.name = "mouse";
		p3.price =999;
		
		products[products.length-1] = p3;
		ProductDetails p4 = products[4];
		System.out.println("ID "+p4.id);
		System.out.println(p4.name);
		System.out.println(p4.price);
		
		p3.id = 999;
		System.out.println("ID "+p4.id);
		
		//printing via method
		p3.printProdectInfo(p3);
	}
	
	public void printProdectInfo(ProductDetails product) {
		System.out.println("Print via method");
		System.out.println(product.id);
		System.out.println(product.name);
		System.out.println(product.price);
	}

}
