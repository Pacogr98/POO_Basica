package poo_basica.Ejercicio1;

public class Smartphone {
    
    // PRIVATE : significa que la variable solo puede ser accedida directamente desde dentro de la misma clase en la que está declarada
    // En caso de querer acceder a ellas les generaremos los métodos getters y setters pertinentes. Aquí no hace falta ponerlo, pero que os vayan sonando.
    // FINAL : significa que es una constante y no se puede cambiar su valor una vez asignado, Ccomo todos los smartphone tendrán el mismo peso y megapixeles la ponemos así.
    private final double peso = 133.3;
    private final int mpxCamara = 12;
    private int ram;
    private double pulgadas, espacioDisco;
    private String marca, modelo;
    private boolean estado; // Nos indicará si está encendido o apagado --> False = Apagado | True = Encendido
    
    //Constructor base - Acostumbrarse a ponerlo
    public Smartphone() {}
    //Constructor
    public Smartphone(int ram, double pulgadas, double espacioDisco, String marca, String modelo) {
        this.ram = ram;
        this.pulgadas = pulgadas;
        this.espacioDisco = espacioDisco;
        this.marca = marca;
        this.modelo = modelo;
        this.estado = false; //No lo pedimos por parámetro y siempre lo instanciaremos como apagado.
    }

    public String encender(){
       if(estado){
           return "El dispositivo ya está encendido...\n";
       }else{
           this.estado = true;
           return this.toString();
       }
    }
    
    public String apagar(){
       if(!estado){
           return "El dispositivo ya está apagado...\n";
       }else{
           this.estado = false;
           return "Apagando dispositivo...\n";
       }
    }
    
    @Override
    public String toString(){ //Nos muestra un resumen de las características del dispositivo le ponemos String para decirle que va a devolver una cadena de texto
        return "Marca: "+this.marca+"\nModelo: "+this.modelo+"\nEspacio en disco: "+this.espacioDisco+"\n";
    }
}
