package snippet;

import java.io.*;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class AdvancedReadFile {
    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<Double> list = new ArrayList<>(); //Will be sending to a list rather than array
        File file = new File(""); //Used a personal directory
        BufferedReader reader = null;
        System.out.println("Current folder: " + file + "\n"); /*Prints the current directory that is set for the file
		Can be modified */
        try {
            //Tells user what will be done
            System.out.println("Java will look there for the file name you enter, unless you enter the full path.\n");
            Scanner filename = new Scanner(System.in);
            //Tells user there is the need for a path and allows for user input through a scanner.
            System.out.print("Enter file name: The default is /Users/giangarcia/eclipse/Project4/src/file1.txt\n");
            file = new File(filename.next());
            filename.close();
            //BufferReader will be the extractor of data within the file, yet it needs a destination and a type to extract.
            reader = new BufferedReader(new FileReader(file));
            String text = null;
            // While data is false inside the file, the list will keep having data added onto it until nothing is left.
            while ((text = reader.readLine()) != null) {
                list.add(Double.parseDouble(text)); //Will be analyzing for Doubles (Parsing)
                //reader.append(list);
            }
        } catch (
                FileNotFoundException e) { //This catches when a file cannot be found in the directed path.
            e.printStackTrace();
        } catch (IOException e) { //This is supposed to catch inputs or outputs
            e.printStackTrace();
        } finally {
            try {
                if (reader != null) { //Once the file is empty, the reader will close
                    reader.close();
                }
            } catch (IOException e) {
            }
        }
        //Beginning of Elementary Calculations
        double average = 0;
        double sum = 0;
        for (double f : list) {
            sum += f;
            average = sum / list.size();
            //System.out.println("The numbers are: " + f); //For the number of indexes
            //System.out.println("The sum is: " + sum + "\nThe number of indexes is " + arr.length); //Debugging the Calculations
        }
        System.out.println("\nThe numbers are: " + list); //Easier way to list the amount of values inside the list/array
        DecimalFormat money = new DecimalFormat("######.000"); //Formatter for output
        System.out.println("The mean is " + money.format(average) + "\nThanks!");
    }
}