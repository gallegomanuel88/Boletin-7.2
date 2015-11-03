package bol7.pkg2;

import javax.swing.JOptionPane;

/**
 *
 * @author galle
 */
public class Comparacion {
    public short pedirNumero1 (){
        return (Short.parseShort(JOptionPane.showInputDialog("Teclea el primer numero")));
    }
    public short pedirNumero2 (){
        return (Short.parseShort(JOptionPane.showInputDialog("Teclea el segundo numero")));
    }
    public void comparar (short num1, short num2){
        if (num1>=num2)
            System.out.println(num1-num2);
        else if (num1<num2)
            System.out.println(num1+num2);
    }
}
