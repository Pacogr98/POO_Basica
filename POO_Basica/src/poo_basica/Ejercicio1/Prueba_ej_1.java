
package poo_basica.Ejercicio1;


public class Prueba_ej_1 {

    public static void main(String[] args) {
        
        Smartphone samsung = new Smartphone(8,6.2,128,"Samsung","Galaxy 6"); //Así es como instanciamos el objeto
        //Aquí mostramos por pantalla la llamada de los métodos
        System.out.println(samsung.encender());
        System.out.println(samsung.encender());
        System.out.println(samsung.apagar());
        System.out.println(samsung.apagar());
        System.out.println(samsung.encender());

    }

}
