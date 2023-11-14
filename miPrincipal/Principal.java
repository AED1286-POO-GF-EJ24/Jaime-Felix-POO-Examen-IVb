package miPrincipal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner( System.in );

        System.out.println("La Mas Grande");
        System.out.println("=============");

        System.out.println();

        // Division Internacional
        System.out.println("Division Internacional:");
        System.out.print("Proporcione el nombre de la division:");
        System.out.print("Proporcione el numero de empleados de la division:");
        entrada.nextLine();     // Eliminar <Enter> pendeinte
        System.out.print("Proporcione el pais donde se ubica la division:");
        System.out.print("Proporcione el idioma del pais:");

        // Crear DivisionInternacional
        Division d1 = new DivisionInternacional(nombre, numeroEmpleados, pais, idioma);

        // Division Local

        // Crear DivisionLocal
        Division d2 = new DivisionLocal(nombre, numeroEmpleados, estado);

        // Mostrar los datos de las divisiones
        System.out.println();

        entrada.close();
    }
}