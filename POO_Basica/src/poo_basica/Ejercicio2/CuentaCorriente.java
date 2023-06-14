
package poo_basica.Ejercicio2;

public class CuentaCorriente {
    private double saldo;
    private double limiteDescubierto;
    private String nombreTitular;
    private String dniTitular;
    private final String banco = "Mr Franklyn Bank";

    // Constructor sin parámetros
    public CuentaCorriente() {
        this.saldo = 0;
        this.limiteDescubierto = -100;
        this.nombreTitular = "Sin datos";
        this.dniTitular = "Sin datos";
    }

    // Constructor con saldo inicial - Crear varios constructores se le llama SOBRECARGA , que vayan sonando estos conceptitos
    public CuentaCorriente(double saldoInicial) {
        this.saldo = saldoInicial;
        this.limiteDescubierto = 0;
        this.nombreTitular = "Sin datos";
        this.dniTitular = "Sin datos";
    }

    // Constructor con saldo inicial, límite descubierto y DNI
    public CuentaCorriente(double saldoInicial, double limiteDescubierto, String dniTitular) {
        this.saldo = saldoInicial;
        this.limiteDescubierto = limiteDescubierto;
        this.nombreTitular = "Sin datos";
        this.dniTitular = dniTitular;
    }
    
    //SETTERS NECESARIOS

    public void setLimiteDescubierto(double limiteDescubierto) {
        this.limiteDescubierto = limiteDescubierto;
    }

    public void setDniTitular(String dniTitular) {
        this.dniTitular = dniTitular;
    }

    public void setNombreTitular(String nombreTitular) {
        this.nombreTitular = nombreTitular;
    }
    

    // Método para sacar dinero de la cuenta
    public boolean sacarDinero(double cantidad) {
        if (cantidad <= saldo + limiteDescubierto) {
            saldo -= cantidad;
            return true;
        }
        return false;
    }

    // Método para hacer un ingreso en la cuenta
    public void hacerIngreso(double cantidad) {
        if (cantidad >= 0) {
            saldo += cantidad;
        }
    }

    // Método para consultar el saldo actual de la cuenta
    public double consultarSaldo() {
        return saldo;
    }

    // Método para consultar el DNI del titular
    private String consultarDniTitular() {
        return dniTitular;
    }

    // Método para mostrar la información actual de la cuenta
    public void mostrarInformacion() {
        System.out.println("Titular: " + nombreTitular);
        System.out.println("DNI: " + consultarDniTitular());
        System.out.println("Banco: " + banco);
        System.out.println("Saldo: " + saldo + "€");
        System.out.println("Límite descubierto: " + limiteDescubierto + "€\n");
    }

    // Constructor de copia
    public CuentaCorriente(CuentaCorriente otraCuenta) {
        this.saldo = otraCuenta.saldo;
        this.limiteDescubierto = otraCuenta.limiteDescubierto;
        this.nombreTitular = otraCuenta.nombreTitular;
        this.dniTitular = otraCuenta.dniTitular;
    }
}

