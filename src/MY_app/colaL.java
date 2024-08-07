package MY_app;

public class colaL {
    private Nodo frente;

    public colaL(){
        frente = null;
    }

    public boolean vacia(){
        return frente == null;
    }

    public boolean llena(){
        return false;
    }

    // Encolar tiene dos casos 
    // si Frente == null 
    // cuando frente es diferente de null  1- buscar el ultimo elemento 2- agregar despues el ultimo elemento 

    // Manera trivial
    public void encolar(){
        if(frente == null){
            frente = new Nodo(dato);
            return;
        }
        // caso 2 recorrido de arreglo 
        Nodo ultimo;
        for(ultimo=frente; ultimo.sig != null; ultimo=ultimo.sig);
        ultimo.sig = new Nodo(dato);
    }

    public int dessencolar(){
        if(frente == null ) {
            return 0;
        }

        int aux = frente.dato;
        frente = frente.sig;
        return aux;
    }

    public void destruir(){
        frente = null;
    }

    public int espacioDisponible(){
        return 1;
    }

}
