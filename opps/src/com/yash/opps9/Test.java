package com.yash.opps9;

public class Test 
{
	 public static void main(String[] args) throws CloneNotSupportedException 
	 {
	             
		 Product pr=new Product(111, "Oreo", 10, "Gram");
		         
		         Product pro=(Product) pr.clone();
		         pro.setPname("JimJam");
		         pro.setPrice(34353);
		         
		         System.out.println(pro);
		         if(pro instanceof Product) {
		             
		             System.out.println("Objects are same");
		         }
		             
		     }
}
