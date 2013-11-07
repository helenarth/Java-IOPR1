package book_e.g;

public class Listing5_4 {
public static void main(String[] args) {
	
	int x = 1;
	System.out.println(" Before the call, x is " + x);
	incremnt(x);
}

public static  void incremnt(int n) {
		n++;
		System.out.println( "\n inside the methode is" + n);
	
}
}
