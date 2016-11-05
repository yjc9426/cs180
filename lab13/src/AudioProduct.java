/**
 * Created by yuan105 on 7/26/16.
 */
public abstract class AudioProduct extends Product {
    //String productName;
    int totalSongs;

    public AudioProduct(String productName, int totalSongs) {
        super(productName);
        //this.productName = productName;
        this.totalSongs = totalSongs;
    }

    public int getTotalSongs() {
        return totalSongs;
    }
}
