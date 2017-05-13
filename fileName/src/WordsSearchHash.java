import java.io.*;
import java.lang.reflect.Array;
import java.util.*;
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
            final Integer put = hashString.put(hashCount, hashString.get(hashCount) == null ? 1 : count + 1);
        }
            System.out.println(hashString);
            System.out.println("Йоба Git");
        //for (i=1;hashString.hashCode())


    }
}
