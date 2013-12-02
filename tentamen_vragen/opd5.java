
public class opd5 {
//	
//	 int getal = 0;
//	 boolean isColor = false;

//	public opd5(int getal, boolean isColor)
//	 {
//
//		this.getal = getal;
//		this.isColor = isColor;
//	}

	public static String kleur()
	{
		
		int getal = 0 ;
		String kleur = "";
		boolean isColor = false;
		
		if ( getal == 1){
			kleur = "Rood"; 
			
		}
		else if (getal == 2)
		{
			kleur = "Groen";
			
		}
		else if (getal == 3)
		{
			kleur = "blauw";
			
		}
		
		else if (isColor == true)
		{
			kleur = "Donker";
			
		}
		if(isColor) {

			return "Donker" + kleur;	
		}
		return kleur;
	}

}
