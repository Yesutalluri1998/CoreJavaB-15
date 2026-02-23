package Collect;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Tataproducts implements Comparable<Tataproducts>{
	int id;
	String name;
	double price;
	public Tataproducts(int id, String name, double price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
}
    @Override
    public int compareTo(Tataproducts o) {
		return this.id-o.id;  //based on ID
		//return (int) (this.price-o.price);//based on price
		//return this.name.compareTo(o.name);//based on name
	}
	
    @Override
	public String toString() {
		return "Tataproducts [id=" + id + ", name=" + name + ", price=" + price + "]";
	}
public static void main(String[] args) {
	Tataproducts t1=new Tataproducts(101,"Tcs",5.5);
	Tataproducts t2=new Tataproducts(103,"Tanishqu",20.5);
	Tataproducts t3=new Tataproducts(102,"Tata salt",15.5);
	Tataproducts t4=new Tataproducts(106,"Titan",12.5);
	Tataproducts t5=new Tataproducts(105,"Tata water",40.5);
	
	List<Tataproducts>list=new ArrayList<Tataproducts>();
	                  list.add(t1);
	                  list.add(t2);
	                  list.add(t3);
	                  list.add(t4);
	                  list.add(t5);
	                  
	                  Collections.sort(list);
	                  for(Tataproducts i:list) {//t1,t2,t3,t4,t5
	                	  System.out.println(i);
	                	 // System.out.println(i.id+" "+i.name+" "+i.price);
	                	  
	                  }
	                  

	
}
 
}

