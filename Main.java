import java.util.Scanner;  //clase escanner que es para leer en consola
import java.util.InputMismatchException; // esta clase sirve para controlar las entradas que no son aceptadas

public class Main {
    public static void main(String[] args) {
        int[] notas = leerNotas(); //aqui llamo a la funcion y esta almacena las notas en total son 8
        if (validarNotas(notas)) { // esta funcion verifica que el arreglo sea valido si es valido genera y muestra el reporte
            mostrarReporte(notas);
        } else { System.out.println("ERROR"); //sino muesta un mensaje de error
            }
        }
    static int[] leerNotas() { // este es el metodo para leer las calificaicones desde el teclado
            Scanner sc = new Scanner(System.in);  //se crea un objeto scanner para leer datos luego iniciamos bucle para ingresar las notas
            int[] notas = new int[8];
            int i = 0;

            while (i < 8) { // este bucle se cierra al ingresar las 8 notas validas guarda las validas y si no son validas manda error
                try {
                    System.out.printf("Ingrese la calificacion" + (i + 1) + ":");
                    int nota = sc.nextInt();
                    if (nota < 0 || nota > 100) {
                        System.out.println("El valor que ingreso esta fuera de rango, por favor ingrese numeros entre 0 y 100.");
                    } else {
                        notas[i] = nota;
                        i++;
                    }
                } catch (InputMismatchException e) {// el ImputMismatchException captura el error si se ingresa algo que no sea un numero
                    System.out.println("Entrada invalida, ingrese un valor numerico");
                    sc.next(); //limpia la entrada invalida
                }
            }
            return notas; // devolvemos las notas

        }
        static boolean validarNotas(int[] notas){ // este metodo valida el arreglo comprueba que no sea nulo y contenga 8 numeros
            if (notas ==null || notas.length !=8){
                return false;
            }
            return true;
        }

    static double calcularPromedio(int[] notas){ // metodo para calcular el promedio
    int suma=0;
    for (int nota : notas){
        suma+= nota;
    }
    return  (double) suma/notas.length;
    }
    static  int encontrarMaximo(int[] notas){// metodo para encontrar la nota mas alta
        int max= notas[0];
        for( int nota: notas){
            if (nota>max){
                max = nota;
            }
        }
        return max;
    }
    static int encontrarMinimo(int[] notas){//metodo para encontrar la nota mas baja
        int min = notas[0];
        for (int nota : notas){
        if (nota < min) {
            min=nota;
        }

        }
        return min;
    }

static int contarAprobados(int[] notas){// metodo para determinar los aprobados
        int count =  0;
        for (int nota : notas){
            if (nota >= 70){
                count++;
            }
        }
        return count;
    }
    static void mostrarReporte(int[] notas){// metodo para imprimir los resultados de la manera esperada
        double promedio = calcularPromedio(notas);
        int maximo = encontrarMaximo(notas);
        int minimo = encontrarMinimo(notas);
        int aprobados = contarAprobados(notas);
        int reprobados = notas.length - aprobados;
        double porcenateAprobados = (double) aprobados / notas.length * 100;

        System.out.println("╔════════════════════════════════════════════════╗");
        System.out.println("║      REPORTE DE CALIFICACIONES                 ║");
        System.out.println("╠════════════════════════════════════════════════╣");
        System.out.print("║Calificaciones ingresadas:");
        for (int i=0 ; i< notas.length; i++){
            System.out.print(notas[i]);
            if (i< notas.length-1){
                System.out.print("-");
            }
        }
    System.out.println("║");
    System.out.println("║  Promedio:              "+ String.format("%.2f", promedio) + "                  ║");
    System.out.println("║  Calificación máxima:   " + maximo + "                     ║");
    System.out.println("║  Calificación mínima:   " + minimo + "                     ║");
    System.out.println("║                                                ║");
    System.out.println("║  ─── ANÁLISIS DE RESULTADOS ───                ║");
    System.out.println("║                                                ║");
    System.out.println("║  Cantidad de aprobados (≥70):   " + aprobados + "              ║");
    System.out.println("║  Cantidad de reprobados (<70):  " + reprobados + "              ║");
    System.out.printf("║  Porcentaje de aprobados:       %s%n", String.format("%.1f", porcenateAprobados) + "%          ║");
    System.out.println("║                                                ║");
    System.out.println("║                                                ║");
    System.out.println("╚════════════════════════════════════════════════╝");
    }
}