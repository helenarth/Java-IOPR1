public class TentamenApp {

	public static void main(String[] args) {
		// maak een nieuw object Student
		Student student = new Student();

		// gebruik de Setters van Student om de attributen van het object
		// Student waarden te geven

		student.setStudentNaam(" String");
		student.setStudentNummer(" s1079712");
		student.setCijfer(0.0);

		// roep een method op het object Student aan

		student.vullCijfers();

		// nu de waarden van de attributen van het object Student printen
		// gebruik hiervoor de Getters van het object
		
		System.out.println("StudentNaam:  " + student.getStudentNaam());
		System.out.println("Student nummer:" + student.getStudentNummer());
		System.out.println("Student cijfer:" + student.getCijfer());
		
		// weer een method aanroepen op object Student
		
		student.toonCijfers();
		
		// hier roepen we ook een method aan, maar dan 'verpakt' in een print opdracht
		System.out.println(" gemiddelde cijfer : " + student.brekenGimddeldeCijfer());
		
		
	}
}
