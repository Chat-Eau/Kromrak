package Game;

import java.util.ArrayList;

/**
 * Created by Benjamin Laprise on 2018-01-25.
 */
public class Cycle {
    private ArrayList<Message> In;
    private ArrayList<Message> Out;

    private static Cycle instance = new Cycle();

    private Cycle() {}

    public static void gameStart() {

    }

    public static Cycle getInstance() {
        return instance;
    }

    private String sendIn(){ return ""; }

    public void receiveIn(Message message){}

    private String sendOut(){ return ""; }

    public void receiveOut(Message message){}
}
