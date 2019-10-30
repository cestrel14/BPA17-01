import java.util.Scanner;

public class lab2 {
	
    public static void main(String[] args)  {
    	Scanner sc = new Scanner(System.in);
        System.out.println("Введите число страниц :");
        int n = sc.nextInt();
        System.out.println("Введите номер страницы:");
        int p = sc.nextInt();
        sc.close();
        int i=0;
        if (p<n/2) {
        	int a=0; 
        	while(a!=p) {
        		i++;
        		a++;
        	}
        	i=(i+1)/2;
        	System.out.println("С начала страниц "+i);
        	}
        else {
            int a=n;
        	if (n%2==0) {
        		
        	while(a!=p) {
        		i++;
        		a--;
        	}
        	i=(i/2)+1;
        	}
        	else {
        		while(a!=p) {
            		i++;
            		a--;
            	}
        		i=(i+1)/2;	
        	}
        	System.out.println("С конца "+i);
        	}
    }
}
