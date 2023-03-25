/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp.pkg3;
import java.util.Arrays;
/**
 *
 * @author Florencia
 */
public class TP3 {

    /*
    //1
    // Método para contar la cantidad de apariciones de una letra en un String
    public static int contarLetra(String texto, char letra) {
        int contador = 0;
        for (int i = 0; i < texto.length(); i++) {
            if (texto.charAt(i) == letra) {
                contador++;
            }
        }
        return contador;
    }

    // Método para ordenar tres números y retornarlos en un vector
    public static int[] ordenarNumeros(int a, int b, int c, boolean ascendente) {
        int[] numeros = {a, b, c};
        if (ascendente) {
            Arrays.sort(numeros);
        } else {
            Arrays.sort(numeros);
            int aux = numeros[0];
            numeros[0] = numeros[2];
            numeros[2] = aux;
        }
        return numeros;
    }

    // Método para sumar los números mayores que X en un vector
    public static int sumarMayoresQueX(int[] numeros, int x) {
        int suma = 0;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > x) {
                suma += numeros[i];
            }
        }
        return suma;
    }
    
     */
    
    /*
    //2
    */
    public class CodificacionCesar {

    private static final String ABECEDARIO = "abcdefghijklmnñopqrstuvwxyz ";

    public static String codificar(String texto, int desplazamiento) {
        char[] caracteres = texto.toCharArray();
        for (int i = 0; i < caracteres.length; i++) {
            char c = caracteres[i];
            int indice = ABECEDARIO.indexOf(c);
            if (indice != -1) {
                int nuevoIndice = (indice + desplazamiento) % ABECEDARIO.length();
                caracteres[i] = ABECEDARIO.charAt(nuevoIndice);
            }
        }
        return String.valueOf(caracteres);
    }

    public static String decodificar(String texto, int desplazamiento) {
        char[] caracteres = texto.toCharArray();
        for (int i = 0; i < caracteres.length; i++) {
            char c = caracteres[i];
            int indice = ABECEDARIO.indexOf(c);
            if (indice != -1) {
                int nuevoIndice = (indice - desplazamiento + ABECEDARIO.length()) % ABECEDARIO.length();
                caracteres[i] = ABECEDARIO.charAt(nuevoIndice);
            }
        }
        return String.valueOf(caracteres);
    }
}

    
    
    public static void main(String[] args) {
        
        /*
        // 1
        String texto = "Hola mundo";
        char letra = 'o';
        int cantidad = TP3.contarLetra(texto, letra);
        System.out.println("La letra '" + letra + "' aparece " + cantidad + " veces en el texto");

        // Ordenar tres números
        int a = 7, b = 2, c = 9;
        boolean ascendente = true;
        int[] numerosOrdenados = TP3.ordenarNumeros(a, b, c, ascendente);
        System.out.println("Números ordenados: " + Arrays.toString(numerosOrdenados));

        // Sumar los números mayores que X en un vector
        int[] numeros = {3, 7, 1, 5, 9};
        int x = 4;
        int suma = TP3.sumarMayoresQueX(numeros, x);
        System.out.println("La suma de los números mayores que " + x + " es " + suma);
*/
        //2
        
        String texto = "hola que tal";
    int desplazamiento = 1;

    String textoCodificado = CodificacionCesar.codificar(texto, desplazamiento);
    System.out.println("Texto codificado: " + textoCodificado);

    String textoDecodificado = CodificacionCesar.decodificar(textoCodificado, desplazamiento);
    System.out.println("Texto decodificado: " + textoDecodificado);
        
    }
}
