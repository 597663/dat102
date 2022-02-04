package no.hvl.dat102.klient;

import no.hvl.dat102.adt.FilmarkivADT;
import no.hvl.dat102.Film;
import no.hvl.dat102.Sjanger;

public class Meny { 
	 private Tekstgrensesnitt tekstgr;  
	 private FilmarkivADT filmarkiv;  
	  
	 public Meny(FilmarkivADT filmarkiv){ 
	  tekstgr = new Tekstgrensesnitt();  
	  this.filmarkiv = filmarkiv; 
	 } 
	  
	 public void start(){ 
		 Film film1 = new Film(1, "The Godfather", "Francis Ford Coppola", 1972, "Paramount Pictures", Sjanger.ACTION);
		 Film film2 = new Film(2, "The Shawshank Redemption", "Frank Darabont", 1994, "Castle Rock Entertainment", Sjanger.DRAMA );
		 filmarkiv.leggTilFilm(film1);
		 filmarkiv.leggTilFilm(film2);
		 
		 tekstgr.skrivUtStatistikk(filmarkiv);
	 } 
	 
	} 