/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package proyecto.prueba;

public class App {
    public String getGreeting() {
        String varible ="rolas";
        return "Hello"+ varible;
    }

    public static void main(String[] args) {
        //se imprime
        System.out.print(new App().getGreeting());
    }
}
