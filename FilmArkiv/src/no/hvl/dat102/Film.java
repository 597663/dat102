package no.hvl.dat102;

public class Film {
	int filmNr;
	String filmskaper;
	String tittel;
	int aar;
	String filmselskap;
	// enum sjanger;

	public Film() {
	}

	public Film(int filmNr, String filmskaper, String tittel, int aar, String filmselskap) {
		this.filmNr = filmNr;
		this.filmskaper = filmskaper;
		this.tittel= tittel;
		this.aar = aar;
		this.filmselskap = filmskaper;
//		this.sjanger = sjanger;
	}
	
	public int getFilmNr() {
		return filmNr;
	}
	
	public String getFilmskaper() {
		return filmskaper;
	}
	
	public String getTittel() {
		return tittel;
	}
	
	public int getAar() {
		return aar;
	}
	
	public String getFilmselskap() {
		return filmselskap;
	}
	
//	public enum	getSjanger() {
//		return sjanger
//	}
	
	public void setFilmNr(int filmNr) {
		this.filmNr = filmNr;
		
	}
	
	public void setFilmskaper(String filmskaper) {
		this.filmskaper = filmskaper;
		
	}
	
	public void setTittel(String tittel) {
		this.tittel= tittel;
		
	}
	
	public void setAar(int aar) {
		this.aar = aar;
		
	}
	
	public void setFilmselskap(String filmskaper) {
		this.filmselskap = filmskaper;
	}

//	public void	setSjanger(enum sjnager) {
//	this.sjanger = sjanger;
//}
	
	
}
