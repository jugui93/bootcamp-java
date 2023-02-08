import java.util.ArrayList;
public class TestPuzzleJava {
    
	public static void main(String[] args) {
		PuzzleJava generator = new PuzzleJava();
		ArrayList<Integer> randomRolls = generator.getTenRolls();
		System.out.println(randomRolls);
		
    	//..
		// Escribe tus otros casos de prueba aquí.
		//..
        System.out.println(generator.getRandomLetter());
        System.out.println(generator.generatePassword());
        System.out.println(generator.getNewPasswordSet(5 ));

        System.out.println(generator.shuffleArray(randomRolls));

	}
}

