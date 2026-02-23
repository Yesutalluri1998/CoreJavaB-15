package Streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.IntSummaryStatistics;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import features.Employee;

public class CollectorsTest1 {
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
		
		//==========tolist=====================
		
		
		List<EmployeeStreamsTest> javaEmplist=list.stream().filter(x->x.getDept().equalsIgnoreCase("java")).collect(Collectors.toList());
		
//		====================toset=============
		
		Set<String> depts=list.stream()
				             // .map(x->x.getdept())
				              .map(EmployeeStreamsTest::getDept)
				              .distinct()
				              .collect(Collectors.toSet());
				              
//		===================to map()=========================
				              
				              
	Map<Integer, String>map=list.stream()
	                   //     .collect(Collectors.toMap(x->x.getId(),x->x.getName()));
	                         .collect(Collectors.toMap(EmployeeStreamsTest::getId,EmployeeStreamsTest::getName));
	        System.out.println(map);  
	        
	        Map<Integer, EmployeeStreamsTest>empmap=list.stream()
	        		                          .collect(Collectors.toMap(EmployeeStreamsTest::getId, Function.identity()));
	        System.out.println(empmap);
	        
//	 ===========to collection()===========
	        
LinkedList<EmployeeStreamsTest>linkedList=list.stream()
	                       // .collect(Collectors.toCollection(()->new LinkedList<EmployeeStreamsTest>()));
	                          .collect(Collectors.toCollection(LinkedList::new));
	        
//	        ===============to joining()============

    String names=list.stream()
                      .map(EmployeeStreamsTest::getName)
                      .collect(Collectors.joining(" "));
                  
                  System.out.println(names);
                  
                  
//                  ==========counting()===========
                  
       long count=list.stream()
                      .filter(x->x.getDept().equalsIgnoreCase("java"))
                      .collect(Collectors.counting());
                  
                  System.out.println(count);
                  
//                  ===========collectingAnd then========
                  
         LinkedHashMap<Integer, EmployeeStreamsTest>linkedHashMap=list.stream()
                      .collect(Collectors.collectingAndThen(Collectors.toMap(EmployeeStreamsTest::getId,Function.identity()),LinkedHashMap::new));
	        
	        System.out.println("linkedHashMap ::"+linkedHashMap);
//	        ========maxBy and minBy==============
         Optional<Integer> max=list.stream()
             .map(EmployeeStreamsTest::getSalary)
             .collect(Collectors.maxBy(Comparator.naturalOrder()));
         System.out.println("max ::"+max);
         Optional<Integer> min=list.stream()
                 .map(EmployeeStreamsTest::getSalary)
                 .collect(Collectors.minBy(Comparator.naturalOrder()));
         System.out.println("min ::"+min);
//         ======Summing Int,Summing Long,Summing Double======
         
   Double sum1=list.stream()
                  .map(EmployeeStreamsTest::getSalary)
                  .collect(Collectors.summingDouble(x->x));
          System.out.println("sum1 ::"+sum1);
   
   Integer sum2=list.stream()
  			        .map(EmployeeStreamsTest::getSalary)
  			        .collect(Collectors.summingInt(x->x));
          System.out.println("sum2 ::"+sum2);
   
   Long sum3=list.stream()
           .map(EmployeeStreamsTest::getSalary)
           .collect(Collectors.summingLong(x->x));
         System.out.println("sum3 ::"+sum3);

  
//   ========averaging Int,Long,Double==========
   
   Double avg1=list.stream()
                   .map(EmployeeStreamsTest::getSalary)
                   .collect(Collectors.averagingLong(x->x));
          System.out.println("avg1 ::"+avg1);
   
   Double avg2=list.stream()
                  .map(EmployeeStreamsTest::getSalary)
                  .collect(Collectors.averagingInt(x->x));
          System.out.println("avg2 ::"+avg2);


   Double avg3=list.stream()
               .map(EmployeeStreamsTest::getSalary)
               .collect(Collectors.averagingDouble(x->x));
          System.out.println("avg3 ::"+avg3);

   
//   =========summerizing============
   
   DoubleSummaryStatistics dss=list.stream()
       .map(EmployeeStreamsTest::getSalary)
       .collect(Collectors.summarizingDouble(x->x));
   
      System.out.println("dss ::"+dss);
   
//           System.out.println("min ::"+dss.getMin());
//           System.out.println("max ::"+dss.getMax());
//           System.out.println("count ::"+dss.getCount());
//           System.out.println("avg ::"+dss.getAverage());
//           System.out.println("sum ::"+dss.getSum());
//				              
				           
// ====== ===grouping by=============
                    
  Map<String,List<EmployeeStreamsTest>> deptMap=list.stream()
                                 .collect(Collectors.groupingBy(EmployeeStreamsTest::getDept));
            System.out.println(deptMap);
     
//		========partitionning by=================
  
        Map<Boolean,List<EmployeeStreamsTest>> partitionBy=list.stream()
                    .collect(Collectors.partitioningBy(x->x.getSalary()>300000));
        
           System.out.println("partitionBy ::"+partitionBy);
        
        Map<String, Long> deptCount=list.stream()
            .collect(Collectors.groupingBy(EmployeeStreamsTest::getDept,Collectors.counting()));
        
           System.out.println("deptCount ::"+deptCount);
           
       Map<String, Double> deptAvg=list.stream()
               .collect(Collectors.groupingBy(EmployeeStreamsTest::getDept,Collectors.averagingDouble(EmployeeStreamsTest::getSalary)));
           System.out.println("deptAvg ::"+deptAvg);
           
//                   map.entrySet().forEach(x->x.get.getValue("dept"));
	}

}
