package proyecto.prueba;

import java.lang.reflect.Constructor;

public class Persona {
    String name;
    String apellidos;
    int id;
    public void constructor(){

    }
private String cancatena(){
    return name+apellidos;
}
// print que vamos a usar para pintar la persona
    public void print(){
        System.out.println("persona");
        System.out.println("datos");
    }
}