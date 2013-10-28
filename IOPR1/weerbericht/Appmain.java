public class Appmain {
	
	public static void main(String[] args) {
		//maak een nieuw weerbericht object
		
		weerbericht wb  =new weerbericht();
		
		
		//print weerbericht voor maandag, dinsdag en woensdag
		System.out.println( "Maandag" +wb.getDagBericht(1));
		System.out.println( "Dinsdag" +wb.getDagBericht(2));
		System.out.println( "Woensdag" +wb.getDagBericht(3));
		
		
	}




}
