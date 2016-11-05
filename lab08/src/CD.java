/**
 * Created by yuan105 on 7/7/16.
 */
public class CD implements Sellable {
    String name;
    double price;
    int totalSongs;
    public String getProductName(){
        return name;
    }
    public double getPrice(){
        return price;
    }
    public CD(String productName, int totalSongs, double price){
        name = productName;
        this.totalSongs = totalSongs;
        this.price = price;
    }
    public int getTotalSongs(){
        return this.totalSongs;
    }

}
