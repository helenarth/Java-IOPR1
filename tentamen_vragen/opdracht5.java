
public class opdracht5 {
	
	/*
	 * 
	 * deze opdracht was het moeilijkste
	 * 
	 */
	// het hoeft geen main methode te zijn, je kan ook  een static string method gebruiker om iet te "Returnen " en bij void return je nix 

		public static String leeftijd()
		{
			
			String [ ] kleur = { "Grijs", "rood", "groen", "blauw", "donker", "anders" };
			boolean isColor = false ;
			int getal = 0 ;
			
				
			if ( getal == 0) 
			{
//				System.out.println("de kleur is: " + kleur[0] );
			
				return (" de kleur is " + kleur[0]);
				
								
			}
			else if ( getal == 1)
			{
				
				System.out.println("de getal is is " + kleur[1]); 
				
			}
			else if ( getal == 2 )
			{
				
				System.out.println("de kleur is " + kleur[2]);
				
			}
			else if ( isColor == true)
			{
				
				System.out.println("de kleur is" + kleur[3]);
				
			}
			else if ( isColor == false)
			{
				
				System.out.println("de kleur is" + kleur[4]);
				
			}
			else {
				
				return ("de kleur is: " +  kleur[5]);
				
			}
			return kleur[1] + isColor;
		
			
		}
		
	
		

		
		
	}
	


