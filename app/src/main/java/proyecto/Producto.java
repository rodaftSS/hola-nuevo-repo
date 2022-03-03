package proyecto;

public class Producto {

    int idProducto;
    String nombre;
    String unidadDeMedida;


    public Producto(){

    }

    public Producto(String nombre, String unidadDeMedida){
        this.nombre = nombre;
        this.unidadDeMedida = unidadDeMedida;
    }

    public void mostrarDatosProducto(){
System.out.println(nombre + " " + unidadDeMedida);
    }
    
}
