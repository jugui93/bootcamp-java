import java.util.HashMap;
import java.util.Set;

/**
 * Hashmatique
 */
public class Hashmatique {

    public static void main(String[] args) {
        // Crear un tarcList de tipo HashMap
        HashMap<String, String> trackList = new HashMap<String, String>();
        // Agregar al menos 4 canciones alamcenadas por titulo
        trackList.put("Photograph", "Loving can hurt, loving can hurt sometimes");
        trackList.put("Shape of you", "Girl, you know I want your love");
        trackList.put("Thinking Out Loud", "When your legs don't work like they used to before");
        trackList.put("Lay It All on Me", "All alone as you look through the door");
        // Extraer una cancion por su titulo
        System.out.println(trackList.get("Photograph"));
        Set<String> keys = trackList.keySet();
        //Imprimir todos los nombres de las pistas y las letras
        
        for(String key : keys) {
            System.out.println(key + " : " + trackList.get(key));   
        }
    }
}