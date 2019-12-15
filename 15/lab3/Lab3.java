package ones;

import java.util.Scanner; 

public class Lab3 {
	static int n,p;
	public static String net="";
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("VVedide chislo stranic :");
	n = sc.nextInt();
	System.out.println("Vvedite nimer stranic :");
	p = sc.nextInt();
	sc.close();

	int out = Help3.pros(n,p);
	System.out.println("S konca "+out); 
}
}