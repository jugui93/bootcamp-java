/**
 * PuzzleJava
 */
import java.util.ArrayList;
import java.util.Random;
public class PuzzleJava {

    Random randMachine = new Random();

    public ArrayList<Integer> getTenRolls() {
        ArrayList<Integer> randomArray = new ArrayList<Integer>(10);
        for( int i = 0; i < 10; i++){
            Integer randomInt = randMachine.nextInt(21);
            randomArray.add(randomInt);
        }
        return randomArray;
    }

    public char getRandomLetter () {
        ArrayList<Character> alphabetArray = new ArrayList<Character>();
        for (int i = 0; i < 25; i++) {
            char letter = (char) (i + 65); 
            alphabetArray.add(letter);
        }
        int randomIndex = randMachine.nextInt(25);
        char randomLetter = alphabetArray.get(randomIndex);
        return randomLetter;
    }

    public String generatePassword(){
        String password = "";
        for (int i = 0; i < 8; i++) {
            String randomChar = String.valueOf(getRandomLetter());
            password += randomChar ;
        }
        return password;
    }

    public ArrayList<String> getNewPasswordSet(int length) {
        ArrayList<String> passwordSet = new ArrayList<String>();
        for (int i = 0; i < length; i++) {
            String password = generatePassword();
            passwordSet.add(password);
        }
        return passwordSet;
    }

    public ArrayList<Integer> shuffleArray (ArrayList<Integer> array){
        System.out.println("Initial array \n"+ array);
         for (int i = 0; i < array.size(); i++) {
            int randomIndex = randMachine.nextInt(array.size());
            Integer temp0 = array.get(i);
            Integer temp1 = array.get(randomIndex);
            array.set(i, temp1 );
            array.set(randomIndex, temp0);
         }
         System.out.println("Final array");
         return array;
    }
    
}