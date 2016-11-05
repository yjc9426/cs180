import java.util.UUID;

/**
 * Created by yuan105 on 7/7/16.
 */
public class MP4 extends VideoProduct implements Downloadable {
    static final double MOVIE = 4.99;
    static final double TVSERIES = 19.99;

    /*public String getProductName(){
        return name;
    }*/
    public double getPrice(){
        if (type.equals(VideoType.MOVIE))
            return MOVIE;
        else if (type.equals(VideoType.TVSERIES))
            return TVSERIES;
        else
            return 0;
    }
    public String generateDownloadCode(){
        return UUID.randomUUID().toString();
    }
    public MP4(String productName, VideoType type){
        super(productName, type);
    }
    /*public VideoType getType(){
        return this.type;
    }*/
}
