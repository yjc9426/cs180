import java.io.*;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
/**
 * Created by yuan105 on 7/28/16.
 */
public class Stats {
    static HashMap<String,Integer> map;
    public Stats() {
        map = new HashMap<String,Integer>();
    }
    public static HashMap wins (File f) {
        try {
            BufferedReader bf = new BufferedReader(new FileReader(f));
            String[] line;
            String s = "";
            while ((s = bf.readLine()) != null) {
                System.out.println(s);
                line = s.split(" ");
                if (line[0].equals("0")) {
                    for (int i = 1; i < 6; i++) {
                        if (map.get(line[i]) == null) {
                            map.put(line[i], 1);
                        }
                        else
                            map.put(line[i], map.get(line[i]) + 1);
                    }
                }
                else if (line[0].equals("1")) {
                    for (int i = 7; i < line.length; i++) {
                        if (map.get(line[i]) == null) {
                            map.put(line[i], 1);
                        }
                        else
                            map.put(line[i], map.get(line[i]) + 1);
                    }
                }
                else {
                    System.out.println("error");
                    break;
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return map;
    }

    public static void main(String[] args) throws FileNotFoundException {
        Stats s = new Stats();
        URL path = Stats.class.getResource("lab14inputfile.txt");
        File f = new File(path.getFile());
        //File f = new File("/homes/yuan105/cs180/lab14/src/lab14inputfile.txt");
        s.wins (f);
        for (String key : s.map.keySet()) {
            System.out.println(key + " " + s.map.get(key));
        }

    }
}
