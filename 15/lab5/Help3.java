package ones;

public class Help3 {
	public static int pros(int n, int p) {


		int i=0;
		if (p<=n/2) {
		int a=1;
		while(a<p) {
		i++;
		a=a+2;
		}
		Lab3.net="S nachala ";
		return i;
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
		Lab3.net="S konca ";
		return i;
		}
		} 
}
