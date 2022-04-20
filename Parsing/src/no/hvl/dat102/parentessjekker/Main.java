package no.hvl.dat102.parentessjekker;

public class Main implements Parentessjekker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean erVenstreparentes(char p) {
		
		if(p == ')' || p == ']' || p == '}') {
			return true;	
			}
		
		return false;
	}

	@Override
	public boolean erHogreparentes(char p) {
		if(p == '(' || p == '[' || p == '{') {
			return true;	
			}
		
		return false;
	}

	@Override
	public boolean erParentes(char p) {
		if(erVenstreparentes(p) || erHogreparentes(p)) {
			return true;
		}
		return false;
	}

	@Override
	public boolean erPar(char venstre, char hogre) {
		if(erVenstreparentes(venstre)) {
			if(erHogreparentes(hogre)){
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean erBalansert(String s) {
		// TODO Auto-generated method stub
		return false;
	}

}
