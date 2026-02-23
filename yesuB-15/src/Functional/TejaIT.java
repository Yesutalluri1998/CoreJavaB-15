package Functional;
@FunctionalInterface
public interface TejaIT {
	
	public  abstract String tagline(String val);
	
	public static void main(String[] args) {
		//anonymous type
		TejaIT t1=new TejaIT() {
			
			@Override
			public String tagline(String val) {
				return "Teja IT".concat(" "+val);
			}
		};
		String tagline=t1.tagline("your java stope=!");
				System.out.println(tagline);
				
				System.out.println("===============");
	

TejaIT t2=(String val)->"Teja IT".concat(" "+val);

          
	

String tagline2=t2.tagline("your java stope=!");
		System.out.println(tagline2);
}
}
