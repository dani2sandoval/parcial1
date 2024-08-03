public class PizzaNuevaYork extends Pizza {

    public String estiloCorte;


    public PizzaNuevaYork(String nombre, String tamaño, double precio, Masa masa, Salsa salsa, Queso queso, String estiloCorte) {
        super(nombre, tamaño, precio, masa, salsa, queso);
        this.estiloCorte = estiloCorte;
    }

    @Override
    public void cortar() {
        System.out.println("Cortando pizza estilo nuevaYork");
    }
}
