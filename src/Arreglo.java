import MY_app.colaC;

public class Arreglo {

    public static void main(String[] args) {
        colaC c = new colaC(10);
        System.out.println(c.espacioDisponible());
        c.encolar(3);
        c.encolar(2);
        c.encolar(1);
        System.out.println(c.espacioDisponible());

        System.out.println(c.dessencolar());
        System.out.println(c.dessencolar());
        System.out.println(c.dessencolar());
        System.out.println(c.dessencolar());

        System.out.println(c.espacioDisponible());
    }
}

