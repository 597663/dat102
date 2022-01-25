package no.hvl.dat102;

/**
 * Karakter-eksempel.
 */
public class Karakter {

	// Beregn karakter
	// Poengsum mellom 0 and 100 (inklusive)
	public static char beregnKarakter(int poeng) throws FeilKarakterException {
		if (poeng < 0 || poeng > 100) {
			throw new FeilKarakterException("ulovlig poeng " + poeng);
		}

		if (poeng >= 90) {
			return 'A';
		} else if (poeng >= 80) {
			return 'B';
		} else if (poeng >= 60) {
			return 'C';
		} else if (poeng >= 50) {
			return 'D';
		} else if (poeng >= 40) {
			return 'E';
		} else {
			return 'F';
		}
	}
}
