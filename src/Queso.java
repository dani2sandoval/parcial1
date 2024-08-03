public class Queso implements Ingrediente{
    public String tipo;
    public int cantidad;

    public Queso(String tipo, int cantidad) {
        this.tipo = tipo;
        this.cantidad = cantidad;
    }

    @Override
    public String obtenerNombre() {
        return tipo;
    }

    @Override
    public int obtenerCantidad() {
        return cantidad;
    }
}
