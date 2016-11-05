/**
 * Created by yuan105 on 7/7/16.
 */
public class CD extends AudioProduct {
    double price;

    /*public String getProductName(){
        return name;
    }*/
    public double getPrice(){
        return price;
    }
    public CD(String productName, int totalSongs, double price){
        super(productName, totalSongs);
        this.price = price;
    }
    /*public int getTotalSongs(){
        return this.totalSongs;
    }*/

}
