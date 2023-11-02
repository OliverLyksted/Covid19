import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Scanner;

public class Covid19Data {
    private String region;
    private String aldersgruppe;
    private int bekræftedeTilfælde;
    private int døde;
    private int indlagtePåIntensiv;
    private int indlagte;
    private String dato;

    public Covid19Data(String region, String aldersgruppe, int bekræftedeTilfælde, int døde, int indlagtePåIntensiv, int indlagte, String dato) {
        this.region = region;
        this.aldersgruppe = aldersgruppe;
        this.bekræftedeTilfælde = bekræftedeTilfælde;
        this.døde = døde;
        this.indlagtePåIntensiv = indlagtePåIntensiv;
        this.indlagte = indlagte;
        this.dato = dato;
    }


    public String toString(){
        return " Region: " + region + ", Aldersgruppe: " +  aldersgruppe + ", Bekræftede Tilfælde: " +  bekræftedeTilfælde + ", Døde: " +  døde + ", Indlagte På Intensiv: " + indlagtePåIntensiv + ", Indlagte: " +  indlagte + ", Dato: " + dato;
    }
    }



