public class Enterprise {
	String name;
	int id;

	/* QUANTITES */

	int cash = 80000;			// cash de l'entreprise
	int materials = 100;		// quantité de matières premières
	int employees = 10;			// nombre d'employés
	

	/* NOTES */

	float innovation = 30;				// note d'innovation
	int totalInvestedInnovation = 0; 	// montant total investi dans l'innovation


	/* PRODUCTION */

	float matieralsPerProduct = 1.0;	// nombre de matières premières pour faire un produit
	float employeesPerProduct = 0.1;	// nombre d'employés pour faire un produit


	/* METHODS */
	
	public Enterprise(String name, Strind id) {		// constructor
		this.name = name;
		this.id = id;
	}


	public void addCash(int amount) {				// ajoute du cash
		this.cash += amount;
	}


	public void removeCash(int amount) {			// supprime du cash
		this.cash -= amount;
	}


	public void addMaterials(int amount) {			// ajoute des matières premières
		materials += amount;
	}


	public void removeMaterials(int amount) {		// supprime des matières premières
		materials -= amount;
	}


	public void calculationInnovation(float amountInvested) {		// calcul l'augmentation de la note d'innovation en fonction du montant investi sur le tour meme
		
		/* 

		1000$ du montant investi augmente la note de 1% de ce qu'il manque pour arriver à 100.
		
		A noter qu'un joueur economisant longtemps pour faire un gros investissement d'un seul coup
		aura un léger avantage de note par rapport à celui qui investira un peu chaque tour, même si
		les montants totaux investis par les deux joueurs seront à la fin identiques. 

		*/

		this.innovation += (amountInvested / 1000) * (100 - innovation) * 0.1;		
	}																				


	public void upgradeInnovation(int amount) {			// methode permettant d'ameliorer l'innovation avec du cash
		removeCash(amount);
		totalInvestedInnovation += amount;
		calculationInnovation();
	}
}