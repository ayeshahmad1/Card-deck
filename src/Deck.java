public class Deck {
    Cards cards[]= new Cards[52];

    String suit[]={"Clubs", "Hearts", "Spades", "Diamonds"};

    String rank[]={"Ace","1","2","3","4","5","6","7","8","9","Jack","Queen","King"};

    Deck(){
        int counter=0;
        for(int j=0; j<4; j++)
            for(int i=0; i<13; i++)
                cards[counter++]=new Cards(suit[j],rank[i]);
    }

    public String toString(){
        StringBuilder str= new StringBuilder();
        for(int i=0; i<52; i++)
            str.append(cards[i]+"\n");
        return str.toString();
    }

}
