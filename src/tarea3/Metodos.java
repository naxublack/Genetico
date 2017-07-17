package tarea3;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.concurrent.ThreadLocalRandom;
import java.util.logging.Level;
import java.util.logging.Logger;
import ventanas.Principal;

/**
 *
 * @author Nacho
 */
public class Metodos {
    //Variable global que es renombrada en Principal.java antes de llamar el método crearArchivo
    public static String ruta = "";
    //Variable global que contendrá las distancias entre ciudades en forma de matriz 2D
    public static int[][] costos = new int[29][29];
    
       
    public static void crearArchivo(){
        //Extraer columnas que contienen las distancias
        File original;
        original = new File(ruta);
        //Crear archivo nuevo que contendrá filas importantes.
        File nuevo;
        nuevo = new File("Temp.txt");
        //Escanear
        Scanner sc;
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(nuevo))) { 
            sc = new Scanner(original);
            int i = 1;
            while(sc.hasNextLine())
            {
                String linea;
                linea = sc.nextLine();
                if(i<=37 && 9<=i)
                {
                    
                    bw.write(linea);
                    bw.newLine();
                }
                i = i + 1;
            }
            sc.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    public static void crearMatriz(){
        //Unir .txt en una sola variable String
        File archivo;
        archivo = new File("Temp.txt");
        Scanner sc;      
        String acumulado;
        acumulado = "";
        try {
            sc = new Scanner(archivo);
            while(sc.hasNextLine())
            {
                String linea;
                linea = sc.nextLine();
                acumulado = acumulado.concat(linea);  
            }
        sc.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
        //Tokenizar y meter en matriz
        
        StringTokenizer tokens;
        tokens = new StringTokenizer(acumulado);
        String valor;
        //Llenar la de matriz con los valores del tokenizer
        for(int i=1; i<=29  ;i++)
        {
            for(int j=1; j<=29  ;j++)
            {
                valor = tokens.nextToken();
                costos[i-1][j-1] = Integer.parseInt(valor);
            }
        }
        //Elimina archivo temporal creado al final del uso
        File file;
        file = new File("Temp.txt");
        file.delete();
    }
    
    /**
     * Calcula el costo de una secuencia.
     * @param secuencia Permutación del TSP
     * @return Costo de la permutación.
     */
    public static int calcularCosto(int[] secuencia){
        //Calcular costo
        int suma = 0;
        int index1, index2;
        int largo = secuencia.length;
        for(int i=1; i<largo  ;i = i + 1)
        {
            index1 = secuencia[i-1];
            index2 = secuencia[i];
            suma = suma + costos[index1-1][index2-1];
        }
        //Hay que devolverse al inicio de la secuencia
        index1 = secuencia[0];
        index2 = secuencia[secuencia.length - 1];
        suma = suma + costos[index1-1][index2-1];
        return suma;
    }
    
    /**
     * Permutar una secuencia. Ejecutar un array shuffle.
     * @param arreglo Arreglo a permutar. La misma variable queda permutada.
     */
    public static void permutarSecuencia(int[] arreglo){
        Random rnd = ThreadLocalRandom.current();
        for (int i = arreglo.length - 1; i > 0; i--)
        {
          int index = rnd.nextInt(i + 1);
          // Simple swap
          int a = arreglo[index];
          arreglo[index] = arreglo[i];
          arreglo[i] = a;
        }
    }
    
    
    /**
     * Imprimir arreglo de 1 dimensión
     * @param arreglo Arreglo a mostrar en consola.
     */
    public static void imprimirArreglo(int[] arreglo){
        for (int i = 0; i < arreglo.length; i++)
        {
          System.out.print(arreglo[i] + " ");
        }
        System.out.println();
    }
    
    /**
     * Imprimir una matriz 2D
     * @param matrix MAtriz a imprimir.
     */
    public static void imprimirMatriz(int[][] matrix){
        for (int i = 0; i < matrix.length; i++) 
        {
            for (int j = 0; j < matrix[i].length; j++) 
            {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    /**
     * Obtener index de un arreglo a partir de un valor pedido.
     * @param valor Valor a buscar en un arreglo.
     * @param arreglo Arreglo en el que se quiere buscar un valor.
     * @return Índex del valor buscado dentro del arreglo.
     */
    public static int obtenerIndex(int valor, int[] arreglo){
        int index = 222;
        for (int i = 0; i < arreglo.length; i++)
        {
            if (arreglo[i] == valor)
            {
                index = i;                
            }
        }
        return index;
    }
    
    /**
     * Generar número aleatorio dentro del rango. Incluye los bordes.
     * @param min Número mínimo
     * @param max Número máximo
     * @return Número random entero entre un mínimo y un máximo. Considera bordes.
     */
    public static int generarRandom(int min, int max){
        int random = ThreadLocalRandom.current().nextInt(min, max + 1);
        return random;
    }
    
    
    /**
     * Genera un array del tamaño especificado que contiene un random
    de números sin repetición. Ojo que el tamaño no puede ser mayor
    que el límite y el rango de valores posibles es [0,límite]
     * @param tamano Tamaño del array a generar.
     * @param limite Indica el límite superior hasta el cual se considerará el random [0,límite]
     * @return Regresa un array de números shuffleados dentro de un rango determinado y sin repetición.
     */
    public static int[] randomArray(int tamano, int limite){
        int[] arreglo = new int[tamano];
        int count=0;
        int num;
        Random r = new Random();
        while(count<arreglo.length){
            num = r.nextInt(limite+2);
            boolean repeat=false;
            do{
                for(int i=0; i<arreglo.length; i++){
                    if(num==arreglo[i]){
                        repeat=true;
                        break;
                    }
                    else if(i==count){
                        arreglo[count]=num;
                        count++;
                        repeat=true;
                        break;
                    }
                }
            }while(!repeat);
        }
        for(int j=0;j<arreglo.length;j++){
           arreglo[j] = arreglo[j] - 1;
            //System.out.print(arreglo[j]+" ");
        }
        //System.out.println("");
        return arreglo;
        }
   
    /**
     * Extraer una determinada fila de una matriz
     * @param fila Fila a extraer (Comienza desde 0)
     * @param matriz Matriz a trabajar.
     * @return Fila pedida de la matriz consultada.
     */
    public static int[] extraerArray(int fila,int[][] matriz){
        int largo = matriz[0].length;
        int alto = matriz.length;
        //System.out.println("largo: "+largo);
        int[] array = new int[largo];
        for (int i = 0; i<alto ; i++)
        {
            for (int j = 0; j<largo ; j++)
            {
                if(i==fila)
                {
                    array[j] = matriz[fila][j];
                }
            }
        }
        return array;
    }
    
    /**
     * Obtener valor máximo de un arreglo
     * @param arreglo Arreglo
     * @return El número máximo dentro del arreglo.
     */
    public static int obtenerMax(int[] arreglo){
        int max = Arrays.stream(arreglo).max().getAsInt();
        return max;
    }
    
    /**
     * Obtener valor mínimo de un arreglo
     * @param arreglo Arreglo
     * @return El número múnimo dentro del arreglo.
     */
    public static int obtenerMin(int[] arreglo){
        int min = Arrays.stream(arreglo).min().getAsInt();
        return min;
    }
    
    /**
     * Ejecutar un invert swap entre 2 index o nodos en un arreglo.
     * @param arreglo Arreglo a permutar.
     * @param index1 Primer índice del segmento.
     * @param index2 Índice final del segmento.
     * @param exito Probabilidad de éxito de la mutación.
     * @return Arreglo con segmento invertido.
     */
    public static int[] ejecutar2opt(int[] arreglo, int index1, int index2, int exito){
        int z = generarRandom(1, 100);
        int[] aux = new int[arreglo.length];
            for (int i=0;i<arreglo.length;i++)
            {
                aux[i] = arreglo[i];
            }
        if (z <= exito)
        {
            int h = 0;
            for (int i = index1; i<=index2; i = i + 1)
            {
                aux[i] = arreglo[index2 - h];
                h = h + 1;
            }
            return aux;
        }
        else
        {
            return aux;        
        }
        
    }



}
