package arbol_binario;
import java.util.Scanner;

/**
 *
 * @author Ronald
 */
public class Arbol_binario 
{
    public static void main(String[] args) 
    {
        Nodo n = new Nodo();
        int num;
        String r;
        String m;
        //Se solicital al usuario ingresar la raiz 
        Scanner s =new Scanner (System.in);
        System.out.println("Bienvenido");
        System.out.println("Diseñado por: Ronald Yesid Velasquez Mojica");
        System.out.println("Cod: 561217287");
        System.out.println("Cel: 3176770151");
        System.out.println("r");
        System.out.println("r");
        while (true) 
        {
            System.out.println("");
            System.out.println("Menu de opciones:");
            System.out.println("Digite su opcion deseada:");
            System.out.println("(1) para insertar dato");
            System.out.println("(2) para organizar en pre-orden");
            System.out.println("(3) para organizar en in-orden");
            System.out.println("(4) para organizar en pos-orden");
            System.out.println("(5) para organizar en pre-orden, in-orden, y pos-orden");
            System.out.println("(6) para salir");
            System.out.println("");
            m = s.next();
            
            if ("1".equals(m))
            {
                System.out.println("Ingrese un numero al arbol por favor");
                num = s.nextInt();
                n.insertar(num);
                System.out.println("");
                while (true) 
                {
                    System.out.println("¿Desea continuar?");
                    System.out.println("Para continuar digite (s) de lo contrario (n)");
                    r = s.next();

                    if ("s".equals(r)||"S".equals(r))
                    {
                        System.out.println("Ingrese un numero al arbol por favor");
                        num = s.nextInt();
                        n.insertar(num);
                    }
                    if ("n".equals(r)||"N".equals(r))
                    {
                        break;
                    }
                }
            }
          
            if ("2".equals(m))
            {
                System.out.print("Arbol en forma pre-Orden");
                n.preOrder();
                System.out.println("");
            }
            if ("3".equals(m))
            {
                System.out.print("Arbol en forma in-Orden");
                n.inOrder();
                System.out.println("");
            }
            if ("4".equals(m))
            {
                System.out.print("Arbol en forma pos-Orden");
                n.posOrder();
                System.out.println("");
            }
            if ("5".equals(m))
            {
                System.out.print("Arbol en forma pre-Orden");
                n.preOrder();
                System.out.println("");
                System.out.print("Arbol en forma in-Orden");
                n.inOrder();
                System.out.println("");
                System.out.print("Arbol en forma pos-Orden");
                n.posOrder();
                System.out.println("");
            }
            if ("6".equals(m))
            {                
                break;
            }
        }
    }        
}