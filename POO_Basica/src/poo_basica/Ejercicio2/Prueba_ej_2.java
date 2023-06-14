package poo_basica.Ejercicio2;


public class Prueba_ej_2 {
    public static void main(String[] args) {
        // Crear una cuenta corriente para Franklyn
        CuentaCorriente cuentaFranklyn = new CuentaCorriente();
        cuentaFranklyn.setNombreTitular("Franklyn");
        cuentaFranklyn.setDniTitular("23567897F");
        cuentaFranklyn.setLimiteDescubierto(-50);

        // Hacer un ingreso de 1000€
        cuentaFranklyn.hacerIngreso(1000);

        // Sacar 300€
        boolean sePudoSacar = cuentaFranklyn.sacarDinero(300);
        if (sePudoSacar) {
            System.out.println("Se sacaron 300€ de la cuenta de Franklyn.\n");
        } else {
            System.out.println("No se pudo sacar 300€ de la cuenta de Franklyn.\n");
        }

        // Mostrar la información de la cuenta de Franklyn
        cuentaFranklyn.mostrarInformacion();

        // Sacar 700€ y luego sacar 200€
        sePudoSacar = cuentaFranklyn.sacarDinero(700);
        if (sePudoSacar) {
            System.out.println("Se sacaron 700€ de la cuenta de Franklyn.\n");
        } else {
            System.out.println("No se pudo sacar 700€ de la cuenta de Franklyn.\n");
        }

        cuentaFranklyn.sacarDinero(200);

        // Crear una nueva cuenta con saldo de 9000€
        CuentaCorriente cuentaMillonaria = new CuentaCorriente(9000);

        // Copiar la cuenta de Franklyn a la cuenta millonaria
        cuentaMillonaria = new CuentaCorriente(cuentaFranklyn);

        // Sacar 500€ de la cuenta millonaria
        cuentaMillonaria.sacarDinero(500);

        // Mostrar la información de la cuenta millonaria
        cuentaMillonaria.mostrarInformacion();
    }
    
    
    /*MUCHOS MENSAJES DEBERÍAN YA IR DIRECTAMENTE EN LOS MÉTODOS POR SI OS LO HABÉIS PREGUNTADO, PERO VAMOS PASO A PASO.*/
}

