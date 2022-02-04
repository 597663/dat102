package no.hvl.dat102;

public class Film {
	int filmNr;
	private String produsent;
	private String tittel;
	private int aar;
	private String selskap;
	private Sjanger sjanger;

	public Film() {

	}

	public Film(int filmNr, String produsent, String tittel, int lanseringsdato, String selskap, Sjanger sjanger) {
		this.filmNr = filmNr;
		this.produsent = produsent;
		this.tittel = tittel;
		this.aar = lanseringsdato;
		this.selskap = selskap;
		this.sjanger = sjanger;
	}

	public int getFilmNr() {
		return filmNr;
	}

	public String getProdusent() {
		return produsent;
	}

	public String getTittel() {
		return tittel;
	}

	public int getAar() {
		return aar;
	}

	public Sjanger getSjanger() {
		return sjanger;
	}

	public String getSelskap() {
		return selskap;
	}

	public void setFilmNr(int filmnr) {
		this.filmNr = filmnr;
	}

	public void setProdusent(String produsent) {
		this.produsent = produsent;
	}

	public void setTittel(String tittel) {
		this.tittel = tittel;
	}

	public void setAar(int aar) {
		this.aar = aar;
	}

	public void setSelskap(String selskap) {
		this.selskap = selskap;
	}

	public void setSjanger(Sjanger sjanger) {
		this.sjanger = sjanger;
	}

	@Override
	public boolean equals(Object film) {
		return (((Film) film).getFilmNr() == filmNr);
	}

	@Override
	public int hashCode() {
		Integer temp = filmNr;
		return temp.hashCode();
	}
}