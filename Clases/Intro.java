import java.util.ArrayList;

/**
 * Intro
 */
public class Intro {

    public static void main(String[] args) {
        System.out.println("Hola mundo!");

        // Variables primitivas
        int miNumero;
        miNumero = 400;
        double pi = 3.1416;
        boolean bool = true;
        char singleChar = 'A';

        String multiplesChars = "ABC";

        //Variables tipo objeto
        Integer myInt = 5;
        Double myDouble = 5.99;
        Character myChar = 'A';

        System.out.println(miNumero);
        System.out.println(pi);
        System.out.println(bool);
        System.out.println(singleChar);
        System.out.println(multiplesChars);
        System.out.println(myInt);
        System.out.println(myDouble);

        //Cadenas - Strings
        String cadena = "Buenas noches a todos mis compañeros";
        int length = cadena.length();
        System.out.println("La longitud de la cadena es: " + length);
        char letra = cadena.charAt(1);
        System.out.println("La letra en la posicion 1 es: "+ letra);

        int a = cadena.indexOf("mis");
        System.out.println(a);

        System.out.println(cadena.toLowerCase());
        System.out.println(cadena.toUpperCase());

        String str1 = "Mi nombre es";
        String str2 = "Emily Morales";
        String str3 = str1.concat(str2);
        System.out.println(str3);

        int[] myArray = {4, 8, 8, 5, 9};

        ArrayList<Integer> myArray2 = new ArrayList<>();

    }
}