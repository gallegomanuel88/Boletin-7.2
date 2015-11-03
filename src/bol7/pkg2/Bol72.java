
package bol7.pkg2;

/**
 *
 * @author galle
 */
public class Bol72 {

    public static void main(String[] args) {
        short numero1, numero2;
        Comparacion obj1 = new Comparacion ();
        numero1 = obj1.pedirNumero1();
        numero2 = obj1.pedirNumero2();
        obj1.comparar(numero1, numero2);
    }
    
}
