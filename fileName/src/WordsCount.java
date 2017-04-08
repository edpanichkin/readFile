import sun.swing.text.CountingPrintable;

import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by egas on 3/18/17.
 */
public class WordsCount {
    public static void uniqueSearch() throws IOException {
        Scanner fileScanner = new Scanner(new FileReader("newFile"));
        int i = 0;
        String hashCount=new String();
        Map<String,Integer> hashString=new HashMap<String,Integer>();
        while (fileScanner.hasNext()) {
            //fileScanner.next();
           hashCount=fileScanner.next();
           Integer count = hashString.get(hashCount);
           hashString.put(hashCount, hashString.get(hashCount)==null ? 1 : count + 1);
           // hashString.put(hashCount, i);
            System.out.println (hashString);
        }

  //      int[] countInt = new int[i];
 //       String[] stringCount = new String[i];
  //      String[] countUnique = new String[stringCount.length];
//
      //  Scanner fileScanner2 = new Scanner(new FileReader("newFile"));
        //i = 0;
    //    System.out.print (hashString);
        /* проверка зэшей

        /*
        for (int z = 0; z <= i; z++) {
            String val = (String) hashString.get(z);
            // stringCount[z]=hashString.get(z,z);
        }
        */
        //присвоение слов
        //
/*
        while (fileScanner2.hasNext()) {
            stringCount[i] = fileScanner2.next();
            i++;
        }
        //!
        Arrays.sort(stringCount);
        /*  */

        //int[] countInt = new int[stringCount.length];
        // countUnique[0] = stringCount[0];
        //  countInt[0]--;  //костыль
        //int u = 0;
        //сука так долго мучался....
        //  for (i = 0; i < stringCount.length; i++) {
        //   if (stringCount[i].equals(countUnique[u])) {
        //       countInt[u]++;
        //   } else {
        //       u++;
        //       countUnique[u] = stringCount[i];
        //   }
        // }
        //for (i = 0; i <= u; i++) {
        //   countInt[i]++; //костыль
        //   System.out.println(countUnique[i] + "=" + countInt[i]);
        // }
        }
}

