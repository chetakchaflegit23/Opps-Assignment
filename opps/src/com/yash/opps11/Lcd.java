package com.yash.opps11;

import java.util.Date;

public class Lcd extends Electronics 
{
	public void lcddetails()
	{
		Electronics el1=new Electronics();
		
		el1.setId(101);
		el1.setSemiconductor_type("one plus");
		el1.setDateofmanufacturing(new Date(21/04/2002));
		
		System.out.println(el1.getId());
		System.out.println(el1.getSemiconductor_type());
		System.out.println(el1.getDateofmanufacturing());		
	}
}
