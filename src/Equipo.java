public class Equipo {

    public String tipo;
    public String estado;

    public Equipo(String tipo, String estado) {
        this.tipo = tipo;
        this.estado = estado;
    }

    public void encender() {
        System.out.println("Encendiendo");
        estado = "Encendido";
    }

    public void apagar() {
        System.out.println("Apagando");
        estado = "Apagado";
    }

    public void reparar() {
        System.out.println("Reparando");
        estado = "En reparación";
    }
}
