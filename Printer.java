public class Printer extends Product{
    private static final int purchasePrice=500000;
    int quantity;
    public Printer(String name, String manufacturer, int versionNum, int quantity) {
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
        return "Printer";
    }
    public String toString() {
        return super.toString()+"\t"+purchasePrice+"\t"+dispQuant()+"\t"+dispPrice()+"\t"+storeValue()+"\t"+prodName();
    }
}
