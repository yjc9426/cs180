import java.util.UUID;
/**
 * Created by yuan105 on 7/7/16.
 */
public class MP3 implements Sellable, Downloadable {
    String name;
    static final double PRICE = 0.99;

    public String getProductName(){
        return name;
    }
    public double getPrice(){
        return PRICE;
    }
    public String generateDownloadCode(){
        return UUID.randomUUID().toString();
    }
    public MP3(String productName){
        this.name = productName;
    }
}
