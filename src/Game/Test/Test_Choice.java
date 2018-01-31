package Game.Test;

import Game.Choice;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class Test_Choice {
    @Test
    public void testNormalChoice(){
        List<String> choiceList = new ArrayList<>();
        choiceList.add("Jimmon the pirate, great conqueror of the nine seas");
        choiceList.add("Bon");
        choiceList.add("Glu");
        Choice choice = new Choice(choiceList);
        assert choice.getMessage().getText().equals("Jimmon the pirate, great conqueror of the nine seas-/-Bon-/-Glu");
        choice.sendRequest();
        choice.receiveChoice();
        assert 1 == 1;
    }
}
