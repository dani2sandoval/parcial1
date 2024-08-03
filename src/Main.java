public class Main {
    public static void main(String[] args) {

        Masa masaDelgada = new Masa("Delgada", 100);

        Salsa salsaTomate = new Salsa("Peperoni", 100);

        Queso quesoMozzarella = new Queso("Normal", 100);

        PizzaNuevaYork pizza1 = new PizzaNuevaYork("Pizza Nueva York", "Grande", 40.00, masaDelgada, salsaTomate, quesoMozzarella, "Recto");
        pizza1.preparar();
        pizza1.hornear();
        pizza1.cortar();
        pizza1.empacar();


        Empleado empleado1 = new Empleado("Melvin", "Gerente", 5000);
        empleado1.trabajar();


        Equipo horno = new Equipo("Cocina", "Funcional");
        horno.encender();


        Sucursal sucursal = new Sucursal("PrimeraSucursal", "Bo. San Francisco");
        sucursal.agregarEspecialidad(pizza1);
        sucursal.agregarEmpleado(empleado1);
        sucursal.agregarEquipo(horno);



















    }
}
