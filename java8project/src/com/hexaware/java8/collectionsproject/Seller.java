package com.hexaware.java8.collectionsproject;
import java.util.ArrayList;
import java.util.List;

public class Seller {

	int ID;
	String name;
	String email;
	String location;
	
	Seller(int id, String nm, String mail, String loc)
	{
		ID = id;
		name = nm;
		email = mail;
		location = loc;
	}
	//getter methods
	public int getID()
	{
		return ID;
	}
	
	public String getname()
	{
		return name;
	}
	
	public String getemail()
	{
		return email;
	}
	
	public String getlocation()
	{
		return location;
	}
	
	//setter methods
	public void setID(int ID)
	{
		this.ID=ID;
	}
	
	public void setname(String name)
	{
		this.name=name;
	}
	
	public void setemail(String email)
	{
		this.email=email;
	}
	
	public void setlocation(String location)
	{
		this.location=location;
	}
	
	
}




