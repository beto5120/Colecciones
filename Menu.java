
import javax.swing.*;

public class Menu {

    public static void main(String []agrs)
    {
        int op=0;
        double n1,n2,s,m,d,r;
        do{
            op=Integer.parseInt(JOptionPane.showInputDialog("\t\tCalculadora\n"+
            "************\n"+
            "\t\t[1] SUMAR\n"+
            "\t\t[2] RESTAR\n"+
            "\t\t[3] MULTIPLICAR\n"+
            "\t\t[4] DIVIDIR\n"+
            "\t\t[5] SALIR\n"+
            "\t\tIngresa una opcion:"));

            switch(op)
            {
                case 1:
                    n1=Double.parseDouble(JOptionPane.showInputDialog("Ingrese numero 1"));
                    n2=Double.parseDouble(JOptionPane.showInputDialog("Ingrese numero 2"));
                    s=n1+n2;
                    JOptionPane.showMessageDialog(null,"La suma es:"+s);
                    break;
                case 2:
                    n1=Double.parseDouble(JOptionPane.showInputDialog("Ingrese numero 1"));
                    n2=Double.parseDouble(JOptionPane.showInputDialog("Ingrese numero 2"));
                    r=n1-n2;
                    JOptionPane.showMessageDialog(null,"La resta es:"+r);
                    break;
                case 3:
                    n1=Double.parseDouble(JOptionPane.showInputDialog("Ingrese numero 1"));
                    n2=Double.parseDouble(JOptionPane.showInputDialog("Ingrese numero 2"));
                    m=n1*n2;
                    JOptionPane.showMessageDialog(null,"La multiplicacion es:"+m);
                    break;
                case 4:
                    n1=Double.parseDouble(JOptionPane.showInputDialog("Ingrese numero 1"));
                    n2=Double.parseDouble(JOptionPane.showInputDialog("Ingrese numero 2"));
                    d=n1/n2;
                    JOptionPane.showMessageDialog(null,"La division es:"+d);
                    break;

            }
        }while(op!=5);
    }

}
