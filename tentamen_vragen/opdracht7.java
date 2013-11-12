
public class opdracht7
{
	private String naam ; 
	private int geboortejaar;
	private boolean geuvld;
	
	public opdracht7(String naam, int geboortejaar, String leeftijd)
	{
	
	this.naam= naam;
	this.geboortejaar = geboortejaar;
	this.leeftijd = leeftijd;
	
		
	}
	
	public String getnaam()
	{
		
	return naam ;
		
	}
	
	public void setnaam(String naam)
	{
		
		this.naam = naam;
		
		
	}
	
	public int getleeftijd(int huidigejaar)
	{
		
		
		return geboortejaar - huidigejaar;
		
	}
	
	
	
}
