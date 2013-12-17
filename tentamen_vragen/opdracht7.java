
public class opdracht7
{
	private String naam ; 
	private int geboortejaar;
	private boolean gevuld;
	private String leeftijd;
	
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
	
	public int getleeftijd()
	{
		
		
		return 2013 - this.geboortejaar;
		
	}
	
	
	
}
