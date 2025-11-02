import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Gianni.MetodoSomma;

public class Main {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);
        int scl=0;

        List <Integer>list= new ArrayList();

        do{

            System.out.println("Inserisci i numeri(Digita 0 per uscire): ");
            scl=scanner.nextInt();

            if(scl!=0){
                list.add(scl);
            }

        }while(scl!=0);

        int rls=0;

        for (Integer integer : list) {
            rls += integer;
        }
        System.out.println("Il risultato della somma è : " + rls);
        

        MetodoSomma ms= new MetodoSomma();
        int risultato= ms.somma(5, 10);
        System.out.println("Il risultato della somma di 5 e 10 è: " + risultato);


    }




}