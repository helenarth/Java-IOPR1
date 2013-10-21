import java.util.Scanner;

public class Student {
	// de kenmerken van een Studenten, ook wel attributen of properties genoemd

	private String studentNaam;
	private String studentNummer;
	private double cijfer;
	private double[] alleCijfers;
	private Scanner input;

	public Student() {
		// maak een array van doubles, 4 elementen groot

		this.alleCijfers = new double[4];
		// maak het Scanner object

		Scanner input = new Scanner(System.in);

	}

	/*
	 * Vul de array alleCijfers met input van de user NB: op sommige systemen
	 * moet je voor een decimaal getal een punt gebruiken; op andere systemen
	 * een komma dus: 7.4 of 7,4
	 */

	public void vullCijfers() {
		// vul de array alleCijfers[] met waarden
		// we gebruiken hier alleCijfers.length; als we later de array
		// alleCijfers groter zouden maken (bijvoorbeeld: 8), dan hoeven we dat
		// hier niet
		// meer aan te passen; dat gebeurt automatisch
		for (int i = 0; i < alleCijfers.length; i++) {

			System.out.println(" Geeft een cijfer: ");
			alleCijfers[i] = input.nextDouble(); // de gebruiker voert een
													// decimaal getal (double)
													// in

		}

	}

	/*
	 * Toon alle cijfers uit de array alleCijfers
	 */

	public void toonCijfers() {

		for (int i = 0; i < alleCijfers.length; i++) {

			System.out.println(" Cijfers is ;" + alleCijfers[i]);
		}

	}

	/*
	 * bereken het gemiddelde cijfer van de cijfers uit de array alleCijfers
	 */

	public double brekenGimddeldeCijfer() {

		double gemiddelde = 0.0;
		double som = 0.0;
		// loop door alle elementen van de array alleCijfers, en tel telkens het
		// getal in het element op bij de voriabele 'som'

		for (int i = 0; i < alleCijfers.length; i++) {

			som += alleCijfers[i];

		}

		// bereken het gemiddelde

		gemiddelde = som / alleCijfers.length;

		// geef het gemiddelde terug aan de aanroeper van deze method.
		// let op: de method specificeert, dat er een double wordt teruggegeven;
		// dat kun je zien aan 'private double..." in de method signature

		return gemiddelde;
	}

	// getters and setters
	public String getStudentNaam() {
		return studentNaam;
	}

	public void setStudentNaam(String studentNaam) {
		this.studentNaam = studentNaam;
	}

	public String getStudentNummer() {
		return studentNummer;
	}

	public void setStudentNummer(String studentNummer) {
		this.studentNummer = studentNummer;
	}

	public double getCijfer() {
		return cijfer;
	}

	/*
	 * Een Setter, die nog wat meer doet dan het veranderen van de waarde van
	 * een attribuut
	 */
	public void setCijfer(double cijfer) {
		if (cijfer < 1.0) {

			cijfer = 1.0;
		}

		if (cijfer > 10.0) {

			cijfer = 10.0;

		}
		this.cijfer = cijfer;
	}

	public double[] getAlleCijfers() {
		return alleCijfers;
	}

	public void setAlleCijfers(double[] alleCijfers) {
		this.alleCijfers = alleCijfers;
	}

	public Scanner getInput() {
		return input;
	}

	public void setInput(Scanner input) {
		this.input = input;
	}

	public double geefGemiddeldeCijfer() {
		// loop door de array alleCijfers[]
		// tel alle cijfers uit de array bij elkaar op
		// de deze som door het aantal cijfer
		// geef het resultaat terug.
		return 0.0;

	}

}
