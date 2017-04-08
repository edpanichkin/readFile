import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by egas on 4/8/17.
 */
public class WordsSearchHash {
        public static void uniqueSearchHash () throws IOException {
        Scanner fileScanner = new Scanner(new FileReader("newFile"));
        int i = 0;
        String hashCount = new String();
        Map<String, Integer> hashString = new HashMap<String, Integer>();
        while (fileScanner.hasNext()) {;
            hashCount = fileScanner.next();
            Integer count = hashString.get(hashCount);
            hashString.put(hashCount, hashString.get(hashCount) == null ? 1 : count + 1);
        }
            System.out.println(hashString);
    }
}
