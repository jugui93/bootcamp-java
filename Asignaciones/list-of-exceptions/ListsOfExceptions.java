import java.util.ArrayList;

public class ListsOfExceptions {
    public static void main(String[] args) {
        ArrayList<Object> myList = new ArrayList<Object>();
        myList.add(13);
        myList.add("Hola Mundo");
        myList.add(48);
        myList.add("Adios Mundo");

        for ( int i = 0; i < myList.size(); i++) {

            try{ 
                int castedValue = (int) myList.get(i);
                System.out.println(castedValue);
            }catch (ClassCastException e) {
                System.out.println(e + "index "+ i + "Value " + myList.get(i));
            }

            
        }

    }
}