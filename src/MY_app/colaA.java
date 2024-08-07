package MY_app;

public class colaA {
    private int[]datos;
    private int frente;
    private int numElemento;
    
    public colaA(int tam){
        datos = new int[tam];
        frente = 0;
        numElemento = 0;
    }

    public boolean vacio() {
        return numElemento == 0;
    }

    public boolean llenar() {
        return (frente + numElemento)  == datos.length;  
    }

    public void encolar(int dato){
        if(llenar()) {
            return;
        }

        datos[frente+numElemento] = dato;
        numElemento++;
    }

    public int dessencolar() {
        if(vacio()) {
            return 0;
        }
        int aux = datos[frente];
        frente ++;
        numElemento--;
        return aux;
    }

    public void destruir(){
        frente = numElemento = 0;
    }

    public int espacioDisponible(){
        return datos.length-frente-numElemento;
    }
}

