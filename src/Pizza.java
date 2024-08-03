abstract public class Pizza {

    public String nombre;
    public String tamaño;
    public double precio;
    public Masa masa;
    public Salsa salsa;
    public Queso queso;

    public Pizza(String nombre, String tamaño, double precio, Masa masa, Salsa salsa, Queso queso) {
        this.nombre = nombre;
        this.tamaño = tamaño;
        this.precio = precio;

        this.masa = masa;
        this.salsa = salsa;
        this.queso = queso;

    }

    void preparar() {
        System.out.println("Preparando...");
    }

    void hornear() {
        System.out.println("Horneando...");
    }

    void cortar() {
        System.out.println("Cortando...");
    }

    void empacar() {
        System.out.println("Cortando...");
    }
}
