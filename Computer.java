public class Computer extends Product{

    private static final int purchasePrice=800000;
    int quantity;

    public Computer(String name, String manufacturer, int versionNum, int quantity) {
        super(name, manufacturer, versionNum);
        this.quantity=quantity;
    }
    public int dispPrice(){
        return purchasePrice*quantity;
    }
    public int dispQuant(){
        return quantity;
    }
    public int storeValue(){
        return purchasePrice+quantity;
    }
    public String prodName(){
        return "Computer";
    }
    public String toString() {
        return super.toString()+"\t"+purchasePrice+"\t"+dispQuant()+"\t"+dispPrice()+"\t"+storeValue()+"\t"+prodName();
    }

}
