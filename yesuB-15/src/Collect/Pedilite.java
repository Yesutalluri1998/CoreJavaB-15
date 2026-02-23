package Collect;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import javax.swing.border.AbstractBorder;

public class Pedilite {
	Integer pid;
	String pname;
	Double price;
	public Pedilite(Integer pid, String pname, Double price) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Pedilite [pid=" + pid + ", pname=" + pname + ", price=" + price + "]";
	}

	public static void main(String[] args) {
		Pedilite p1=new Pedilite(102,"fevicol",10.5);
		Pedilite p2=new Pedilite(103,"fevikewik",5.5);
		Pedilite p3=new Pedilite(101,"anabond",12.5);
		Pedilite p4=new Pedilite(104,"gum",40.5);
		
		List<Pedilite>list=Arrays.asList(p1,p2,p3,p4);
		//BasedonId onId=new BasedonId();
	    //Collections.sort(list,new BasedonId);
		//Collections.sort(list,new BasedonPrice());
		//Collections.sort(list,new Basedname());
 		String property="price";
		String orderType="ACS";
		
		if(property.equals("pname")) {
			Collections.sort(list, new Basedname());
		}
		else if(property.equals("pid")) {
			Collections.sort(list,new BasedonId());
		}
		else if (property.equals("price")){
			Collections.sort(list,new BasedonPrice());
			
		}
		
		if(orderType.equals("DESC")) {
			Collections.reverse(list);
		}
		for(Pedilite p:list) {
			System.out.println(p);
		 
	}
  
	}
}

