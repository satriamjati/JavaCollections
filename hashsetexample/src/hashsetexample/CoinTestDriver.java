package hashsetexample;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

import java.util.HashSet;


/**
 *
 * @author GaLa
 */
public class CoinTestDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        HashSet<Coin> bagOfCoins = new HashSet<Coin>();
        
        Coin coin1 = new Coin(1);
        Coin coin2 = new Coin(2);
        Coin coin5 = new Coin(5);
        Coin coin10 = new Coin(10);
        Coin coin20 = new Coin(20);
        Coin coin50 = new Coin(50);
        Coin coin100 = new Coin(100);
        
        bagOfCoins.add(coin1);
        bagOfCoins.add(coin2);
        bagOfCoins.add(coin5);
        bagOfCoins.add(coin10);
        bagOfCoins.add(coin20);
        bagOfCoins.add(coin50);
        bagOfCoins.add(coin10);
        
        findCoin(bagOfCoins, coin10);
        findCoin(bagOfCoins, coin100);
        displayBagContents(bagOfCoins);
        displayBagDetails(bagOfCoins);
        
        bagOfCoins.clear();
        displayBagDetails(bagOfCoins);
    }
    
    static void findCoin(HashSet<Coin> bagOfCoins, Coin coin){
        if(bagOfCoins.contains(coin))
            System.out.println("There is one coin " + coin.getDenomination() + " in te bag");
        else
            System.out.println("There is no coin " + coin.getDenomination() + " in te bag");
    }
    
    static void displayBagContents(HashSet<Coin> bagOfCoins){
        for(Coin coin: bagOfCoins)
            System.out.println(coin.getDenomination());
    }
    
    static void displayBagDetails(HashSet<Coin> bagOfCoins){
        if(bagOfCoins.isEmpty())
            System.out.println("There is no coin in the bag");
        else if(bagOfCoins.size()==1)
            System.out.println("There is a coin in the bag");
        else
            System.out.println("There are " + bagOfCoins.size() + " coins in the bag");
    }
}
