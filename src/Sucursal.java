public class Sucursal {
    public String nombre;
    public String direccion;
    public String empleados;
    public String ingredientes;
    public String equipos;
    public String especialidades;

    public Sucursal(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;

    }

    public void agregarEmpleado(Empleado empleado) {
        System.out.println("Empleado " + empleado + " agregado.");
    }

    public void agregarIngrediente(Ingrediente ingrediente) {
       System.out.println("Ingrediente " + ingrediente.obtenerNombre() + " agregado.");
    }

    public void agregarEquipo(Equipo equipo) {
        System.out.println("Equipo " + equipo + " agregado.");
    }

    public void agregarEspecialidad(Pizza pizza) {
        System.out.println("Especialidad " + pizza + " agregada.");
    }
}
