package Lista;

/***
 * Clase para el manejo de Listas
 * @author jose.jaramillo
 * @since	11/11/2020
 * @version 1
 */
public class Lista {
	
	/**
	 * Clase nodo
	 * @author jose.jaramillo
	 * 
	 */
	/*
	class Nodo {
        int info;
        Nodo sig;
    }*/
    
	//Crear un objeto nodo llamado raiz
    private Nodo raiz;
    
    /**
     * Constructor de la clase
     */
    public Lista() {
        raiz=null; //Crea una lista vacia
    }
    
    /**
     * Metodo inserta nodos en una lista generica
     * @param pos
     * @param x
     */
    void insertar (int pos, int x)
    {
        //Si la posición es menor o igual que la cantidad de nodos de la lista
    	if (pos <= cantidad () + 1)    {
            Nodo nuevo = new Nodo ();
            nuevo.info = x;
            //Valida si lo inserta al inicio
            if (pos == 1){
                nuevo.sig = raiz;
                raiz = nuevo;
            } else
            	//Valida si lo inserta al final
                if (pos == cantidad () + 1)    {
                    Nodo reco = raiz;
                    while (reco.sig != null) {
                        reco = reco.sig;
                    }
                    reco.sig = nuevo;
                    nuevo.sig = null;
                } else {
                	//Lo inserta el posición definida 
                	//que no sea al inicio ni al final
                    Nodo reco = raiz;
                    for (int f = 1 ; f <= pos - 2 ; f++)
                        reco = reco.sig;
                    Nodo siguiente = reco.sig;
                    reco.sig = nuevo;
                    nuevo.sig = siguiente;
                }
        }
    }
    
    /**
     * Metodo para borrar un nodo de la lista
     * @param pos
     */
    public void borrar (int pos)
    {
        if (pos <= cantidad ())    {
            if (pos == 1) {
                raiz = raiz.sig;
            } else {
                Nodo reco;
                reco = raiz;
                for (int f = 1 ; f <= pos - 2 ; f++)
                    reco = reco.sig;
                Nodo prox = reco.sig;
                reco.sig = prox.sig;
            }
        }
    }
    
    /**
     * Metodo que extrae un nodo de la lista
     * @param pos
     * @return
     */
    public int extraer (int pos) {
        if (pos <= cantidad ())    {
            int informacion;
            if (pos == 1) {
                informacion = raiz.info;
                raiz = raiz.sig;
            } else {
                Nodo reco;
                reco = raiz;
                for (int f = 1 ; f <= pos - 2 ; f++)
                    reco = reco.sig;
                Nodo prox = reco.sig;
                reco.sig = prox.sig;
                informacion = prox.info;
            }
            return informacion;
        }
        else
            return Integer.MAX_VALUE;
    }

    /**
     * Permite intercambiar dos nodos
     * @param pos1
     * @param pos2
     */
    public void intercambiar (int pos1, int pos2) {
        if (pos1 <= cantidad () && pos2 <= cantidad ())    {
            Nodo reco1 = raiz;
            for (int f = 1 ; f < pos1 ; f++)
                reco1 = reco1.sig;
            Nodo reco2 = raiz;
            for (int f = 1 ; f < pos2 ; f++)
                reco2 = reco2.sig;
            int aux = reco1.info;
            reco1.info = reco2.info;
            reco2.info = aux;
        }
    }
    
    /**
     * Valida cual el info mayor de la lista
     * @return
     */
    public int mayor () {
        if (!vacia ()) {
            int may = raiz.info;
            Nodo reco = raiz.sig;
            while (reco != null) {
                if (reco.info > may)
                    may = reco.info;
                reco = reco.sig;
            }
            return may;
        }
        else
            return Integer.MAX_VALUE;
    }
    
    /**
     * Saca la información de la posición del Mayor
     * @return
     */
    public int posMayor() {
        if (!vacia ())    {
            int may = raiz.info;
            int x=1;
            int pos=x;
            Nodo reco = raiz.sig;
            while (reco != null){
                if (reco.info > may) {
                    may = reco.info;
                    pos=x;
                }
                reco = reco.sig;
                x++;
            }
            return pos;
        }
        else
            return Integer.MAX_VALUE;
    }

    /**
     * Consulta la cantidad de nodos de una lista
     * @return
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
     * Valida si la lista esta ordenada
     * @return
     */
    public boolean ordenada() {
        if (cantidad()>1) {
            Nodo reco1=raiz;
            Nodo reco2=raiz.sig;
            while (reco2!=null) {
                if (reco2.info<reco1.info) {
                    return false;
                }
                reco2=reco2.sig;
                reco1=reco1.sig;
            }
        }
        return true;
    }
    
    /**
     * Busca un numero en la lista y nos informa si existe o no
     * @param x
     * @return
     */
    public boolean existe(int x) {
        Nodo reco=raiz;
        while (reco!=null) {
            if (reco.info==x)
                return true;
            reco=reco.sig;
        }
        return false;
    }
    
    /**
     * Metodo para validar si la lista esta vacia
     * @return
     */
    public boolean vacia ()
    {
        if (raiz == null)
            return true;
        else
            return false;
    }
    
    /**
     * Metodo que recorre los nodos de una lista 
     * y los muestra por pantalla
     */
    public void imprimir ()
    {
        Nodo reco = raiz;
        while (reco != null) {
            System.out.print (reco.info + "-");
            reco = reco.sig;
        }
        System.out.println();
    }
	
   
}
