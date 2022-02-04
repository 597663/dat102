package no.hvl.dat102;

import no.hvl.dat102.adt.FilmarkivADT;

public class Filmarkiv2 implements FilmarkivADT {
	private int antall;
	private LinearNode<Film> start;

	public Filmarkiv2() {
		start = new LinearNode<>();
		antall = 0;
	}

	public Film finnFilm(int nr) {
		LinearNode<Film> node = start;
		for (int i = 0; i < antall; i++) {
			if (node.getElement().getFilmNr() == nr) {
				return node.getElement();
			}
			node = node.getNeste();
		}
		return null;
	}

	@Override
	public void leggTilFilm(Film nyFilm) {
		LinearNode<Film> nyNode = new LinearNode<>(nyFilm);
		nyNode.setNeste(nyNode);
		start = nyNode;
		antall++;
	}

	public boolean slettFilm(int filmnr) {
		LinearNode<Film> denne = start;

		for (int i = 0; i < antall; i++) {
			if (denne.getElement().getFilmNr() == filmnr) {
				denne.setElement(start.getElement());
				start = start.getNeste();
				return true;
			}
			denne = denne.getNeste();
		}
		return false;
	}

	@Override
	public Film[] soekTittel(String delstreng) {
		int j = 0;
		LinearNode<Film> node = start;
		Film[] tittelTab = new Film[antall];

		for (int i = 0; i < antall; i++) {
			if (node.getElement().getTittel().contains(delstreng)) {
				tittelTab[j] = node.getElement();
				j++;
			}
			node = node.getNeste();
		}
		if (antall > j) {
			tittelTab = trimTab(tittelTab, j);
		}
		return tittelTab;
	}

	public Film[] soekProdusent(String delstreng) {
		Film[] prodTab = new Film[antall];
		int j = 0;
		LinearNode<Film> node = start;

		for (int i = 0; i < antall; i++) {
			if (node.getElement().getProdusent().contains(delstreng)) {
				prodTab[j] = node.getElement();
				j++;
			}
			node = node.getNeste();
		}
		if (antall > j) {
			prodTab = trimTab(prodTab, j);
		}
		return prodTab;
	}

	@Override
	public int antall(Sjanger sjanger) {
		int antallSjanger = 0;
		LinearNode<Film> node = start;

		while (node != null) {
			if (node.getElement().getSjanger().equals(sjanger)) {
				antallSjanger++;
			}
			node = node.getNeste();
		}
		return antallSjanger;
	}

	private Film[] trimTab(Film[] tab, int n) {
		Film[] nyTab = new Film[n];
		for (int i = 0; i < n; i++) {
			nyTab[i] = tab[i];
		}
		return nyTab;
	}

	@Override
	public int antall() {
		return antall;
	}

	@Override
	public void visFilm(int nr) throws Exception {
		// TODO Auto-generated method stub

	}

}