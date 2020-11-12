package Clase6;

public class Lista {

    class Nodo {
        String nombre;
        Nodo sig;
    }
    private Nodo raiz; //Crear la lista vacia

    /**
     * Constructor de la clase
     */
    public Lista () {
        raiz=null; //Crea una lista vacia
    }

    /**
     * Calcula la cantidad de nodos que tiene una lista
     * @return cantidad
     */
    public int cantidad ()
    {
        int cant = 0;
        Nodo reco = raiz;
        while (reco != null) {
            reco = reco.sig;
            cant++;
        }
        return cant;
    }

    /**
     * Metodo para insertar información (nodos)
     * a una lista
     * @param pos      posicion donde quiero almacenar los datos (nodo)
     * @param nombreP  el valor a almacenar en el nodo
     */
    void insertar (int pos, String nombreP)
    {
        if (pos <= cantidad () + 1)    {
            Nodo nuevo = new Nodo ();
            nuevo.nombre = nombreP;
            if (pos == 1){
                nuevo.sig = raiz;
                raiz = nuevo;
            } else
            if (pos == cantidad () + 1)    {
                Nodo reco = raiz;
                while (reco.sig != null) {
                    reco = reco.sig;
                }
                reco.sig = nuevo;
                nuevo.sig = null;
            } else {
                Nodo reco = raiz;
                for (int f = 1 ; f <= pos - 2 ; f++)
                    reco = reco.sig;
                Nodo siguiente = reco.sig;
                reco.sig = nuevo;
                nuevo.sig = siguiente;
            }
        }
    }

}
