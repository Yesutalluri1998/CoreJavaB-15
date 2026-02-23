package Collect;

public class TypeCasting {
	public static void main(String[] args) {
		
		int i=10;
		long l=i;      //implicit type casting
		
		long l2=500;
		int i2=(int)l2;  //explicit type casting
		
		Object Obj="yesu";
		String s=(String)Obj;
		
		Object Obj1=22.22;
		double d=(double)Obj;
		
		Object Obj2=22.33f;
		float f=(float)Obj2;
		
		short S=123;
		byte b=(byte)S;
		
		Object Obj3='c';
		char c=(char)Obj3;
		
		
		
	}

}
