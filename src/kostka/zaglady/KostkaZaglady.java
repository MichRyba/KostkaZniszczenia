package kostka.zaglady;

import java.util.Random;

public class KostkaZaglady {
    
    public static void main(String[] args) {
        
        int x, y;
        Random dice = new Random();
        Player player = new Player();
        
            do {
                x = dice.nextInt(6) + 1;
                y = player.guess();
                
                System.out.println("Wylosowane: " + x);
                System.out.println("Gracz "+ player.getName() +": " + y);
                System.out.println("");
                
            } while(y != x);
        
        System.out.println("u win");
    }
}