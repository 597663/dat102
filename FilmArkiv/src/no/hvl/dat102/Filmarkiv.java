package no.hvl.dat102;

import no.hvl.dat102.adt.FilmarkivADT;
import no.hvl.dat102.adt.Sjanger;
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
			if (arkiv[i].equals(nr)) {
				return;
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
	public boolean slettFilm(int filmnr) {
		for (int i = 0; i > antall; i++) {
			if (arkiv[i].equals(filmnr)) {
				arkiv[i] = null;
				antall--;
				return true;
			}
		}
		return false;
	}

	@Override
	public Film[] soekTittel(String delstreng) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int antall(Sjanger sjanger) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int antall() {
		return antall;
	}

	@Override
	public boolean equals(Object obj) {
		return ((Object)this).equals(obj);
		}

	public boolean equals(Film film) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int hashCode(Film film) {
		Integer temp = film.getFilmNr(film);
		return temp.hashCode();
	}

}
