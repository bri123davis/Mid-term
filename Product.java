
public class Product {
    String name;
    String manufacturer;
    int versionNum;

    public Product(String name, String manufacturer, int versionNum) {
        this.name = name;
        this.manufacturer = manufacturer;
        this.versionNum = versionNum;
    }
    public String toString() {
        return name +"\t"+ manufacturer+"\t"+versionNum;
    }

}
