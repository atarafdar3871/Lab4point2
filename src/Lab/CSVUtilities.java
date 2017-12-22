package Lab;

import java.io.*;
import java.util.*;

public class CSVUtilities {
	private ArrayList<String> CSVData = new ArrayList<String>();
	private int numColumns;
	public static void main(String[] args) {
		CSVParser("C:\\Users\\BT_1N3_18\\git\\Lab4point2\\hie\\src\\Lab\\music.csv");
	}
	
	public static void CSVParser(String csvFile){
        BufferedReader br = null;
        String line = "";
        String cvsSplitBy = ",";

        try {

            br = new BufferedReader(new FileReader(csvFile));
            while ((line = br.readLine()) != null) {

                System.out.println(line);

            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }

	
	
}
