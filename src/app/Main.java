package app;

/**
 * Clase de entrada del sistema.
 * Demuestra el uso de composición entre clases del paquete {@code model} creando
 * instancias de {@link model.Direccion}, {@link model.Persona},
 * {@link model.Empleado} y {@link model.Cliente}, e imprimiéndolas en consola.
 *
 * @author Manola
 * @version 1.0
 */

//Importa las clases del paquete model

import model.Cliente;
import model.Direccion;
import model.Empleado;
import model.Persona;

public class Main {
    public static void main(String[] args) {
        //Crea 3 objetos "direccion"
        Direccion dir = new Direccion("Viel 15", "Santiago", "Metropolitana");
        Direccion dir1 = new Direccion("San Francisco 35", "Valdivia", "Los Ríos");
        Direccion dir2 = new Direccion("Vivaceta 10", "Rancagua", "Libertador Bernardo O'Higgins");

        //Crea 3 objetos "persona"
        Persona per1 = new Persona("Ahsoka", 25, dir, "25123456-0", "ahsoka@mail.com", "22224444");
        Persona per2 = new Persona("José", 50, dir1, "123456987-1", "pedro@mail.com", "98765432");
        Persona per3 = new Persona("Celia", 45, dir2, "11998877-3", "celia@mail.com", "+5693322678");

        //Crea 2 objetos "empleado"
        Empleado emp1 = new Empleado (per3,"vendedor", 900000);
        Empleado emp2 = new Empleado (per2,"supervisor", 1500000);

        //Crea 1 objeto "cliente"
        Cliente c1 = new Cliente (per1, true, "Restaurantes");

        //Imprime la información de empleados y cliente
        System.out.println("=== EMPLEADOS ===");
        System.out.println(emp1);
        System.out.println(emp2);
        System.out.println("\n=== CLIENTES ===");
        System.out.println(c1);
    }
}