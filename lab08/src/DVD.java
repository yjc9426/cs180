/**
 * Created by yuan105 on 7/7/16.
 */
public class DVD implements Sellable {
    String name;
    double price;
    VideoType type;
    public String getProductName(){
        return name;
    }
    public double getPrice(){
        return price;
    }
    public DVD(String productName, VideoType type, double price){
        name = productName;
        this.type = type;
        this.price = price;
    }
    public VideoType getType(){
        return this.type;
    }
}
