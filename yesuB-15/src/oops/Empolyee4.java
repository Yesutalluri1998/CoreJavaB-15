package oops;

public class Empolyee4 {
	
int id;
String name;
long salary;

   public Empolyee4() {
	   System.out.println("zero arg constructor");
}
   public Empolyee4(int id,String name,long salary) {
	   
	   this.id=id;
	   this.name=name;
	   this.salary=salary;
	   
   }
   public static void main(String[] args) {
	Empolyee4 e4=new Empolyee4();
	System.out.println(e4.id+" "+e4.name+" "+e4.salary);
	
	Empolyee4 e5=new Empolyee4(20, "yesu",20000);
	System.out.println(e5.id+" "+e5.name+" "+e5.salary);
}
        



}
