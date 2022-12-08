package objects;


public class Product {
	
	private int id[];							// id du produit de forme [numero de produit dans l'entreprise, id de l'entreprise]

	private float innovation;					// note d'innovation egale à l'innovation de l'entreprise au moment de la création
	private float productBrandImage = 30;		// note d'image publicitaire du produit

	private int onSale;							// nombre de produits en vente
	private int onStock;						// nombre de produits en stock 
	private int price;							// prix de vente du produit


	public Product(int idEnterprise, int nbProduct, float innovation) {	// constructor
		this.id = new int[2];
		this.id[0] = idEnterprise;
		this.id[1] = nbProduct;

		this.innovation = innovation;
	}


	/* METHODES GET */


	public int[] getId() {
		return this.id;
	}


	public float getInnovation() {
		return this.innovation;
	}


	public float getProductBrandImage() {
		return this.productBrandImage;
	}


	public int getOnSale() {
		return this.onSale;
	}


	public int getOnStock() {
		return this.onStock;
	}

	
	public int getPrice() {
		return this.price;
	}


	/* METHODES USUELLES */

	public void upgradeProductBrandImage(int amountInvested) {
		
		/* 

		1000$ du montant investi augmente la note de 1% de ce qu'il manque pour arriver à 100.
		
		A noter qu'un joueur economisant longtemps pour faire un gros investissement d'un seul coup
		aura un léger avantage de note par rapport à celui qui investira un peu chaque tour, même si
		les montants totaux investis par les deux joueurs seront à la fin identiques. 

		*/
		
		productBrandImage += (amountInvested / 1000) * (100 - this.productBrandImage) * 0.01;
		
	}


	public void addOnSale(int amountToAdd) {			// met des produits en vente
		this.onSale += amountToAdd;
	}


	public void addOnStock(int amountToAdd) {			// met des produits en stock
		this.onStock += amountToAdd;
	}


	public void removeOnSale(int amountToRemove) {		// retire des produits de la vente
		this.onSale -= amountToRemove;
	}
	
	
	public void removeOnStock(int amountToRemove) {		// retire des produits du stock
		this.onStock -= amountToRemove;
	}


	public void stockToSale(int amountToMove) {			// transfert du stock vers la vente
		this.onStock -= amountToMove;
		this.onSale += amountToMove;
	}

	
	public void saleToStock(int amountToMove) {			// transfert de la vente vers le stock
		this.onStock += amountToMove;
		this.onSale -= amountToMove;
	}
}