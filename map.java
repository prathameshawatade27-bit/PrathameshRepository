import java.io.*;
import java.util.HashMap;

class map
{
	public static void main (String[] args) 
	{
		HashMap<Integer,String> aa=new HashMap<Integer,String>();
		aa.put(1,"prathamesh");
		aa.put(2,"Na");
        
        HashMap<Integer,String> bb=new HashMap<Integer,String>();
        bb.put(1000,"ppppp");
		bb.put(20,"ASSSS");
        bb.put(30,"PPPPP");
        aa.putAll(bb);
        System.out.println(aa);
        
        
	}
}
