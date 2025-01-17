package com.shweta.constructors;

public class ProductInformation {
	
	public int productId;
	public String productName;
	public double price;
	
	ProductInformation(int id, String name, double amount) {;
	    productId = id;
	    productName = name;
	    price = amount;
	}
	ProductInformation(int id) {;
    productId = id;
    }

	ProductInformation(){
		
	}
	public static void main(String[] args) {
		ProductInformation p = new ProductInformation(456,  "Parle            ", 10);
		ProductInformation p2 = new ProductInformation(111, "Iphone16         ", 129999.00);
		ProductInformation p3 = new ProductInformation(100, "Iphone16 pro     ", 1400000.00);
		ProductInformation p4 = new ProductInformation(400, "Iphone16 pro max ", 99999);

		System.out.println(p.productId+" "+p.productName+" "+p.price);
		System.out.println(p2.productId+" "+p2.productName+" "+p2.price);
		System.out.println(p3.productId+" "+p3.productName+" "+p3.price);
		System.out.println(p4.productId+" "+p4.productName+" "+p4.price);
		
		ProductInformation p5 = new ProductInformation(234);
		System.out.println(p5.productId);
		
		ProductInformation p6 = new ProductInformation();
		System.out.println(p6.productId+" "+p6.productName+" "+p6.price);
	}

}
