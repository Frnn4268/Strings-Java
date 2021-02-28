import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        int des;
        Scanner so = new Scanner((System.in));

        do{
            Scanner obj = new Scanner((System.in)); //Declaración del nuevo Scanner llamado obj para llamarlo luego

            int s1; //Número entero para el switch case
            System.out.println("");
            System.out.println("1.- Tamaño"); //Instrucciones para el usuario
            System.out.println("2.- Subcadena");
            System.out.println("3.- Comparación de palabras");
            System.out.println("4.- Comparación de tamaño");
            System.out.println("5.- Salir");

            s1 = obj.nextInt(); //Otención de la variable s1

            switch (s1) {
                case 1: //Case 1: Tamaño
                    String cadena_original = "";
                    int num = 0;

                    Scanner in = new Scanner(System.in);

                    System.out.println("Tamaño");
                    System.out.println("");
                    System.out.print("Ingrese la cadena que desee: ");
                    cadena_original = in.nextLine();
                    num = cadena_original.length();
                    System.out.println("");
                    System.out.println("El tamaño de la cadena '" + cadena_original + "' es: " + num);
                    break;

                case 2: //Case 2: Subcadena
                    System.out.println("");
                    System.out.println("Subcadena");

                    String cadena_og = "", subcedena = "";
                    int desde = 0, hasta = 0, num1 = 0;

                    Scanner in1 = new Scanner(System.in);
                    System.out.println("");
                    System.out.print("Ingrese la cadena que desee: ");
                    cadena_og = in1.nextLine();
                    num1 = cadena_og.length();
                    System.out.println("");
                    System.out.print("¿Desde que caracter desea obtener la nueva cadena?");
                    desde = in1.nextInt();
                    System.out.println("");
                    System.out.print("¿Hasta donde deesas obtener la nueva cadena?");
                    hasta = in1.nextInt();

                    if (hasta > num1){
                        System.out.println("");
                        System.out.print("La cantidad que ingreso es mayor a la cadena original");

                    } else {
                        subcedena = cadena_og.substring(desde, hasta);
                        System.out.println("");
                        System.out.println("La nueva cadena es: " + subcedena);
                    }
                    break;

                case 3: //Case 3: Comparación de palabras
                    int v; //Número entero para el if case
                    String var1 = "", var2 = "";

                    Scanner in2 = new Scanner(System.in);

                    System.out.println("");
                    System.out.println("Comparación de palabras");
                    System.out.println("");
                    System.out.println("Ingrese la primera palabra: ");
                    var1 = in2.nextLine();
                    String lower = var1.toLowerCase();

                    System.out.println("Ingrese la segunda palabra: ");
                    var2 = in2.nextLine();
                    String lower1 = var2.toLowerCase();

                    System.out.println("");
                    System.out.println("1. Ignorar mayúsculas");
                    System.out.println("2. No ignorar mayúsculas");

                    v = in2.nextInt(); //Otención de la variable v

                    switch (v) {
                        case 1:
                            if (lower.equals(lower1)){
                                System.out.println("");
                                System.out.println("Las palabras son iguales");

                            } else {
                                System.out.println("");
                                System.out.println("Las palabras no son iguales");
                            }
                            break;

                        case 2:
                            if (var1.equals(var2)){
                                System.out.println("");
                                System.out.println("Las palabras son iguales");

                            } else {
                                System.out.println("");
                                System.out.println("Las palabras no son iguales");
                            }
                            break;
                    }
                    break;

                case 4: //Case 4: Comparación de tamaño
                    int v1; //Número entero para el switch case
                    String var0 = "", var01 = "";

                    Scanner in3 = new Scanner(System.in);

                    System.out.println("");
                    System.out.println("Comparación de tamaño");
                    System.out.println("");
                    System.out.println("Ingrese la primera cadena: ");
                    var0 = in3.nextLine();
                    int lower0 = var0.length();
                    String replace0 = var0.replace(" ", "");
                    int lar0 = replace0.length();
                    System.out.println("");
                    System.out.println("Ingrese la segunda cadena: ");
                    var01 = in3.nextLine();
                    int lower01 = var01.length();
                    String replace01 = var01.replace(" ", "");
                    int lar01 = replace01.length();

                    System.out.println("");
                    System.out.println("1. Ignorar espacios en blanco");
                    System.out.println("2. No ignorar espacios en blanco");

                    v1 = in3.nextInt(); //Otención de la variable v1

                    switch (v1) {
                        case 1:
                            if (lar0 == lar01){
                                System.out.println("");
                                System.out.println("Las cadenas son iguales");

                            } else {
                                System.out.println("");
                                System.out.println("Las cadenas no son iguales");
                            }
                            break;

                        case 2:
                            if (lower0 == lower01){
                                System.out.println("");
                                System.out.println("Las cadenas son iguales");

                            } else {
                                System.out.println("");
                                System.out.println("Las cadenas no son iguales");
                            }
                            break;
                    }
                    break;

                case 5:
                    System.out.println("");
                    System.out.println("Salir");
                    break;
            }
            System.out.println("");
            System.out.println("¿Desea continuar?");
            System.out.println("1. Si || 2. No");
            System.out.println("");
            des = so.nextInt();
        }
        while(des == 1);
    }
}