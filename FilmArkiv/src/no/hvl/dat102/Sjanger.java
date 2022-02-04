package no.hvl.dat102;

public enum Sjanger {
	ACTION, DRAMA, HISTORY, SCIFI;

	public static Sjanger finnSjanger(String navn) {
		for (Sjanger sjanger : Sjanger.values()) {
			if (sjanger.toString().equals(navn.toUpperCase())) {
				return sjanger;
			}
		}
		return null;

	}

}