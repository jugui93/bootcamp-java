import java.util.ArrayList;

/**
 * Retos
 */
public class Retos {

    public int sumaArray(int[] arr){
        int suma = 0;
        for (int num : arr) {
            suma += num;
        }
        return suma;
    }

    public int encontrarMayor(int[] arr) {
        int mayor = arr[0];
        for (int num : arr) {
            if (num > mayor) {
                mayor = num;
            }
        }
        return mayor;
    }

    public int obtenerFactorial(int numero){
        int factorial = 1;
        for ( int i = 1; i <= numero; i++ ){
            factorial *= i;
        }
        return factorial;
    }

    public ArrayList<Integer> obtenerFibonacci(int posicion) {
        ArrayList<Integer> array = new ArrayList<Integer>();
        for (int i = 0; i < posicion; i++) {
            if( i <= 1){
                array.add(i);
            }else{
                int siguiente = array.get(i - 1) + array.get(i - 2);
                array.add(siguiente);
            }
            
        }
        return array;
    }
}