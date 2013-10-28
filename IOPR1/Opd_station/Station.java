public class Station {

	// attribuut voor plaatsnaam
	private String plaatsNaam;

	public Station(String PlaatsVanStation) {
		// zorg ervoor dat plaatsVanStation wordt opgeslagen in de attributen
		this.plaatsNaam = PlaatsVanStation;

	}

	// methode roepOm geeft een bericht terug over de trein in de vorm van:
	// <plaatsNaam>: De trein naar <bestemming> <gebeurtenis>

	// <gebeurtenis> wordt willekeurig vervangen door:
	// komt binnen op spoor <willekeurig getal tussen 1 en 19>
	// vertrekt over ongeveer <willekeurig getal tussen 5 en 15> minuten

	public String roepOm(String besteming) {
		String bericht = plaatsNaam + " De train naar" + besteming + " ";

		if ((int) (Math.random() * 2) % 2 == 0) {

			bericht = bericht + " komt binnen op spoor"
					+ (int) (Math.random() * 18 + 1);

		} else {

			bericht = bericht + " vertrekt over ongeveer "
					+ ((int) (Math.random() * 10 + 5) + " minuten");

		}

		return bericht;

	}

}
