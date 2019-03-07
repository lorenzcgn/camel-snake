package camelsnake;
import java.util.*;

    public class Conversione {
    private String nome;
    Scanner s=new Scanner(System.in);
    
    Conversione (String nome) {
        this.nome=nome;
    }
    
    
    boolean capisciSeSnakeoCamel () {
        boolean snake = false;
        if (nome.contains("_")) {
            snake=true;
            System.out.println("Ok la stringa inserita è di tipo snake");
        }
        else System.out.println("Ok la stringa inserita è di tipo camel");
        return snake;
    }
    
    
    public String conversioneInCamel ()
    {
        String[] parti = nome.split("_");
        String nuovastringa = parti[0];
        for(int i=1; i<parti.length; i++) {
            nuovastringa += parti[i].substring(0,1).toUpperCase() + parti[i].substring(1);
        }
        System.out.println(nuovastringa);
        return nuovastringa;
    }
    
    public String conversioneInSnake ()
    {
        String nuovastringa=null;
        nuovastringa=nome.replaceAll("([A-Z]+)","\\_$1").toLowerCase(); 
        System.out.println(nuovastringa);
        return nuovastringa;
    }
    

    
    
}
