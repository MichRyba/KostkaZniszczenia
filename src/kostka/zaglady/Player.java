
package kostka.zaglady;

import java.util.Random;


public class Player {
    
    Random dice = new Random();
    
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public int guess(){
        return dice.nextInt(6) +1;   
    };
}
