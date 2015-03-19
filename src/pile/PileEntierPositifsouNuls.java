package pile;

public class PileEntierPositifsouNuls
{
	private static final int TAILLE_DEFAUT = 5;
	private static final int QUANTITE_DEPART = 0;
	public static final int ERREUR_PILE_PLEINE = -1;
	public static final int ERREUR_PILE_VIDE = -2;
	public static final int ERREUR_ELEMENT_NEGATIF = -3;
	
	private final int taille;
	private int quantite;
	private int elements[];
	
	public PileEntierPositifsouNuls(int taille)
	{
		this.taille = taille < 0 ? TAILLE_DEFAUT : taille;
		this.quantite = QUANTITE_DEPART;
		this.elements = new int[this.taille];
	}

	public PileEntierPositifsouNuls()
	{
		this(TAILLE_DEFAUT);
	}

	/**
	 * @return the taille
	 */
	public int getTaille()
	{
		return this.taille;
	}

	/**
	 * @return the quantite
	 */
	public int getQuantite()
	{
		return this.quantite;
	}
	
	public int empiler(int element)
	{
		if (element < 0)
			return ERREUR_ELEMENT_NEGATIF;
		if (this.quantite == this.taille)
			return ERREUR_PILE_PLEINE;

		this.elements[this.quantite++] = element;
		return element;
	}
	
	public int depiler()
	{
		if (quantite == 0)
			return ERREUR_PILE_VIDE;
		return this.elements[--this.quantite];
	}
	
	public int voirSommet() {
		return quantite == 0 ? ERREUR_PILE_VIDE : this.elements[this.quantite-1];
	}
}
