package Ejercicios;
import java.util.Scanner;

public class EjercicioCaracteresScannerSingleton {
    private static Scanner instance;

    private EjercicioCaracteresScannerSingleton() {

    }

    public static Scanner getInstance() {
        if (instance == null) {
            instance = new Scanner(System.in);
        }
        return instance;
    }

    public static void closeScanner() {
        if (instance != null) {
            instance.close();
            instance = null;
        }
    }
}
