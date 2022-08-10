package com.hexaware.java8.collectionsproject;

public class Sellermain {

	public static void main(String[] args) {
		SellerPojo ob = new SellerPojo();
		ob.addingdetails();
		ob.displayallsellers();
		ob.searchById(1003);
		ob.deleteById(1002);
		ob.updateById(1001,"Virat","Indore","virat@gmail.com");
		ob.displayByLocation("chennai");
		
		
		

	}

}
