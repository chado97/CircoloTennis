package util.Libs;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.LinkedList;

/**
 * Creato da Vlady il 16/04/2016.
 * in origine parte del progetto:
 * CircoloTennis
 */
public class FileUtils {

    public static LinkedList<String> readLines(File file) throws Exception {
        if (!file.exists()) {
            return new LinkedList<String>();
        }
        BufferedReader reader = new BufferedReader(new FileReader(file));
        LinkedList<String> results = new LinkedList<String>();
        String line = reader.readLine();
        while (line != null) {

            //scommentare la riga seguente per stampare riga per riga le stringhe in lettura
            //System.out.println(line);

            results.add(line);
            line = reader.readLine();
        }
        return results;
    }
}
