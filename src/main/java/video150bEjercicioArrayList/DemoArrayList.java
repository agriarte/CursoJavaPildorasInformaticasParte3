/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package video150bEjercicioArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Pedro
 * Ejercicio de la sección ArrayList(video 150b) del curso de Java de Pildoras Informaticas. 
 */
public class DemoArrayList {

 public static void main(String[] args) {
        ArrayList<Integer> array = leerDatos();
        double suma = calcularSuma(array);
        double media = suma / array.size();
        mostrarResultados(array, suma, media);
    }

    /* Método que pide números y los almacena en un DemoArrayList. Finaliza cuando se introduce 0 */
    public static ArrayList<Integer> leerDatos() {
        ArrayList<Integer> datos = new ArrayList();
        Scanner entrada = new Scanner(System.in);
        int num;
        System.out.println("Introduce número. 0 para salir");
        num = entrada.nextInt();
        while (num != 0) {
            datos.add(num);
            System.err.println("Introduce un nº 0 para salir.");
            num = entrada.nextInt();
        }
        return datos;
    }
// Recorrer el DemoArrayList y sumar los números almacenados

    public static double calcularSuma(ArrayList<Integer> valores) {
        double suma = 0;
        System.out.println("Valores introducidos: ");
        Iterator it = valores.iterator();
        while (it.hasNext()) {
            suma = suma + (Integer) it.next();
            //next devuelve un dato de tipo Objet, hay que convertirlo a Integer.
        }
        return suma;
    }

    public static void mostrarResultados(ArrayList<Integer> valores, double suma, double media) {
        int contador = 0;
        System.err.println("Valores Introducidos: ");
        System.err.println(valores);
        System.err.println("Suma: " + suma);
        System.err.printf("Media: %.2f %n", media);
        for (Integer i : valores) {
            if (i>media){
                contador++;
            }
        }
        System.out.println(contador + " valores superiores a la media");
    }
}
