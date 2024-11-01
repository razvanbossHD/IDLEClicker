package clicker.Metode;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Read {

    public static int Nrbutoanerandom()
    {
        try {
      File myObj = new File("Progres.txt");
      Scanner myReader = new Scanner(myObj);
      while (myReader.hasNextLine()) {
        String data = myReader.nextLine();
        if(data.contains("Nrbutoanerandom:"))
            return Integer.parseInt(data);
        
      }

      myReader.close();
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
        return 1;
    }
}
