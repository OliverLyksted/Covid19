import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Scanner;

public class FileHandler {
  private final File f;
    ArrayList<Covid19Data>  loadAlldata = new ArrayList<>();

  public FileHandler(){
      f = new File("11_noegletal_pr_region_pr_aldersgruppe.csv");
  }
    public void parseData(){

        Scanner scan = null;

        try {
            scan = new Scanner(f, StandardCharsets.ISO_8859_1);
            scan.nextLine();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }

        Covid19Data data = null;
        while (scan.hasNext()) {
            String line = scan.nextLine();
            String[] attributes = line.split(";");
            String region =attributes[0].trim();
            String aldersgruppe = attributes[1].trim();
            int bekræftedeTilfælde = Integer.parseInt(attributes[2].trim());
            int døde = Integer.parseInt(attributes[3].trim());
            int indlagtePåIntensiv = Integer.parseInt(attributes[4].trim());
            int indlagte = Integer.parseInt(attributes[5].trim());
            String dato =attributes[6].trim();

            Covid19Data dataCovid = new Covid19Data(region, aldersgruppe, bekræftedeTilfælde, døde, indlagtePåIntensiv, indlagte, dato);
                loadAlldata.add(dataCovid);
            }


        scan.close();

        }
        public void printCovidData(){
            for (Covid19Data data:loadAlldata) {
                System.out.println(data);

            }
        }

    }



