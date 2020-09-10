
import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Cola c = new Cola();
        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int id, horast;
        String nombre, apellido;
        double salario;
        int opcion;
        while (!salir) {
            System.out.println("--BIENVENIDO AL MENU DE GESTION DE EMPLEADOS--");
            System.out.println("1. Crear Empleados");
            System.out.println("2. Borrar Cola Empleados");
            System.out.println("3. Mostrar Cola de Empleados");
            System.out.println("4. Consultar Empleado");
            System.out.println("5. Salir");
            System.out.println("");
            try {
                System.out.println("Escribe una de las opciones");
                opcion = sn.nextInt();
                System.out.println("");
                switch (opcion) {
                    case 1:
                        System.out.println("Has seleccionado crear empleados");
                        System.out.println("Ingresa el id del empleado: ");
                        id = sn.nextInt();
                        System.out.println("Ingresa el nombre del empleado: ");
                        nombre = sn.next();
                        System.out.println("Ingresa el apellido del empleado: ");
                        apellido = sn.next();
                        System.out.println("Ingresa el salario del empleado: ");
                        salario = sn.nextDouble();
                        System.out.println("Ingresa horas trabajadas por mes del empleado: ");
                        horast = sn.nextInt();
                        c.Encolar(new Persona(id, nombre, apellido, salario, horast));
                        System.out.println("");
                        break;
                    case 2:
                        System.out.println("Has seleccionado borrar cola empleados");
                        System.out.println(c.Vacio());
                        System.out.println("");
                        break;
                    case 3:
                        System.out.println("Has seleccionado mostrar la cola de emplados");
                        System.out.println(c.MostrarCola());
                        System.out.println("");
                        break;

                    case 4:
                        Scanner sna = new Scanner(System.in);
                        boolean salir1 = false;
                        int opcion1;
                        while (!salir1) {
                            System.out.println("--------SUBMENU CONSULTAS DE EMPLEADOS------");
                            System.out.println("1. Buscar Empleados Mas Horas Trabajadas");
                            System.out.println("2. Buscar Empleado Menos Horas Trabajas");
                            System.out.println("3. Salir");
                            System.out.println("");
                            try {
                                System.out.println("Escribe una de las opciones");
                                opcion1 = sna.nextInt();
                                System.out.println("");
                                switch (opcion1) {
                                    case 1:
                                        System.out.println("Has seleccionado empleado menos horas trabajadas");
                                        c.menoshoras();
                                        System.out.println("");
                                        break;
                                    case 2:
                                        System.out.println("Has seleccionado empleado mas horas trabajadas");
                                        c.mashoras();
                                        System.out.println("");
                                        break;
                                    case 3:
                                        System.out.println("SALIENDO DE SUBMENU EMPLEADOS...");
                                        salir1 = true;
                                        break;
                                    default:
                                        System.out.println("Solo números entre 1 y 3");
                                        System.out.println("");
                                }
                            } catch (InputMismatchException a) {
                                System.out.println("Debes insertar un número");
                                System.out.println("");
                                sna.next();
                            }
                        }
                        break;
                    case 5:
                        System.out.println("BYE...");
                        salir = true;
                        break;
                    default:
                        System.out.println("Solo números entre 1 y 5");
                        System.out.println("");
                }
            } catch (InputMismatchException e) {
                System.out.println("Debes insertar un número");
                System.out.println("");
                sn.next();
            }
        }
    }

}
