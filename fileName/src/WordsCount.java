import sun.swing.text.CountingPrintable;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by egas on 3/18/17.
 */
public class WordsCount {
    public static void uniqueSearch() throws IOException {
        Scanner fileScanner = new Scanner(new FileReader("newFile"));
        int i = 0;
        while (fileScanner.hasNext()) {
            fileScanner.next();
            i++;
        }
       //костыль. найти как возвращить Scanner после next
        Scanner fileScanner2 = new Scanner(new FileReader("newFile"));
        String[] StringCount = new String[i];
        i = 0;
        //присвоение слов
        while (fileScanner2.hasNext()) {
            StringCount[i] = fileScanner2.next();
            i++;
        }
        //!
        Arrays.sort(StringCount);
        /*  */
        String[] CountUnique = new String[StringCount.length];
        int[] CountInt = new int[StringCount.length];
        CountUnique[0] = StringCount[0];
        CountInt[0]--;  //костыль
        int u = 0;
        //сука так долго мучался....
        for (i=0;i < StringCount.length; i++) {
            if (StringCount[i].equals(CountUnique[u])) {
                CountInt[u]++;}
                else{
                    u++;
                    CountUnique[u] = StringCount[i];
                }
            }
        for (i=0;i <= u; i++) {
            CountInt[i]++; //костыль
            System.out.println(CountUnique[i] + "=" + CountInt[i]);
        }
    }
}

