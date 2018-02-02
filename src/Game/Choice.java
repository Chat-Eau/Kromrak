package Game;

import java.util.List;

public class Choice {
    List<String> options;
    Message message;
    public Choice(List<String> options){
        this.options = options;
        String messageString = "";
        for (String option:options) {
            messageString += option + "-/-";
        }
        messageString = messageString.substring(0,messageString.lastIndexOf("-/-"));

        message = new Message("ChoiceRequest", messageString);
    }

    public Message getMessage(){
        return message;
    }

    public void sendRequest(){
        //TODO:Envoyer un message à la pile Out
        Cycle.getInstance().receiveOut(message);
    }

    public boolean confirmChoice(String input){
        //TODO:Gérer un message de séléction du joueur reçu de la pile In.
        if (options.contains(input)){
            Cycle.getInstance().receiveOut(new Message("ChoiceAnswer", input));
            return true;
        } else {
            sendRequest();
            return false;
        }
    }
}
