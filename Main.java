// Name: Safari Bright Hassan
// StudentId: 297681

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Product> prodList = new ArrayList<>();

        prodList.add(new Computer("LenovoI5","Intel",7985,7));
        prodList.add(new Printer("ScanJet560","HP",6576,8));
        prodList.add(new Scanner("CanoScan","lsla",7874,7));
        prodList.add(new Printer("lazerjet","hp",0134,8));
        prodList.add(new Computer("Toshiba","Toshiba",4134,8));
        prodList.add(new Scanner("Toshibai5","Toshiba",5164,5));
        prodList.add(new Printer("Panasonic","lsla",3534,3));
        prodList.add(new Computer("Dell","Dell",22894,5));
        prodList.add(new Scanner("HPLite","Hp",23533,2));
        prodList.add(new Printer("Scanjet6","Hp",4213,1));


        for (Product prod:prodList){
            System.out.println(prod);
        }
    }
}
