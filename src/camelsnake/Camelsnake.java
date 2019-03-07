package camelsnake;
import java.util.*;

public class Camelsnake {


    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
 
        System.out.println("Benvenuto, questo programma ti consente di convertire stringhe piu' o meno lunghe da snake a camel o viceversa.");                               
        
        Conversione stringa=new Conversione("");
        String s1;
        boolean snake;
        
        System.out.println("Inserisci la stringa da convertire: ");
        s1=s.nextLine();
        stringa=new Conversione(s1);
        snake=stringa.capisciSeSnakeoCamel();
        if (snake==false){
            stringa.conversioneInSnake();
        }
        if (snake==true) {
            stringa.conversioneInCamel();
        }
       
    
}
}
