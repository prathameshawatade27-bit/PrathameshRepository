import java.util.HashMap;

import java.io.*;

class hash
{
	public static void main (String[] args) 
	{
		
		HashMap<Integer,String> aa=new HashMap<Integer,String>();
		aa.put(1,"prathamesh");
		aa.put(2,"prashant");
			aa.put(3,"Govind");
				aa.put(4,"Shreyash");
			
				System.out.println( aa.containsKey(4)); 
System.out.println( aa.containsValue("name"));
System.out.println(aa);

	
	}
}
