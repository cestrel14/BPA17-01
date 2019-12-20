package ones;

import java.util.Scanner; 
import java.util.function.Supplier; 
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.*; 
import java.io.IOException; 
class SomeThings		
implements Runnable		
{
	public void run()	
	{
		int out = Help3.pros(Lab3.n,Lab3.p);
		System.out.println("S konca "+out+"  из потока"); 
	}
}


public class Lab3 {
		
	
	
	
	static SomeThings mThing;
	
	static int n,p;
	public static String net="";
	public static void main(String[] args)  throws SecurityException, IOException {
		
		Logger logger 
        = Logger.getLogger( 
        		Lab3.class.getName()); 

		 Supplier <String> StrSupplier 
         = () -> new String("Logger logs"); 
		
	try {	 
	Scanner sc = new Scanner(System.in);
	System.out.println("VVedide chislo stranic :");
	
	n = sc.nextInt();
	System.out.println("Vvedite nimer stranic :");
	p = sc.nextInt();
	
	sc.close();
	
	 mThing = new SomeThings();				

	Thread myThready = new Thread(mThing);	
	myThready.start();	
	
	 Runnable runnable = () -> {int out= Help3.pros(Lab3.n,Lab3.p);
		System.out.println("S konca "+out+"  из потока 2"); 
	 };
     Thread t = new Thread(runnable);
     t.start();
	
	int out = Help3.pros(n,p);
	System.out.println("S konca "+out);
	}
	catch(Exception e){
	}
	 FileHandler handler = new FileHandler("logs.txt"); 
     logger.addHandler(handler); 

     // Log message 
     logger.info("This is Info Messsage "); 
     logger.log(Level.WARNING, 
                "Warning Message"); 
     
	 System.out.println("ne vvodite bukvi");
	 
	 logger.log(Level.SEVERE, 
             new RuntimeException("Error"), 
             StrSupplier); 
	}
	

}