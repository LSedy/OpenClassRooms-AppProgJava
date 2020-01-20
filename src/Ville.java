
	public class Ville {
//Stocke le nom de la ville
//Stock the name of the city
	String nomVille;
//Stocke le nom du pays de la ville
//Stock the name of the country of this city
	String nomPays;
//Stocke le nombre d'habitant de la ville
//Stock the number of citizen/people of the city
	int nbreHabitants;

//constructeur par défault
//builder by default
public Ville() {
	System.out.println("Création d'une ville !");
	nomVille = "Carcossa";
	nomPays = "Essos";
	nbreHabitants = 0;
	}

//Constructeur avec paramètres
//J'ai ajouté un « p » en première lettre des paramètres.
//Ce n'est pas une convention, mais ça peut être un bon moyen de les repérer.
public Ville(String pNom, int pNbre, String pPays)
{
  System.out.println("Création d'une ville avec des paramètres !");
  nomVille = pNom;
  nomPays = pPays;
  nbreHabitants = pNbre;
}  
	
	
	
}	
	

	

	
	