
package arbol_binario;

/**
 *
 * @author Ronald yesid Velasquez
 * @version 1.2
 * @fechacreacion 19-04-2020
 * @fechaactualizacion 19-04-2020
 */
        
public class Nodo
{

    private class nodoArbol //defino las variables para la raiz la posicion a la izquierda y a la derecha
    {
        private Nodo derecha;
        private Nodo izquierda;
        private int dato;

        private void nodoArbol()
        {
            derecha = null;
            izquierda = null;
            dato = 0;
        }
    }

    public nodoArbol raiz;

    public void nodo()//este metodo crea un nuevo nodo 
    {
        nodoArbol raiz = new nodoArbol();
    }

    public boolean vacio() //este metodo comprueba si el nodo no tiene ramas
    {
        return (raiz == null);
    }

    public boolean existe(int a) //verifica si un dato esta en el arbol 
    {
        if (!vacio()) //revisa que si se tenga un arbol con datos
        {
            if (a == raiz.dato) //compara el dato con la raiz, sí es igual retorna un verdadero
            {
                return true;
            }
            else //verifica si el dato es mayor o menor que la raiz
            {
                if (a < raiz.dato) 
                {
                    raiz.izquierda.existe(a); //genera la busqueda por el sub arbol izquierda, si no lo encuentre retorna un falso
                }
                else 
                {
                    raiz.derecha.existe(a); //genera la busqueda por el sub arbol derecho, si no lo encuentre retorna un falso
                }
            }
        }
        return false;
    }
    
    public void insertar(int a)//este metodo inserta datos en el arbol
    {
        if (vacio()) 
        {
            nodoArbol nuevo = new nodoArbol(); //sí esta vacio crea un arbol y carga el dato como nodo raiz en el nivel 0
            nuevo.dato = a;
            nuevo.derecha = new Nodo();//apartir del nodo raiz crea un nodo a la derecha
            nuevo.izquierda = new Nodo();//apartir del nodo raiz crea un nodo a la izquierda
            raiz = nuevo;
            System.out.println("El dato fue guardado");
        }
        else //sí no esta vacion revisa el arbol para verificar si el dato es mayor o menor que la raiz
        {
            if (existe(a)==true)
            {
                System.out.println("El dato ya existe");
            }
            else
            {
                if (a > raiz.dato) //sí el dato es mayor lo carga en un nodo a la derecha 
                {
                    (raiz.derecha).insertar(a);
                }
                if (a < raiz.dato) //sí el dato es menor lo carga en un nodo a la izquierda
                {
                    (raiz.izquierda).insertar(a);
                    System.out.println("El dato fue guardado");
                }
            }
        }
    }
    
    public void preOrder() //metodo para organizar los datos resividos en pre-Orden (raíz, izquierdo, derecho)
    {
        if (!vacio()) //revisa que si se tenga un arbol con datos
        {
            System.out.print( raiz.dato + ", "  );//imprime la raiz
            raiz.izquierda.preOrder(); //imprime el subarbol izquierdo
            raiz.derecha.preOrder(); //imprime el subarbol derecho
        }
    }

    public void inOrder() //metodo para organizar los datos resividos en in-Orden (izquierdo, raíz, derecho)
    {
        if (!vacio()) //revisa que si se tenga un arbol con datos
        {
            raiz.izquierda.inOrder(); //imprime el subarbol izquierdo
            System.out.print( raiz.dato + ", "  ); //imprime la raiz
            raiz.derecha.inOrder(); //imprime el subarbol derecho
        }
    }

    public void posOrder() //metodo para organizar los datos resividos en pos-Orden (izquierdo, derecho, raíz)
    {
        if (!vacio()) //revisa que si se tenga un arbol con datos
        {
            raiz.izquierda.posOrder(); //imprime el subarbol izquierdo
            raiz.derecha.posOrder(); //imprime el subarbol derecho
            System.out.print( raiz.dato + ", "  ); //imprime la raiz
        }
    }    
}