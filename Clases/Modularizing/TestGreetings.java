public class TestGreetings {
    public static void main(String[] args) {
        
    	// Para usar los métodos de saludos
    	// crea una variable de tipo Greetings
    
    	Greetings greeterApp = new Greetings();
 
    	// Usa la variable para acceder a los métodos de Greetings
    	// utilizando notación de puntos.
    
        String dateMessage = greeterApp.getCurrentDate();
        String greetEnglish = greeterApp.greetEnglish("Jhon");
        System.out.println(dateMessage);
        System.out.println(greetEnglish);
    }
}
