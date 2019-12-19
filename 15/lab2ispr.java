package ones;

import java.util.Scanner;

public class lab2 {

    public static void main(String[] args)  {
    	Scanner sc = new Scanner(System.in);
        System.out.println("VVedide chislo stranic :");
        int n = sc.nextInt();
        System.out.println("Vvedite nimer stranic :");
        int p = sc.nextInt();
        sc.close();
        int i=0;
        if (p<=n/2) {
        	int a=1; 
        	while(a<p) {
        		i++;
        		a=a+2;
        	}

        	System.out.println("S nachala  "+i);
        	}
        else {
            int a=n;
        	if (n%2==0) {

        	while(a>p) {
        		i++;
        		a=a-2;
        	}

        	}
        	else {
        		a=a-2;
        		while(a>p) {
            		i++;
            		a=a-2;
            	}

        	}
        	System.out.println("S konca "+i);
        	}
    }
}
