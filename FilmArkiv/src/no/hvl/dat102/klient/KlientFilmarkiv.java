package no.hvl.dat102.klient;

import no.hvl.dat102.adt.FilmarkivADT;
import no.hvl.dat102.klient.Meny;
import no.hvl.dat102.Filmarkiv;

public class KlientFilmarkiv { 
	 
	 public static void main(String[] args) { 
	  FilmarkivADT filma = new Filmarkiv(100);  
	  Meny meny = new Meny(filma); 
	  meny.start(); 
	 } 
	 
	} 