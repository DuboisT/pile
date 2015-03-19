/**
 * 
 */
package pile;

/**
 * @author duboitho
 *
 */
public class main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PileEntierPositifsouNuls Pile1 = new PileEntierPositifsouNuls(2);
		PileEntierPositifsouNuls PileDefaut = new PileEntierPositifsouNuls();
		PileEntierPositifsouNuls PileNeg = new PileEntierPositifsouNuls(-4);
		
		System.out.println("La taille de PileNeg est " + PileNeg.getTaille());
		System.out.println("On depile PileDefaut " + PileDefaut.depiler());
		System.out.println("Le sommet de PileDefaut est " + PileDefaut.voirSommet());
		System.out.println("On empile 7 dans Pile1 " + Pile1.empiler(7));
		System.out.println("On empile -8 dans Pile1 " + Pile1.empiler(-8));
		System.out.println("Le sommet de Pile1 est " + Pile1.voirSommet());
		System.out.println("On empile 5 dans Pile1 " + Pile1.empiler(5));
		System.out.println("Le sommet de Pile1 est " + Pile1.voirSommet());
		System.out.println("On empile 3 dans Pile1 " + Pile1.empiler(3));
		System.out.println("Le sommet de Pile1 est " + Pile1.voirSommet());
		System.out.println("On depile Pile1 " + Pile1.depiler());
	}

}
