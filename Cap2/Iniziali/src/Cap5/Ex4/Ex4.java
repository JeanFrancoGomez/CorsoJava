package Cap5.Ex4;

import textio.TextIO;

public class Ex4 {

    public static void main(String[] args){
        Deck deck = new Deck(false);
        BlackjackHand hand = new BlackjackHand();

        int casual=(int)(Math.random()*5)+2;
        
        boolean cont=true;

        while(cont){

            deck.shuffle();

            for(int i=0;i<casual;i++){
                hand.addCard(deck.dealCard());
            }

            TextIO.putln();
            TextIO.putln("La tua mano è:");
            for(int i=0;i<hand.getCardCount();i++){
                TextIO.putln(hand.getCard(i).toString());
            }
            TextIO.putln("Il jackblack della mano è "+hand.getBlackjackValue());

            if(hand.getBlackjackValue()==21){
                TextIO.putln("Hai vinto!!!");
            }
            else{
                TextIO.putln("Hai perso :(");
            }

            while(cont){
                TextIO.putln("Vuoi continuare? [Y|N]:   ");
                char aux = TextIO.getChar();
                aux = Character.toUpperCase(aux);
                if(aux=='Y'){
                    cont=true;
                    hand.clear();
                    break;
                }
                else if(aux=='N'){
                    cont=false;
                }
                else{
                    TextIO.putln("Scelta errata, prova di nuovo");
                    cont=true;
                }
            }

        }
    }
    
}
