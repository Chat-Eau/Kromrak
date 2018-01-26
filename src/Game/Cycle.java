package Game;

import java.util.ArrayList;

/**
 * Created by Benjamin Laprise on 2018-01-25.
 */
public class Cycle {
    private ArrayList<Message> In;
    private ArrayList<Message> Out;

    private Cycle instance = new Cycle();

    private Cycle() {}

    public static void gameStart() {

    }

    private String sendIn(){ return ""; }

    public void receiveIn(Message message){}

    private String sendOut(){ return ""; }

    public void receiveOut(Message message){}
}
