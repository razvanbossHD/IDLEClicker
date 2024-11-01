package save;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import clicker.Clicker;

public class Write {
    public static int load()
        {
            try {
          File myObj = new File("Progres.txt");
          Scanner myReader = new Scanner(myObj);
          while (myReader.hasNextLine()) {
            String data = myReader.nextLine();
            String check = data.replaceAll("[0-9]","");
            switch (check) {
                case "Bani=":
                    Clicker.bani = Double.parseDouble(data.replaceAll("[^0-9]", ""));
                    break;
                default:
                    throw new AssertionError();
            }
          }
          myReader.close();
        } catch (FileNotFoundException e) {
          System.out.println("An error occurred.");
          e.printStackTrace();
        }
            return 1;
        }
        public static void save()
        {
            try {
                FileWriter myWriter = new FileWriter("Progres.txt");
                myWriter.write("Bani=4");
                myWriter.close();
            } catch (IOException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }
        }
    
    }

