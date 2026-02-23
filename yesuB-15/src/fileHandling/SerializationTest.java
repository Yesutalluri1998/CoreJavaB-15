package fileHandling;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationTest {
	public static void main(String[] args) throws IOException {
		Customer c1=new Customer(101, "raju", 5446267625l, 123, 111); 
			System.out.println(c1);
			
	FileOutputStream fos=new FileOutputStream("D:\\Mithun Devops Videos\\Ansible\\customer.txt");
	ObjectOutputStream oos=new ObjectOutputStream(fos);

		oos.writeObject(c1);
		oos.close();
		oos.close();
		System.out.println("Serialization Done...");
	
	}
}
