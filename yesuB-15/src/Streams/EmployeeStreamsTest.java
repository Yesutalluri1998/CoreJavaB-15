package Streams;

import java.nio.file.spi.FileSystemProvider;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class EmployeeStreamsTest {
		int id;
		String name;
		String dept;
		int salary;
		String city;
		 
		
		public EmployeeStreamsTest(int id, String name, String dept, int salary, String city) {
			super();
			this.id = id;
			this.name = name;
			this.dept = dept;
			this.salary = salary;
			this.city = city;
		}
		


		public int getId() {
			return id;
		}



		public void setId(int id) {
			this.id = id;
		}



		public String getName() {
			return name;
		}



		public void setName(String name) {
			this.name = name;
		}



		public String getDept() {
			return dept;
		}



		public void setDept(String dept) {
			this.dept = dept;
		}



		public int getSalary() {
			return salary;
		}



		public void setSalary(int salary) {
			this.salary = salary;
		}



		public String getCity() {
			return city;
		}



		public void setCity(String city) {
			this.city = city;
		}



		@Override
		public String toString() {
			return "EmployeeStreamsTest [id=" + id + ", name=" + name + ", dept=" + dept + ", salary=" + salary
					+ ", city=" + city + "]";
		}



		public static void main(String[] args) {
			EmployeeStreamsTest et1=new EmployeeStreamsTest(1,"babu","java",1800000,"hybd");
			EmployeeStreamsTest et2=new EmployeeStreamsTest(2,"raju","aws",1700000,"guntur");
			EmployeeStreamsTest et3=new EmployeeStreamsTest(3,"sai","aws",1800000,"hybd");
			EmployeeStreamsTest et4=new EmployeeStreamsTest(4, "nazeer","devops",2000000, "bangalore");
			EmployeeStreamsTest et5=new EmployeeStreamsTest(5,"manjith","java",1500000,"hybd");
			EmployeeStreamsTest et6=new EmployeeStreamsTest(6, "naveen", "aws",1900000,"chennai");
			EmployeeStreamsTest et7=new EmployeeStreamsTest(7,"bharath","sql",1600000,"hybd");
			EmployeeStreamsTest et8=new EmployeeStreamsTest(8,"nagu","java",1400000,"delhi");
			EmployeeStreamsTest et9=new EmployeeStreamsTest(9,"yaseen","java",1200000,"hybd");
			EmployeeStreamsTest et10=new EmployeeStreamsTest(10,"karthik","devops",1000000,"hybd");
			
			List<EmployeeStreamsTest> list=Arrays.asList(et1,et2,et3,et4,et5,et6,et7,et8,et9,et10);
					
			                      //    list.stream().forEach(x-> System.out.println(x));
			                      list.stream() 
			                          .filter(x->x.dept=="java")
			                          
			                          .map(x-> x.salary*0.5)
			                          .sorted()
			                          .distinct()
			                          .limit(3)
			                          .skip(1)
			       
			                          .forEach(x-> System.out.println(x));
			                      
			          System.out.println("=============================");
			                      
			          list.stream().forEach(x-> System.out.println(x));
			                     
     System.out.println("=====collect=====");
			                      
   List<Double> list1=list.stream().filter(x->x.dept=="java").map(x-> x.salary*0.5).distinct().collect(Collectors.toList());
			          System.out.println("list1 ::"+list1);
			                      
	 System.out.println("======min======");
			                      
			  double min=list.stream().mapToDouble(x-> x.salary*0.5).min().getAsDouble();
			          System.out.println("min ::"+min);
			                      
     System.out.println("======max======");
			                      
			  double max=list.stream().mapToDouble(x-> x.salary*0.5).max().getAsDouble();
			          System.out.println("max ::"+max); 
			          
//	System.out.println("============ second highest salary==========");
//	
//			  LongStream limit2=list.stream().mapToLong(x->x.salary).limit(2);
//			          System.out.println("limit2 ::"+limit2);
			                         
			                         
     System.out.println("=============count==============");
                         
			  long count=list.stream().count();
			          System.out.println("count ::"+count);
			                     	
	 System.out.println("========sum=======");
			                     	
			  long sum=list.stream().filter(x->x.dept=="java"||x.dept=="sql"||x.dept=="aws"||x.dept=="devops").map(x-> x.salary).mapToLong(x->x).sum();
			         System.out.println("sum ::"+sum);
			         
	System.out.println("======anyMatch===========");
			          
			 boolean anyMatch=list.stream().anyMatch(x->x.dept=="Html");
			      	 System.out.println("anyMatch ::"+anyMatch);
			      	 
    System.out.println("========allMatch=========");
			      	
	      	 boolean allMatch=list.stream().allMatch(x->x.salary<2500000);
			      	System.out.println("allMatch ::"+allMatch);
			      	
    System.out.println("=======noneMatch========");
    
			 boolean noneMatch=list.stream().noneMatch(x-> x.name=="suresh");
			      	System.out.println("noneMatch ::"+noneMatch);
			      	
    System.out.println("========findany========");

			 Optional<EmployeeStreamsTest> findAny=list.stream().findAny();
			    	System.out.println("findAny ::"+findAny);
			    	
    System.out.println("=========findfirst========");
			    	
		     Optional<EmployeeStreamsTest> findfirst=list.stream().findFirst();
		    	    System.out.println("findfirst ::"+findfirst);
		    	    
		    	    
		    	    
		    	     long secondHighestsalary=list.stream().map(x->x.salary)    
		    	    		                               .distinct()
		    	    		                               .sorted(Comparator.reverseOrder())
		    	    		                               .skip(1)
		    	    		                               .findFirst().get();
		    	     System.out.println("secondHighestsalary ::"+secondHighestsalary);
			    			           
		    	     
//		    	     long count1=list.stream().filter(x->x.dept=="java"||x.dept=="aws").count();
		    	     
//		    	     long deptCount=list.stream()
//		    	    		            .map(x->x.dept)
//		    	    		            .distinct()
//		    	    		            .count();
//		    	     System.out.println("dept count::"+deptCount);
//		    	    		            
		    	Map<String, Long> IndividualCount=list.stream().collect(Collectors.groupingBy(e -> e.dept, Collectors.counting()));
		    			System.out.println(IndividualCount);
		}

 
	}


