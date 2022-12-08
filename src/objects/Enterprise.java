package objects;


public class Enterprise {
	private String name;
	private int id;

	/* QUANTITES */

	private int cash = 80000;			// cash de l'entreprise
	private int materials = 100;		// quantité de matières premières
	private int employees = 10;			// nombre d'employés
	

	/* NOTES */

	private float innovation = 30;				// note d'innovation


	/* PRODUCTION */

	private float matieralsPerProduct = 1;	// nombre de matières premières pour faire un produit
	private float employeesPerProduct = 0;	// nombre d'employés pour faire un produit


	/* METHODES */
	
	public Enterprise(String name, int id) {		// constructor
		this.name = name;
		this.id = id;
	}


	/* METHODES GET */


	public String getName() {
		return this.name;
	}


	public int getId() {
		return this.id;
	}


	public int getMaterials() {
		return this.materials;
	}

	public int getEmployees() {
		return this.employees;
	}


	public int getCash() {
		return this.cash;
	}


	public float getInnovation() {
		return this.innovation;
	}


	public float getMaterialsPerProduct() {
		return this.matieralsPerProduct;
	}


	public float getEmployeesPerProduct() {
		return this.employeesPerProduct;
	}


	/* 	METHODES USUELLES */


	public void addCash(int amountToAdd) {				// ajoute du cash
		this.cash += amountToAdd;
	}


	public void removeCash(int amountToRemove) {			// supprime du cash
		this.cash -= amountToRemove;
	}


	public void addMaterials(int amount) {			// ajoute des matières premières
		materials += amount;
	}


	public void removeMaterials(int amount) {		// supprime des matières premières
		materials -= amount;
	}


	public void calculationInnovation(int amountInvested) {		// calcul l'augmentation de la note d'innovation en fonction du montant investi sur le tour meme
		
		/* 

		1000$ du montant investi augmente la note de 1% de ce qu'il manque pour arriver à 100.
		
		A noter qu'un joueur economisant longtemps pour faire un gros investissement d'un seul coup
		aura un léger avantage de note par rapport à celui qui investira un peu chaque tour, même si
		les montants totaux investis par les deux joueurs seront à la fin identiques. 

		*/

		this.innovation += (amountInvested / 1000) * (100 - this.innovation) * 0.1;		
	}																				


	public void upgradeInnovation(int amountInvested) {			// methode permettant d'ameliorer l'innovation avec du cash
		removeCash(amountInvested);
		calculationInnovation(amountInvested);
	}


	
}