package MY_app;

public class estructurasLigadas {
    public static void main(String[] args) {
        colaL l = new colaL();
        System.out.println(l.espacioDisponible());
        l.encolar();;
        l.encolar();
        l.encolar();
        System.out.println(l.espacioDisponible());

        System.out.println(l.dessencolar());
        System.out.println(l.dessencolar());
        System.out.println(l.dessencolar());
        System.out.println(l.dessencolar());

        System.out.println(l.espacioDisponible());
    }

}
