package com.epam.junit;

public class delAchar {
	public String del(String test)
	{
		if(test.length()==0)
		{
		
			return "";
			
		}
		else
		{
		String l=test.substring(0,2);
		String q=test.substring(2,test.length());
		String t=l.replaceAll("A","");
		return t+q;
		}
	}
	
}
