public class PizzaChicago extends Pizza{

    public PizzaChicago(String nombre, String tamaño, double precio, Masa masa, Salsa salsa, Queso queso, String grueso) {
        super(nombre, tamaño, precio, masa, salsa, queso);

    }

    @Override
    public void preparar() {
        System.out.println("Preparando PizzaChicago");
    }
}
