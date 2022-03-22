/**
 * 
 * Copyright (C), 2022-2023, FabianJuarez
 * FileName: Controladora
 * Author:   Fabián Juárez
 * Date:     21/03/2022
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
public class Controladora {
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        //Atributos.
        int numMenu;
        int numMenu2;
        View miVista = new View();
        Archivo miArchivo = new Archivo();
        miArchivo.read();
        Hash miHash = new Hash(miArchivo);
        tree miTree = new tree(miArchivo);
        linkedHash milinked = new linkedHash(miArchivo);
        String nombreProducto;
        int cantProductos;
        String Categoria;

        miVista.welcome(); //Despliegue el titulo del programa
        numMenu = -1;
        while(numMenu != 4){ //Despliega el menu principal
            numMenu = miVista.menu();
            numMenu2 = -1;
            if (numMenu < 4){
                if(numMenu==1){
                    miVista.output("Implementacion de HashMap");
                    while(numMenu2 != 7){
                        numMenu2 = miVista.menu2();
                        switch (numMenu2) {
                            case 1:
                                Categoria = miVista.inputString("Ingrese la categoria del producto a usar");
                                nombreProducto = miVista.inputString("Ingrese el nombre del producto a usar");
                                cantProductos =  miVista.inputInt("Ingrese la cantidad de productos a usar");
                                miHash.agregarProducto(Categoria,nombreProducto,cantProductos);
                            break;
                            case 2:
                                nombreProducto = miVista.inputString("Ingrese el nombre del producto a usar");
                                miHash.mostrarCategoria(nombreProducto);
                            break;
                            case 3:
                                miHash.ProductosCaracteristicas();
                            break;
                            case 4:
                                miHash.ProductosCaracteristicasOrdenadas();
                            break;
                            case 5:
                                miHash.productoCategoria();
                            break;
                            case 6:
                                miHash.productoCategoriaOrdenada();
                            break;
                        }
                    }
                }
                if(numMenu==2){
                    miVista.output("Implementacion de TreeMap");
                    numMenu =-1;
                    while(numMenu2 != 7){
                        numMenu2 = miVista.menu2();
                        switch (numMenu2) {
                            case 1:
                                Categoria = miVista.inputString("Ingrese la categoria del producto a usar");
                                nombreProducto = miVista.inputString("Ingrese el nombre del producto a usar");
                                cantProductos =  miVista.inputInt("Ingrese la cantidad de productos a usar");
                                miTree.agregarProducto(Categoria,nombreProducto,cantProductos);
                            break;
                            case 2:
                                nombreProducto = miVista.inputString("Ingrese el nombre del producto a usar");
                                miTree.mostrarCategoria(nombreProducto);
                            break;
                            case 3:
                                miTree.ProductosCaracteristicas();
                            break;
                            case 4:
                                miTree.ProductosCaracteristicasOrdenadas();
                            break;
                            case 5:
                                miTree.productoCategoria();
                            break;
                            case 6:
                                miTree.productoCategoriaOrdenada();
                            break;
                        }
                    }
                }
                if(numMenu==3){
                    miVista.output("Implementacion de LinkedHashMap");
                    numMenu =-1;
                    while(numMenu2 != 7){
                        numMenu2 = miVista.menu2();
                        switch (numMenu2) {
                            case 1:
                                Categoria = miVista.inputString("Ingrese la categoria del producto a usar");
                                nombreProducto = miVista.inputString("Ingrese el nombre del producto a usar");
                                cantProductos =  miVista.inputInt("Ingrese la cantidad de productos a usar");
                                milinked.agregarProducto(Categoria,nombreProducto,cantProductos);
                            break;
                            case 2:
                                nombreProducto = miVista.inputString("Ingrese el nombre del producto a usar");
                                milinked.mostrarCategoria(nombreProducto);
                            break;
                            case 3:
                                milinked.ProductosCaracteristicas();
                            break;
                            case 4:
                                milinked.ProductosCaracteristicasOrdenadas();
                            break;
                            case 5:
                                milinked.productoCategoria();
                            break;
                            case 6:
                                milinked.productoCategoriaOrdenada();
                            break;
                        }
                    }
                }
            }
            else{
                miVista.end();
            }
        }
    }
}
