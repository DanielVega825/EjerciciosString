package Ejercicios;

import javax.swing.*;
import java.util.Scanner;


public class EjercicioCaracteres {
    
    public static void main(String[] args) {

        menu();
        
    }


    public static void menu(){
        //Menu
        try {
            String opcion1 = JOptionPane.showInputDialog(null,"Seleccióne el ejecicio que desea realizar" +
                    "\n\n1. Transformar la inversa de una palabra\n2. Subcadena\n3. Comparar cadenas" +
                    "\n4. Contar vocales\n5. Reemplazar caracteres\n6. Invertir una cadena\n" +
                    "7. Comprobar si es un palíndromo\n8. Concatenar cadenas" +
                    "\n9. Dividir una cadena\n10. Convertira a mayúsculas y minúsculas\n" +
                    "11. Salir\n\n", "Menu",JOptionPane.INFORMATION_MESSAGE);

            int opcion = Integer.parseInt(opcion1);

            switch (opcion) {
                case 1:
                    ejercicio1();
                    menu();
                case 2:
                    ejercicio2();
                    menu();
                case 3:
                    ejercicio3();
                    menu();
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 8:
                    break;
                case 9:
                    break;
                case 10:
                    break;
                case 11:
                    //salir
                    JOptionPane.showMessageDialog(null,"Chao!");
                    break;
                default:
                    JOptionPane.showMessageDialog(null,"Opción incorrecta, por favor, selecciona nuevamente");
                    menu();
            }
        } catch (Exception e) {
            System.out.println("Vuelve a correr el programa, Error: " + e);

        }


    }

    public static void ejercicio1() {
        //Ejercicio #1, Transformar la inversa de una palabra

        String palabra = JOptionPane.showInputDialog("Digita una palabra que quieras transformar");
        System.out.println("palabra = " + palabra);
        //Se puede generar un metodo o llamar a la clase StringBuilder
        //System.out.println("inversa(palabra) = " + inversa(palabra));
        String inversa = new StringBuilder(palabra).reverse().toString();
        System.out.println("inversa = " + inversa);
    }

    public static void ejercicio2() {
        //Ejercicio #2, Subcadena
        /*
        Crea un método que reciba una cadena y dos índices, y que devuelva la
         subcadena que se encuentra entre esos índices. Asegúrate de manejar excepciones
         si los índices son incorrectos.
         */
        Scanner sc = EjercicioCaracteresScannerSingleton.getInstance();
        System.out.println("Ingresa la cadena: ");
        String cadena = sc.next();
        System.out.println("Ingresa el primer indice ");
        int firstInd = sc.nextInt();
        System.out.println("Ingresa el segundo indice ");
        int secondInd = sc.nextInt();
        System.out.println("cadena.substring(firstInd,secondInd) = " + cadena.substring(firstInd,secondInd));
    }

    public static void ejercicio3() {
        //Ejercicio #3, Comparar cadenas
        /*
        Pide al usuario que ingrese dos cadenas. Luego, compara las dos cadenas
        e imprime si son iguales o no, teniendo en cuenta las mayúsculas y minúsculas.
         */
        Scanner sc = EjercicioCaracteresScannerSingleton.getInstance();
        System.out.print("Ingresa dos cadenas separadas por un espacio: ");
        String entrada = sc.nextLine();

        // Separar la entrada por espacios
        String[] partes = entrada.split(" ");

        //Validar que se hayan ingresado exactamente dos cadenas
        if (partes.length != 2) {
            System.out.println("Por favor, ingresa exactamente dos cadenas separadas por un espacio.");
            // Repetir si la entrada no es válida
            ejercicio3();
        }else {
            // Al ser String un objeto, es necesario comparar con el uso del
            // metodo equals, ya que se van a comparar dos direcciones de memoria
            // y no dos tipos de datos primitivos.
            if(/*partes[0] == partes[1]*/partes[0].equals(partes[1])){
                System.out.println("Son iguales");
            } else if (!partes[0].equals(partes[1])) {
                System.out.println("No son iguales");
            }


        }

    }

    public static void ejercicio4() {
        //Ejercicio #3, Comparar cadenas
        /*
        Pide al usuario que ingrese dos cadenas. Luego, compara las dos cadenas
        e imprime si son iguales o no, teniendo en cuenta las mayúsculas y minúsculas.
         */
    }

    public static void ejercicio5() {
        //Ejercicio #3, Comparar cadenas
        /*
        Pide al usuario que ingrese dos cadenas. Luego, compara las dos cadenas
        e imprime si son iguales o no, teniendo en cuenta las mayúsculas y minúsculas.
         */
    }

    public static void ejercicio6() {
        //Ejercicio #3, Comparar cadenas
        /*
        Pide al usuario que ingrese dos cadenas. Luego, compara las dos cadenas
        e imprime si son iguales o no, teniendo en cuenta las mayúsculas y minúsculas.
         */
    }

    public static void ejercicio7() {
        //Ejercicio #3, Comparar cadenas
        /*
        Pide al usuario que ingrese dos cadenas. Luego, compara las dos cadenas
        e imprime si son iguales o no, teniendo en cuenta las mayúsculas y minúsculas.
         */
    }

    public static void ejercicio8() {
        //Ejercicio #3, Comparar cadenas
        /*
        Pide al usuario que ingrese dos cadenas. Luego, compara las dos cadenas
        e imprime si son iguales o no, teniendo en cuenta las mayúsculas y minúsculas.
         */
    }

    public static void ejercicio9() {
        //Ejercicio #3, Comparar cadenas
        /*
        Pide al usuario que ingrese dos cadenas. Luego, compara las dos cadenas
        e imprime si son iguales o no, teniendo en cuenta las mayúsculas y minúsculas.
         */
    }

    public static void ejercicio10() {
        //Ejercicio #3, Comparar cadenas
        /*
        Pide al usuario que ingrese dos cadenas. Luego, compara las dos cadenas
        e imprime si son iguales o no, teniendo en cuenta las mayúsculas y minúsculas.
         */
    }

    public static String inversa(String s) {
        String palabra = "";
        System.out.println(s.length()-1);

        for (int i = s.length()-1; i >= 0;i--){
            palabra += s.charAt(i);
        }
        return palabra;

    }
}
