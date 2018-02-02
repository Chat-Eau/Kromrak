package Game.Test;

import Game.Choice;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class Test_Choice {
    @Test
    public void testChoiceConfirmation(){
        List<String> choiceList = new ArrayList<>();
        choiceList.add("Jimmon the pirate, great conqueror of the nine seas");
        choiceList.add("Bon");
        choiceList.add("Glu");
        Choice choice = new Choice(choiceList);
        assert choice.getMessage().getText().equals("Jimmon the pirate, great conqueror of the nine seas-/-Bon-/-Glu");
        assert choice.confirmChoice("Bon");
        assert choice.confirmChoice("Glu");
        assert choice.confirmChoice("Jimmon the pirate, great conqueror of the nine seas");
        assert !choice.confirmChoice("");
        assert !choice.confirmChoice("the pirate");
        assert !choice.confirmChoice("Jimmon the pirate, great conqueror of the nine frozen seas");
        assert !choice.confirmChoice("Jimmon the pirate, great conqueror of the nine seas of blood");
    }
    @Test
    public void testSendChoiceToGameCycle(){
        //TODO: Test Cycle's message list to make sure the request is in there
        List<String> choiceList = new ArrayList<>();
        choiceList.add("Jimmon the pirate, great conqueror of the nine seas");
        choiceList.add("Bon");
        choiceList.add("Glu");
        Choice choice = new Choice(choiceList);
        choice.sendRequest();
        assert choice.confirmChoice("Bon");
    }
}
