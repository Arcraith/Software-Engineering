import java.util.*;

public class Studienberatung {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		String antwort = scanner.next();
		if(antwort.equalsIgnoreCase("J")){
			System.out.println("Bist du wissbegierig?");
			antwort = scanner.next();
			if(antwort.equalsIgnoreCase("J")){

			} else if(antwort.equalsIgnoreCase("N")){
				System.out.println("Nicht studieren");
			}
		} else if(antwort.equalsIgnoreCase("N")){
			
		}
	}
}