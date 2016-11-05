/**
 * Created by yuan105 on 7/26/16.
 */
public abstract class VideoProduct extends Product {
    VideoType type;
    //String productName;

    public VideoProduct(String productName, VideoType type) {
        super(productName);
        this.type = type;
        //this.productName = productName;
    }

    public VideoType getType() {
        return type;
    }

}
