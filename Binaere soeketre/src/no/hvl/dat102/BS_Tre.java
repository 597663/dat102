package no.hvl.dat102;

import java.util.Iterator;

public class BS_Tre<T extends Comparable<? super T>> implements SoektreInterface<T> {

	private BinaerTreNode<T> rot;

	public BS_Tre() {
		rot = null;
	}

	public BS_Tre(T element) {
		rot = new BinaerTreNode<T>(element);
	}

	/**
	 * S�ker etter et gitt element i treet.
	 * 
	 * @param element elementet vi s�ker etter.
	 * @return true om elementet finst, false elles.
	 */
	public boolean inneholder(T element) {
		return false;
	}

	/**
	 * Henter et element i treet.
	 * 
	 * @param element elementet vi leiter etter.
	 * @return Elementet dersom det finst, elles null.
	 */
	public T finn(T element) {
		return finn(element, rot);
	}

	private T finn(T element, BinaerTreNode<T> p) {

		if (p != null) {
			int sml = element.compareTo(p.getElement());
			if (sml == 0) {
				return p.getElement();
			}
			if (sml < 0) {
				return finn(element, p.getVenstre());
			}
			if (sml > 0) {
				return finn(element, p.getHogre());
			}
		}
		return null;
	}

	/**
	 * Legg eit element til treet dersom det ikkje finst fr� f�r. Elles etstattar
	 * blir det gamle elementet erstatta med det nye.
	 * 
	 * @param nyElement elementet som skal leggast til
	 * @return null om elementet ikkje finst fr� f�r. Elles det element som var i
	 *         treet fr� f�r.
	 */
	public T leggTil(T nyElement) {
		return null;
	}

	private BinaerTreNode<T> leggTil(BinaerTreNode<T> p, T element) {
		if (p == null) {
			return new BinaerTreNode<T>(element);
		} else {
			if (element.compareTo(p.getElement()) < 0) {
				p.setVenstre(leggTil(p.getVenstre(), element));
				leggTil(p.getVenstre(), element);
			} else {
				p.setHogre(leggTil(p.getHogre(), element));

			}
		}
		return p;
	}

	/**
	 * Fjernar eit element fr� treet.
	 * 
	 * @param element elementet som skal fjernast.
	 * @return elementet som vart fjerna eller null om det ikkje finst.
	 */
	public T fjern(T element) {
		return null;
	}

	/**
	 * Lagar ein iterator som g�r gjennom alle element i treet i inorden.
	 * 
	 * @return ein iterator som elementa i sortert rekkef�lge.
	 */
	public Iterator<T> getInordenIterator() {
		return null;
	}

}
