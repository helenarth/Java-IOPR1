
public class opdracht5 {
	
	public static String geefKleur(int kleurwaarde, boolean isLicht)
	{
		
		String kleur = " Donker";
		if(isLicht == true)
		{
			kleur = " Licht";
		}
		if(kleurwaarde == 0)
		{
			kleur+="Groen";
		}
		else if (kleurwaarde == 1)
		{
			kleur+=" Rood";
		}
		else if (kleurwaarde == 2)
		{
			kleur+=" blauw";
		}
		else{
			
			kleur+=" Grijs";
		}
	
		return kleur;
		
	}
		
	}
	


