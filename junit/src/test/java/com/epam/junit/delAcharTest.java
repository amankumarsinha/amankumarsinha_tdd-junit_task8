package com.epam.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class delAcharTest {
	/* TODO 
	 * 1.AA at starting AA[A-Z]+-->[A-Z]+"
	 * 2.at the last of string [A-Z]*AA-->>"[A-Z]*AA"
	 * 3.only 1 A in starting 2 character "BACSAW":->"BCSAW"
	 * 4. only AA-->""
	 * 5.empty string--> ""
	 */

	@Test
	void test1()
	{
		 delAchar test=new delAchar();
		 String actual=test.del("AAWER");
		 assertEquals("WER",actual);
	    }
		 
		 @Test
			void test2()
		   {
				 delAchar test=new delAchar();
				 String actual=test.del("WERAA");
				 assertEquals("WERAA",actual);
		       }
				 
				 @Test
					void test3() 
				 {
						 delAchar test=new delAchar();
						 String actual=test.del("ABWER");
						 assertEquals("BWER",actual);
				      }
						 
						 @Test
							void test4() 
						    {
								 delAchar test=new delAchar();
								 String actual=test.del("AA");
								 assertEquals("",actual);
		                      }
						 @Test
							void test5() {
								 delAchar test=new delAchar();
								 String actual=test.del("");
								 assertEquals("",actual);
						 }

}
