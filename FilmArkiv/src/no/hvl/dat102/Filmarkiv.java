package no.hvl.dat102;

import no.hvl.dat102.adt.FilmarkivADT;
import no.hvl.dat102.Film;

public class Filmarkiv implements FilmarkivADT {
	int antall;
	Film[] arkiv;

	public Filmarkiv(int i) {
		arkiv = new Film[i];
	}

	@Override
	public void visFilm(int nr) throws Exception {
		for (int i = 0; i < antall(); i++) {
			if (nr == arkiv[i].filmNr) {
				System.out.println(arkiv[i]);
			}
		}
		throw new Exception("Film finnes ikke i arkivet");
	}


	@Override
	public void leggTilFilm(Film nyFilm) {
		if (antall == arkiv.length) {
			utvid();
		}
		arkiv[antall] = nyFilm;
		antall++;
	}

	private void utvid() {
		Film[] tmp = (Film[]) (new Object[2 * arkiv.length]);
		for (int i = 0; i < arkiv.length; i++) {
			tmp[i] = arkiv[i];
		}
		arkiv = tmp;

	}

	@Override
	public boolean slettFilm(int filmNr) {
		for (int i = 0; i > antall; i++) {
			if (filmNr == arkiv[i].filmNr) {
				arkiv[i] = arkiv[antall - 1];
				arkiv[antall - 1] = null;
				antall--;
				return true;
			}
		}
		return false;
	}

	@Override
	public Film[] soekTittel(String delstreng) {
		Film[] resultat = new Film[antall];
		int j = 0;
		for (int i = 0; i < antall; i++) {
			if (arkiv[i].getTittel().contains(delstreng)) {
				resultat[j] = arkiv[i];
				j++;
			}
		}
		return resultat;
	}

	@Override
	public int antall(Sjanger sjanger) {
		int antallSjanger = 0;
		for (int i = 0; i < antall; i++) {
			if (arkiv[i].getSjanger().equals(sjanger)) {
				antallSjanger++;
			}
		}
		return antallSjanger;
	}

	@Override
	public int antall() {
		return antall;
	}

	@Override
	public Film[] soekProdusent(String delstreng) {
		// TODO Auto-generated method stub
		return null;
	}

}
