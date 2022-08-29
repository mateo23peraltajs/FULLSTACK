
import static java.lang.Character.toUpperCase;
import java.util.Scanner;
import static jdk.nashorn.internal.objects.NativeString.substring;
import jdk.nashorn.internal.runtime.regexp.joni.encoding.CharacterType;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Fede
 */
public class Ejercicios {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        /*
    int nro2, rtdo;
    Scanner leer = new Scanner(System.in);
    System.out.println("ingresa el numero 1");   
    
    int nro = leer.nextInt();
    
    System.out.println("ingresa el numero 2");
    
    int nro1 = leer.nextInt();
    
    int suma = nro + nro1 ;
    
        System.out.println("La suma de " + nro + ", mas " + nro1 + ", es igual a " + suma );
         */
 /*
        System.out.println("hola! ingrese su nombre porfavor");
        String nombre = leer.nextLine();
        System.out.println("su nombre es: " + nombre);
         */
 /*
        System.out.println("Ingresa una palabra porfavor");
        String palabra = leer.nextLine();
        System.out.println("tu palabra toda en mayusculas es: " + palabra.toUpperCase() + ", y toda en minusculas es: " + palabra.toLowerCase());
         */
 /*
        System.out.println("Ingresa ua temperatura en celcius y la pasamos a Farenheit");
        int celsius = leer.nextInt();
        double farenheit = 32+(9*celsius/5);
        
        System.out.println("Su temperatura, " + celsius + ", en farenheit es: "+ farenheit );
         */
 /*
        System.out.println("ingresa un valor y nosotros te devolveremos su triple, doble y raiz cuadrada");
        int numero = leer.nextInt();
        System.out.println( "Su doble es " + numero*2 + ", su triple es " + numero*3 + ", y su raiz cuadrada es " + Math.sqrt(numero))  ;
         */
 /*
        System.out.println("ingrese su numero y le diremos si es par o impar");
        int numero = leer.nextInt();
        
        if (numero % 2 == 0){
            System.out.println("Su numero, " + numero + ",  es par");
        }else if (numero % 2 != 0) {
            System.out.println("su numero, " + numero + ", es impar");
        }
         */
 /*
        System.out.println("ingrese una palabra, y si esta es igual a la misteriosa se mostrara un mensaje de correcto");
        String misterio = "eureka";
        String palabra = leer.nextLine();
        if (palabra.equals(misterio)) {
            System.out.println("felicitaciones, encontraste la palabra");
        } else {
            System.out.println("lamentablemente, no la encontraste");
        }
         */
 /*
        System.out.println("ingresa una palabra que solamente tenga 8 letras de largo, sino te dará error");
        String palabra = leer.nextLine();
        if (palabra.length() == 8) {
            System.out.println("CORRECTO");
        } else {
            System.out.println("INCORRECTO");
        }
         */
 /* 
        System.out.println("Ingresa una palabra, y si la primera letra de esta es 'a', entonces correcto");
        String palabra = leer.nextLine();
        if (palabra.substring(0,1).equals("A")){
            System.out.println("CORRECTO CHEE");
        } else {
            System.out.println("incorrecto...");
        }
         */
 /*  int i = 0;
        int suma = 0;
        do {
            System.out.println("Ingresa un numero");
            int numero = leer.nextInt();

            if (numero == 0) {
                System.out.println("se capturó el numero 0");

                continue;
            }
            if (numero < 0) {
                continue;
            } else {
                suma += numero;
            }

            i++;
        } while (i < 20);

        if(i==20){   
        System.out.println("la suma de los numeros enteros es: " + suma);
        }
         */
 /* 
 System.out.println("debe ingresar 4 valores positivos entre 1 y 20");
        
        int[] numeros = new int[4];
        for (int i = 0; i < 4; i++) {     
             do {
                System.out.println("ingrese " + (i+1) + "º valor");
                 numeros[i] = leer.nextInt();
                } while (numeros[i] < 1 || numeros[i] > 20 );
        }
        System.out.println("Se procederá a imprimir cada valor + * segun valor");
        for (int i = 0; i < 4; i++) {
            System.out.println("");
            System.out.print(numeros[i]+" ");
            for (int j = 0; j < numeros[i]; j++) {
                System.out.print("*");
            }
            
        }
        System.out.println("");
         */
 /*
        String text;
        System.out.println("Ingrese el texto a cifrar");
        text = leer.nextLine();
        System.out.println("La frase cifrada es: ");
        String retorno = cifrado(text);
        System.out.println(retorno);
    }

    public static String cifrado(String text) {
        String textocifrado;
        int k;

        for (k = 0; k < text.length(); k++) {
            switch (text.substring(k, k + 1)) {
                case "a":
                    text = text.replace("a", "@");
                    break;
                case "e":
                    text = text.replace("e", "#");
                    break;
                case "i":
                    text = text.replace("i", "$");
                    break;
                case "o":
                    text = text.replace("o", "%");
                    break;
                case "u":
                    text = text.replace("u", "*");
                    break;
                case "A":
                    text = text.replace("A", "@");
                    break;
                case "E":
                    text = text.replace("E", "#");
                    break;
                case "I":
                    text = text.replace("I", "$");
                    break;
                case "O":
                    text = text.replace("O", "%");
                    break;
                case "U":
                    text = text.replace("U", "*");
                    break;
            }
        }
        textocifrado = text;
        return textocifrado;
         */
 /*
        System.out.println("Ingresa el limite a alcanzar.");
        int limite = leer.nextInt();
        int suma = 0;

        for (int i = 0; suma < limite; i++){
        System.out.println("un número hasta superar el límite");
        int numero = leer.nextInt();
        suma += numero;
        
        }
        
        System.out.println("El valor limite ingresado era "+limite+ " y el valor con el que lo superaste era " + suma);
         */
 /*
        System.out.println("Ingresa el tamaño de tu cuadrado");
        int cuadrado = leer.nextInt();
       
        for (int i = 0; i < cuadrado; i++) { // columnas
            
            for (int j = 0; j < cuadrado; j++) { // filas
            
                if (j == 0 || j == cuadrado - 1 || i == 0 || i == cuadrado - 1) {
                
                    System.out.print("* ");
                
                } else {
                
                    System.out.print("  ");
                
                }
            }
            System.out.println("  ");
        }
         */
 /*
    String cadena;
        int correctas = 0;
        int incorrectas = 0;
        // CADENA
        do {
            System.out.println("ingrese cadena");
            cadena = leer.nextLine();
            if (cadena.length() <= 5 && "X".equals(cadena.substring(0, 1)) && "O".equals(cadena.substring(cadena.length() - 1))) {
                correctas++;
            } else {
                incorrectas++;
            }
        } while (!"&&&&&".equals(cadena));
        System.out.println("cantidad correctas: " + correctas);
        System.out.println("cantidad incorrectas: " + incorrectas);

         */
 /*
        System.out.println("Ingresa un valor en euros, y la convertiremos a otras divisas");
        float euros = leer.nextFloat();
        String divisa;
        do {
            System.out.println("Ingresa la divisa, Y para Yen, D para Dolar, L para Libra");
            divisa = leer.next();
        } while (!"Y".equals(divisa) && !"D".equals(divisa) && !"L".equals(divisa));
        moneda(euros, divisa);

    }

    public static void moneda(float euro, String tipo) {
        double resultado = 0;
        switch (tipo) {
            case "Y":
                resultado = euro * 129.852;
                break;
            case "L":
                resultado = euro * 0.86;
                break;
            case "D":
                resultado = euro * 1.28611;
                break;
        }
        System.out.println("Los euros pasados a la divisa elegida son: " + resultado);
         */
 /* 
 System.out.println("Ingrese el tamaño del vector");
        int numero = leer.nextInt();
        int[] vector;
         vector = new int[numero];

        for (int i = 0; i < numero; i++) {
            vector[i] = (int) (Math.random() * 100000);
            System.out.print(vector[i]+ ", ");
                
            switch (Integer.toString(vector[i]).length()) {
                case 1:
                    contador1++;
                    break;
                case 2:
                    contador2++;
                    break;
                case 3:
                    contador3++;
                    break;
                case 4:
                    contador4++;
                    break;
                case 5:
                    contador5++;
                    break;
            }
        }
        System.out.println("");
             
        System.out.println("La cantidad de numeros de 1 dígito son " + contador1 + ", de 2 " + contador2 + ", de 3 " + contador3 + ",de 4 " + contador4 + ", y de 5 " + contador5); int contador1 = 0, contador2 = 0, contador3 = 0, contador4 = 0, contador5 = 0;
        vector = new int[numero];

        for (int i = 0; i < numero; i++) {
            vector[i] = (int) (Math.random() * 100000);
            System.out.print(vector[i]+ ", ");
                
            switch (Integer.toString(vector[i]).length()) {
                case 1:
                    contador1++;
                    break;
                case 2:
                    contador2++;
                    break;
                case 3:
                    contador3++;
                    break;
                case 4:
                    contador4++;
                    break;
                case 5:
                    contador5++;
                    break;
            }
        }
        System.out.println("");
             
        System.out.println("La cantidad de numeros de 1 dígito son " + contador1 + ", de 2 " + contador2 + ", de 3 " + contador3 + ",de 4 " + contador4 + ", y de 5 " + contador5);
         */
 /*
        System.out.println("a");
        String hola = leer.nextLine();
        int[][] matriz = new int[4][4];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = (int) (Math.random() * 10);
                System.out.print(matriz[i][j]);
            }
            System.out.println("");
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[j][i]);
            }
            System.out.println("");
        }
         */
 /*
        int matriz[][] = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                do {
                    System.out.println("ingrese un valor a la matriz");
                    matriz[i][j] = leer.nextInt();
                } while (matriz[i][j] > 10 || matriz[i][j] <= 0);
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j]);
            }
            System.out.println("");
        }
        boolean comprobar = false;
        int suma1 = 0, suma2 = 0, suma3 = 0;

        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 3; j++) {

                if (i == 0) {
                    suma1 += matriz[i][j];

                } else if (i == j) {
                    suma2 += matriz[i][j];

                } else if (j == 0) {
                    suma3 += +matriz[i][j];

                }
            }
            if (suma1 == suma2 && suma2 == suma3 && suma3 == suma1) {
                comprobar = true;
            }
        }

        if (comprobar = true) {
            System.out.println("TU cubo es magico");

        } else {
            System.out.println("tu cubo NO es magico");
        }
         */
 /*
        int[][] matriz = new int[10][10];
        int[][] matrizP = new int[3][3];

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                //     matriz[i][j] = leer.nextInt();
                // matriz[i][j]=j+1;
                matriz[i][j] = (int) (Math.random() * 10);

                System.out.print(" [" + matriz[i][j] + "] ");

            }
            System.out.println("");
        }
        System.out.println("ingrese los valores de la matrizP");
        for (int j = 0; j < 3; j++) {
            for (int h = 0; h < 3; h++) {
                matrizP[j][h] = leer.nextInt();

            }
        }
        String cadena = "";
        int contador = 0;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (matriz[i][j] == matrizP[0][0]) {
                    if (i + 2 < 10 && j + 2 < 10) {
                        contador = 0;
                        // cadena = cadena.concat(Integer.toString(i));
                        // cadena = cadena.concat(" - ");
                        //  cadena = cadena.concat(Integer.toString(j));
                        for (int h = 0; h < 3; h++) {
                            for (int k = 0; k < 3; k++) {
                                if (matriz[i + h][j + k] != matrizP[h][k]) {
                                    contador++;
                                }
                            }
                        }
                        if (contador == 0) {
                            System.out.println("la matrizP se encuentra en la posicion: " + i + "," + j);

                        }
                    }
                }
            }
        }
         */
    
    
         //A PARTIR DE ACÁ, EJERCICIOS EXTRA.
         
         
         
    
    
    
    }
}
