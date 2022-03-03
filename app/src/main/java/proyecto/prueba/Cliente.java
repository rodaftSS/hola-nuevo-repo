package proyecto.prueba;
public class Cliente {

    String nombre;
    private String apellido;
    private boolean vip;

    public Cliente(){

    }

    public Cliente(String nombre){
        this.nombre = nombre;
    }

    public void setApellido(String apellido){
        this.apellido = apellido;

    }

    public String getApellido(){
        return this.apellido;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public String getNombre(){
        return this.nombre;
    }

    public void setVip(boolean vip){
        this.vip = vip;
    }

    public boolean isVip(){
        return this.vip;
    }

    public void imprimir(){
        System.out.println("nombre " + this.nombre);
    }

    
}
