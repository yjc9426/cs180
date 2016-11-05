/**
 * Created by yuan105 on 7/7/16.
 */
public class DVD extends VideoProduct {
    String name;
    double price;
    VideoType type;
    //public String getProductName(){
    //    return name;
    //}
    public double getPrice(){
        return price;
    }
    public DVD(String productName, VideoType type, double price){
        super(productName, type);
        this.price = price;
    }
    //public VideoType getType(){
    //    return this.type;
    //}
}
