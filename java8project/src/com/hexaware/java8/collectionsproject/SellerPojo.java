package com.hexaware.java8.collectionsproject;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SellerPojo {
	
	
	//a. addSeller

	ArrayList<Seller> List = new ArrayList<Seller>(); 
	public void addingdetails() {
		
		Seller ob1 = new Seller(1001,"Lily","lily@gmail.com","Bangalore");
		Seller ob2 = new Seller(1002,"John","john@gmail.com","Delhi");
		Seller ob3 = new Seller(1003,"Sai","sai@gmail.com","Chennai");
		Seller ob4 = new Seller(1004,"Tom","tom@gmail.com","Chennai");
		Seller ob5 = new Seller(1005,"Rakhi","rakhi@gmail.com","Mysore");
		List.add(ob1);
		List.add(ob2);
		List.add(ob3);
		List.add(ob4);
		List.add(ob5);
	}
	
	//displayAllSellers
	public void displayallsellers()
	{
		List.stream()
		    .forEach(System.out::println);
	}
	
	//search a seller by id
	public void searchById(int id) {
		List.stream()
		    .filter((seller) -> id == seller.getID())
		    .forEach((seller) -> System.out.println(seller));
	}
	
	//delete a seller by id and display the list using foreach
	public void deleteById(int id) {
		
		List =  (ArrayList<Seller>) List.stream()
										.filter((seller) -> id != seller.getID())
										.collect(Collectors.toList());
		
		List.stream()
			.forEach((seller) -> System.out.println(seller));
	}
	
	//update a seller by id and display the list after update using foreach
	public void updateById(int id, String name, String location, String email) {
		List.stream()
			.filter((seller) -> id == seller.getID())
			.forEach((seller) -> {
								  seller.setID(id);
								  seller.setname(name);
								  seller.setemail(email);
								  seller.setlocation(location);
		});
		
		List.stream().forEach((seller) -> System.out.println(seller));

	}
	
	//displayAllSellers whose location is "Chennai"
	public void displayByLocation(String location) {
		List.stream()
			.filter((seller) -> location.equals(seller.getlocation()))
			.forEach((seller) -> System.out.println(seller));
	}
}
