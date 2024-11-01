package save;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import battle.Battle;
import clicker.Clicker;
import fishing.Fishing;

public class Write {
    public static int load()
        {
            try {
          File myObj = new File("src\\main\\java\\save\\Save");
          Scanner myReader = new Scanner(myObj);
          while (myReader.hasNextLine()) {
            String data = myReader.nextLine();
            String check = data.replaceAll("[0-9]","");
            check = check.replace(".","");
            switch (check) {
                case "Bani=":
                    Clicker.bani = Double.parseDouble(data.replaceAll("[^\\d\\.]", ""));
                    break;
                case "val=":
                    Battle.up.val = Double.parseDouble(data.replaceAll("[^\\d\\.]", ""));
                    break;
                case "hp=":
                    Battle.up.hp = Double.parseDouble(data.replaceAll("[^\\d\\.]", ""));
                    break;
                case "dam=":
                    Battle.up.dam = Double.parseDouble(data.replaceAll("[^\\d\\.]", ""));
                    break;
                case "spd=":
                    Battle.up.spd = Double.parseDouble(data.replaceAll("[^\\d\\.]", ""));
                    //System.out.println(Battle.up.spd);
                    break;
                case "chn=":
                    Battle.up.chn = Double.parseDouble(data.replaceAll("[^\\d\\.]", ""));
                    break;
                case "cri=":
                    Battle.up.cri = Double.parseDouble(data.replaceAll("[^\\d\\.]", ""));
                case "money=":
                    Battle.money = Double.parseDouble(data.replaceAll("[^\\d\\.]", ""));
                case "score=":
                    Fishing.score = Integer.parseInt(data.replaceAll("[^0-9]", ""));
                break;  
                case "clickPower=":
                    Fishing.clickPower = Integer.parseInt(data.replaceAll("[^0-9]", ""));
                break;
                case "upgradeSpeedCost=":
                    Fishing.upgradeSpeedCost = Integer.parseInt(data.replaceAll("[^0-9]", ""));
                break;
                case "upgradeRarityCost=":
                    Fishing.upgradeRarityCost = Integer.parseInt(data.replaceAll("[^0-9]", ""));
                break;
                case "commonFishChance=":
                    Fishing.commonFishChance = Integer.parseInt(data.replaceAll("[^0-9]", ""));
                break;
                case "rareFishChance=":
                    Fishing.rareFishChance = Integer.parseInt(data.replaceAll("[^0-9]", ""));
                break;
                case "legendaryFishChance=":
                    Fishing.legendaryFishChance = Integer.parseInt(data.replaceAll("[^0-9]", ""));
                break;
                default :
                    System.out.println(check);
                    break;
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
        {   System.out.println("salvat");
            try {
                FileWriter myWriter = new FileWriter("src\\main\\java\\save\\Save");
                myWriter.write("Bani="+Clicker.bani+"\n");
                myWriter.write("val="+Battle.up.val+"\n");
                myWriter.write("hp="+Battle.up.hp+"\n");
                myWriter.write("dam="+Battle.up.dam+"\n");
                myWriter.write("spd="+Battle.up.spd+"\n");
                myWriter.write("chn="+Battle.up.chn+"\n");
                myWriter.write("cri="+Battle.up.cri+"\n");
                myWriter.write("money="+Battle.money+"\n");
                myWriter.write("score="+Fishing.score+"\n");
                myWriter.write("clickPower="+Fishing.clickPower+"\n");
                myWriter.write("upgradeSpeedCost="+Fishing.upgradeSpeedCost+"\n");
                myWriter.write("upgradeRarityCost="+Fishing.upgradeRarityCost+"\n");
                myWriter.write("commonFishChance="+Fishing.commonFishChance+"\n");
                myWriter.write("rareFishChance="+Fishing.rareFishChance+"\n");
                myWriter.write("legendaryFishChance="+Fishing.legendaryFishChance+"\n");
                myWriter.close();
                System.out.println("succes");
            } catch (IOException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }
        }
    
    }