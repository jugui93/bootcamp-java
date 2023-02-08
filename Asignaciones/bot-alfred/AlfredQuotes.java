import java.text.SimpleDateFormat;
import java.util.Date;
public class AlfredQuotes {
    
    public String basicGreeting() {
        // No necesitas codificar aquI, este es un método de ejemplo
        return "Hola, encantado de verte. ¿Cómo estás?";
    }
    
    public String guestGreeting() {
        // TU CODIGO AQUI
        Date date = new Date();
        SimpleDateFormat hourFormat = new SimpleDateFormat("HH");
        int hour = Integer.parseInt(hourFormat.format(date)) ;
        if(hour >= 6 && hour < 12) {
            return "Buenos dias, Encantado de verte";
        } else if (hour >= 12 && hour < 18) {
            return "Buenos tardes, Encantado de verte";
        } else {
            return "Buenas noches, Encantado de verte";
        }
    }
    public String guestGreeting(String name) {
        // TU CODIGO AQUI
        return "Hola, " + name + ". Encantado de verte.";
    }

    public String guestGreeting(String name, String dayPeriod) {
        // TU CODIGO AQUI
        switch(dayPeriod){
            case "mañana":
            return "Buenos dias, " + name + ". Encantado de verte";
            case "tarde":
            return "Buenos tardes, " + name + ". Encantado de verte";
            case "noche":
            return "Buenas noches, " + name + ". Encantado de verte";
            default:
            return "Hola, " + name + ". Encantado de verte";
        }
        
    }
    
    public String dateAnnouncement() {
        // TU CODIGO AQUI
        Date date = new Date();
        return "Actualmente es " + date;
    }
    
    public String respondBeforeAlexis(String conversation) {
        // TU CODIGO AQUI
        if (conversation.indexOf("Alexis") >= 0){
            return "De inmediato, señor. Ciertamente no es lo suficientemente sofisticada para eso";
        }else if (conversation.indexOf("Alfred") >= 0){
            return "A su servicio. Como desee, naturalmente";
        }else {
            return "Bien. Y con eso, me retiraré";
        }
        
    }

    public void toggleRadio(String conversation) {
        // TU CODIGO AQUI
        Boolean radioState = false;
        if (conversation.indexOf("radio") >= 0 ){
            radioState = !radioState;
        }
    }
    
	// BONUS NINJA
	// Ver las especificaciones para sobrecargar el método guessGreeting
    //="comment from-rainbow">// BONUS SENSEI
    // ¡Escribe tu propio método AlfredQuotes usando cualquiera de los métodos String que has aprendido!
}

