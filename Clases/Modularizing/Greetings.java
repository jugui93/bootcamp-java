import java.util.Date;
class Greetings {
    public String getCurrentDate() {
        System.out.println("hola Emily");
        Date date = new Date();
        return "La fecha actual es: " + date;
    }
    public String greetEnglish(String name) {
        return "Hello, " + name;
        
    }
    public String greetSpanish(String name) {
        return "Hola, " + name;
        
    }
}