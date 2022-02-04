package no.hvl.dat102.klient;

import no.hvl.dat102.Film;
import no.hvl.dat102.Filmarkiv;
import no.hvl.dat102.Filmarkiv2;
import no.hvl.dat102.Sjanger;
import no.hvl.dat102.adt.FilmarkivADT;
import static javax.swing.JOptionPane.*;

public class Tekstgrensesnitt {
	// lese opplysningene om en FILM fra tastatur
	public static Film lesFilm() {
		int filmnr = Integer.parseInt(showInputDialog("Filmnr: "));
		String produsent = showInputDialog("Produsent: ");
		String tittel = showInputDialog("Tittel: ");
		int aar = Integer.parseInt(showInputDialog("Utgivelsesår: "));
		Sjanger sjanger = Sjanger.valueOf(showInputDialog("Sjanger: "));
		String selskap = showInputDialog("Selskap: ");

		return new Film(filmnr, produsent, tittel, aar, selskap, sjanger);
	}

	// vise en film med alle opplysninger på skjerm (husk tekst for sjanger)
	public void visFilm(Film film) {
		showMessageDialog(null, film.toString());
	}

	// Skrive ut alle Filmer med en spesiell delstreng i tittelen
	public void skrivUtFilmDelstrengITittel(FilmarkivADT filma, String delstreng) {
		Film[] nyTab = filma.soekTittel(delstreng);
		for (int i = 0; i < nyTab.length; i++) {
			System.out.println(nyTab[i].toString());
		}
	}

	// Skriver ut alle Filmer av en produsent / en gruppe
	public void skrivUtFilmProdusent(FilmarkivADT filma, String delstreng) {
		Film[] nyTab = filma.soekProdusent(delstreng);
		for (int i = 0; i < nyTab.length; i++) {
			if (nyTab[i].getProdusent() == delstreng) {
				System.out.println(nyTab[i].toString());
			}
		}
	}

	// Skrive ut en enkel statistikk som inneholder antall Filmer totalt
	// og hvor mange det er i hver sjanger
	public void skrivUtStatistikk(FilmarkivADT filma) {
		String ut = "Statistikk for filmene i arkivet: \n";
		Sjanger[] sjangTab = Sjanger.values();
		for (int i = 0; i < sjangTab.length; i++) {
			ut += "Antall " + sjangTab[i].toString() + ": " + filma.antall(sjangTab[i]) + "\n";
		}
		ut += "Totalt antall filmer: " + filma.antall();
		System.out.println(ut);
	}
}