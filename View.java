/**
 * 
 * Copyright (C), 2022-2023, FabianJuarez
 * FileName: View
 * Author:   Fabián Juárez
 * Date:     18/02/2022
─────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────
─██████████████─██████████████─██████████████───██████████─██████████████─██████──────────██████────────────██████─██████──██████─██████████████─████████████████───██████████████─██████████████████─
─██░░░░░░░░░░██─██░░░░░░░░░░██─██░░░░░░░░░░██───██░░░░░░██─██░░░░░░░░░░██─██░░██████████──██░░██────────────██░░██─██░░██──██░░██─██░░░░░░░░░░██─██░░░░░░░░░░░░██───██░░░░░░░░░░██─██░░░░░░░░░░░░░░██─
─██░░██████████─██░░██████░░██─██░░██████░░██───████░░████─██░░██████░░██─██░░░░░░░░░░██──██░░██────────────██░░██─██░░██──██░░██─██░░██████░░██─██░░████████░░██───██░░██████████─████████████░░░░██─
─██░░██─────────██░░██──██░░██─██░░██──██░░██─────██░░██───██░░██──██░░██─██░░██████░░██──██░░██────────────██░░██─██░░██──██░░██─██░░██──██░░██─██░░██────██░░██───██░░██─────────────────████░░████─
─██░░██████████─██░░██████░░██─██░░██████░░████───██░░██───██░░██████░░██─██░░██──██░░██──██░░██────────────██░░██─██░░██──██░░██─██░░██████░░██─██░░████████░░██───██░░██████████───────████░░████───
─██░░░░░░░░░░██─██░░░░░░░░░░██─██░░░░░░░░░░░░██───██░░██───██░░░░░░░░░░██─██░░██──██░░██──██░░██────────────██░░██─██░░██──██░░██─██░░░░░░░░░░██─██░░░░░░░░░░░░██───██░░░░░░░░░░██─────████░░████─────
─██░░██████████─██░░██████░░██─██░░████████░░██───██░░██───██░░██████░░██─██░░██──██░░██──██░░██────██████──██░░██─██░░██──██░░██─██░░██████░░██─██░░██████░░████───██░░██████████───████░░████───────
─██░░██─────────██░░██──██░░██─██░░██────██░░██───██░░██───██░░██──██░░██─██░░██──██░░██████░░██────██░░██──██░░██─██░░██──██░░██─██░░██──██░░██─██░░██──██░░██─────██░░██─────────████░░████─────────
─██░░██─────────██░░██──██░░██─██░░████████░░██─████░░████─██░░██──██░░██─██░░██──██░░░░░░░░░░██────██░░██████░░██─██░░██████░░██─██░░██──██░░██─██░░██──██░░██████─██░░██████████─██░░░░████████████─
─██░░██─────────██░░██──██░░██─██░░░░░░░░░░░░██─██░░░░░░██─██░░██──██░░██─██░░██──██████████░░██────██░░░░░░░░░░██─██░░░░░░░░░░██─██░░██──██░░██─██░░██──██░░░░░░██─██░░░░░░░░░░██─██░░░░░░░░░░░░░░██─
─██████─────────██████──██████─████████████████─██████████─██████──██████─██████──────────██████────██████████████─██████████████─██████──██████─██████──██████████─██████████████─██████████████████─
─────────────────────────────────────
 * @author Fabian Juarez
 */
import java.util.Scanner;
public class View{
    //---------------------------PROPIEDADES--------------------------
    private Scanner scan;

    //---------------------------METODOS------------------------------
    /*****************************************************************
     *
     */
    public void welcome() {
        System.out.println("------------- Bienvenido/bienvenida a su tienda online ---------------- "); // Titulo
        System.out.println("------------- Estamos abriendo su archivo ListadoProducto.txt ---------------- "); // mensaje
    }
    //****************************************************************

    /*****************************************************************
     *
     */
    public View(){
        scan = new Scanner(System.in); // Scanner
    }
    //****************************************************************

    /*****************************************************************
     * retorna el valor del elemento seleccionado por el usuario
     * @return
     */
    public int menu(){ //Menu principal para que el usuario eliga la opcion a realizar
        String salir = "";
        int numMenu = 0;
        String tmpTexto = "";
        boolean isNumeric = false;
        while(!salir.equalsIgnoreCase("si")){
            //Se imprime el menu en pantalla y se le pide al usuario un numero del menu
            System.out.println("\n************************* Escoja el map que desea utilizar ************************************\n");
            System.out.println("1. HashMap");
            System.out.println("2. TreeMap");
            System.out.println("3. LinkedHashMap");
            System.out.println("4. Salir");
            System.out.println("\n************ Por, favor elija la opcion que desea ejecutar **********\n");
            tmpTexto = scan.nextLine();

            // Se verifica que el numero que dio el usuario fue valido
            isNumeric = tmpTexto.chars().allMatch( Character::isDigit );
            if (isNumeric && !tmpTexto.isEmpty()){
                numMenu = Integer.parseInt(tmpTexto);
                salir = "si";
            }
            while (tmpTexto.isEmpty()||!isNumeric || numMenu < 1 || numMenu > 4) {
                System.out.println("ERROR, ingresar una opcion de menu mayor que 0" + " o menor que 4");
                tmpTexto = scan.nextLine();
                isNumeric = tmpTexto.chars().allMatch( Character::isDigit );
                numMenu = 0;
                if (isNumeric&&!tmpTexto.isEmpty()){
                    numMenu = Integer.parseInt(tmpTexto);
                    salir = "si";
                    }
                }
            }
        return numMenu;
    }
    //****************************************************************

    /*****************************************************************
     * retorna el valor del elemento seleccionado por el usuario
     * @return
     */
    public int menu2(){ //Menu principal para que el usuario eliga la opcion a realizar
        String salir = "";
        int numMenu = 0;
        String tmpTexto = "";
        boolean isNumeric = false;
        while(!salir.equalsIgnoreCase("si")){
            //Se imprime el menu en pantalla y se le pide al usuario un numero del menu
            System.out.println("\n************************* Escoja la opcion que desea utilizar ************************************\n");
            System.out.println("1. Agregar un productos la coleccion");
            System.out.println("2. Mostrar la categoria del producto");
            System.out.println("3. Mostrar los datos del producto, categoria y cantidad de articulos que hay en la coleccion");
            System.out.println("4. Mostrar los datos del producto, categoria y cantidad de articulos que hay en la coleccion ordenadamente por el tipo");
            System.out.println("5. Mostrar el producto y la categoria de todo el inventario");
            System.out.println("6. Mostrar el producto y la categoria de todo el inventario ordenadamente por el tipo");
            System.out.println("7. Salir");
            System.out.println("\n************ Por, favor elija la opcion que desea ejecutar **********\n");
            tmpTexto = scan.nextLine();

            // Se verifica que el numero que dio el usuario fue valido
            isNumeric = tmpTexto.chars().allMatch( Character::isDigit );
            if (isNumeric && !tmpTexto.isEmpty()){
                numMenu = Integer.parseInt(tmpTexto);
                salir = "si";
            }
            while (tmpTexto.isEmpty()||!isNumeric || numMenu < 1 || numMenu > 7) {
                System.out.println("ERROR, ingresar una opcion de menu mayor que 0" + " o menor que 7");
                tmpTexto = scan.nextLine();
                isNumeric = tmpTexto.chars().allMatch( Character::isDigit );
                numMenu = 0;
                if (isNumeric&&!tmpTexto.isEmpty()){
                    numMenu = Integer.parseInt(tmpTexto);
                    salir = "si";
                    }
                }
            }
        return numMenu;
    }
    //****************************************************************


    /*****************************************************************
     * Mensaje que dara al finalizar el programa
     */
    public void end(){
        System.out.println(" ------------ Gracias por utilizar nuestro programa ------------ \n"); // Mensaje que se mostrara al cerrar el programa
        System.exit(0);
        scan.close();
    }
    //****************************************************************

    /*****************************************************************
     * Asigna un valor pasado como parametro
     * @param e
     */
    public void error(String e){
        System.out.println("Ha ocurrido un error : -- " + e);
    }
    //****************************************************************

    /*****************************************************************
     * Asigna un mensaje a mostrar en pantalla
     *@param mensaje
     */
    public void output(String mensaje){
        System.out.println(mensaje); //mensaje que se le imprimira al usuario
    }
    //****************************************************************

    public String inputString(String mensaje){
        output(mensaje);
        String dato = scan.nextLine();
        return dato;
    }

    public int inputInt(String mensaje) {
        output(mensaje);
        String dato = scan.nextLine();
        int cant = Integer.parseInt(dato);
        return cant;
    }
}
