
public class Main {

	public static void main(String[] args) {
		
		System.out.println("Bienvenue chez barette!");
		
		createCV();
		

	}
	
	private static void createCV(){
		
		CV cvJane = new CV("Menassa", "Jane-Mary", "Dipl�me d'�tude secondaire", "Pas d'experience de travail", "Bonne �l�ve, ponctuel, travaillante, professionel, sociable, d�vou�e", "Travailler dans un environement sain avec des collegues professionel.");
		CV cvPhilippe = new CV("","","","","","");
		CV cvEmile = new CV("Brunelle", "�mile", "Soutien informatique", "4 ans au soutien technique", "Windows Server, D�pannage de PC", "Bonnes conditions");
		
	}


}
