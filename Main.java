
public class Main {

	public static void main(String[] args) {
		
		System.out.println("Bienvenue chez barette!");
		
		createCV();
		

	}
	
	private static void createCV(){
		
		Cv cvJane = new Cv("Menassa", "Jane-Mary", "Dipl�me d'�tude secondaire", "Pas d'experience de travail", "Bonne �l�ve, ponctuel, travaillante, professionel, sociable, d�vou�e", "Travailler dans un environement sain avec des collegues professionel.");
		Cv cvEmile = new Cv("","","","","","");
		Cv cvPhilippe = new Cv("","","","","","");
	}


}
