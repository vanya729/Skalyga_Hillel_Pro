package RockPaperScissors;

import java.util.ArrayList;
import java.util.List;

public class Computer {

    public static Item getRandomItemForComputer(){
        List<Item> itemListForComputer= new ArrayList<>();
        itemListForComputer.add(Item.Paper);
        itemListForComputer.add(Item.Rock);
        itemListForComputer.add(Item.Scissors);
        int index = (int) (Math.random() * itemListForComputer.size());
        return itemListForComputer.get(index);
    }
}
