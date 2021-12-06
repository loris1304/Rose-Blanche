
package roseblanche;

import java.util.Scanner;

public class RoseBlanche {
    public static void main(String[] args) {
        
        Scanner clavier = new Scanner(System.in);
	System.out.println("Saisir le montant :");
        int argent = clavier.nextInt(); 
        
        var livre = argent / 4;
 	System.out.println("Livres et Fourniture " + livre + " CHF");
        System.out.println("Vous pouvez ensuite acheter :");
        int reste = livre / 3;
        int cafe = reste / 2 ;
        int abo = reste / 4;
        int billet = reste / 3;
        int reste_café = cafe % 2;
        int reste_abo = abo % 4;
        int reste_billet = billet % 3;
        int Rose = reste_café + reste_abo + reste_billet;
 	System.out.println("Cafés " + cafe);
 	System.out.println("Abonnement " + abo);
 	System.out.println("Billet de Metro " + billet);

        System.out.println(reste_billet);
 	System.out.println("Et il vous restera " + Rose + " CHF pour les roses blanches");

    }
    
}
