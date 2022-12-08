package objects;

public class Customer {
    private int age;
    private String type = "none";
    
    private double innovationSens;
    private double brandImageSens;
    private int priceCap;


    public Customer(int age) {
        this.age = age;
        defineType();
        defineCarac();
    }


    public boolean defineType() {
        String currentType = this.type;
        
        if (this.age < 16) {
            this.type = "passive";
        } 
        
        else if (this.age < 30) {
            this.type = "young";
        }

        else if (this.age < 60) {
            this.type = "adult";
        }

        else if (this.age < 85) {
            this.type = "old";
        }

        else {
            this.type = "dead";
        }

        if (this.type != currentType) {
            return true;
        }

        else {
            return false;
        }
    }


    public void defineCarac() {
        switch(this.type) {
            case "passive":
                this.priceCap = -1;
                this.brandImageSens = -1;
                this.innovationSens = -1;
                break;
            
            case "young":
                this.priceCap = 450;
                this.brandImageSens = 0.2;
                this.innovationSens = 0.3;
                break;

            case "adult":
                this.priceCap = 630;
                this.brandImageSens = 0.3;
                this.innovationSens = 0.4;
                break;

            case "old":
                this.priceCap = 540;
                this.brandImageSens = 0.4;
                this.innovationSens = 0.2;
                break;

            case "dead":
                this.priceCap = -1;
                this.brandImageSens = -1;
                this.innovationSens = -1;
                break;
        }
    }


    public String getType() {
        return this.type;
    }


    public void getOlder() {
        this.age++;
        boolean typeHasChanged = defineType();

        if (typeHasChanged) {
            defineCarac();
        }
    }
}
