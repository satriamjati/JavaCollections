/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gamecollections;

import java.util.ArrayList;

/**
 *
 * @author GaLa
 */
public class GameCollections {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Game> gameList = new ArrayList<>();
        addGames(gameList);
        
        displayGames(gameList);
        
        System.out.println("Sorted by Selection Sort");
        selectionSort(gameList);
        displayGames(gameList);
        
        gameList.clear();
        addGames(gameList);
        
        System.out.println("Sorted by Optimized Bubble Sort");
        optimizedBubbleSort(gameList);
        displayGames(gameList);
        
        gameList.clear();
        addGames(gameList);
        
        System.out.println("Sorted by Bubble Sort");
        bubbleSort(gameList);
        displayGames(gameList);
        
        gameList.clear();
        addGames(gameList);
        
        System.out.println("Sorted by Binary Search Tree");
        binarySearchTree(gameList);
        
        System.out.println("Search from sorted data");
        sequentialSearch(gameList,89);
        sequentialSearch(gameList,94);
        sequentialSearch(gameList,50);
        binarySearch(gameList,89);
        binarySearch(gameList,94);
        binarySearch(gameList,50);
        
        gameList.clear();
        addGames(gameList);
        
        System.out.println("\nSearch from unsorted data");
        sequentialSearch(gameList,89);
        sequentialSearch(gameList,94);
        sequentialSearch(gameList,50);
        binarySearch(gameList,89);
        binarySearch(gameList,94);
        binarySearch(gameList,50);
    }
    
    //Searching Algorithm
    static public void binarySearch(ArrayList<Game> gameList, int value){
        int low = 0;
        int high = gameList.size() - 1;
        while(high >= low){
            int middle = (low + high)/2; // Middle index
            if(gameList.get(middle).getMetascore() == value){
                System.out.println("The number "+ value + " is at position "
                + middle + " in the list for " + gameList.get(middle).getName() + " (" + gameList.get(middle).getPlatform() + ") [Binary Search]");
                return; //Target value was found
            }//endif
            if(gameList.get(middle).getMetascore() < value){
                low = middle + 1;
            }//endif
            if(gameList.get(middle).getMetascore() > value){
                high = middle - 1;  
            }//endif
        }//endwhile //The value was not found
        System.out.println("The number "+ value + " is not in the list (Binary Search)");
    }//end method binarySearch

    
    static void sequentialSearch(ArrayList<Game> gameList, int value){
        for(int i = 0; i < gameList.size(); i++) {
            if(gameList.get(i).getMetascore() == value) {
                System.out.println("The Metascore "+ value + " is at position " + i + " in the list for " + gameList.get(i).getName() + " (" + gameList.get(i).getPlatform() + ") [Sequential Search]");
                return;
            }//endif
        }//endfor
        System.out.println("The number "+ value + " is not in the list [Sequential Search]");
    }
    //end of Searching Algorithm
    
    //Sorting Algorithm
    static void binarySearchTree(ArrayList<Game> gameList){
        BinarySearchTree binarySearchTree = new BinarySearchTree(gameList.get(0));
        for (Game game : gameList) {
            binarySearchTree.insert(binarySearchTree.node, game);
	}
        binarySearchTree.inOrder(binarySearchTree.node);
        System.out.println("\n");
    }
    
    static void bubbleSort(ArrayList<Game> gameList) {
        for (Game game : gameList) {
            for(int j = 0; j < gameList.size()-1; j ++){
                //if the numbers are not in order
                if(gameList.get(j).compareTo(gameList.get(j+1)) == 1){
                    //swap the numbers
                    Game temp = gameList.get(j); //use temp to store the value
                    gameList.set(j,gameList.get(j+1));
                    gameList.set(j+1,temp);
                }//endif
            }//endfor
        } //endfor
    }//end method bubbleSort
    
    static void optimizedBubbleSort(ArrayList<Game> gameList) {
        boolean flag = false; //Swapping flag for BubbleSort
        for (Game game : gameList) {
            for(int j = 0; j < gameList.size()-1; j ++){
                if(gameList.get(j).compareTo(gameList.get(j+1)) == 1){
                    flag = true; //Continue swapping
                    
                    Game temp = gameList.get(j); //use temp to store the value
                    gameList.set(j,gameList.get(j+1));
                    gameList.set(j+1,temp);
                }//endif
            }//endfor
            if(!flag){//No Swapping happened, array is sorted. Exit.
                return;
            }//endif
        } //endfor
    }//end method bubbleSort
    
    static void selectionSort(ArrayList<Game> gameList) {
        int indexMin; //the index of the smallest number
        for(int i = 0; i< gameList.size(); i++){
            indexMin = i;
            for(int j = i + 1; j < gameList.size(); j++){
                if(gameList.get(j).compareTo(gameList.get(indexMin)) == -1){//if we find a smaller int,
                indexMin = j; //set it as the min
                }//endif
            }//endfor
            //we have the index of the smallest int and can swap the values
            Game temp = gameList.get(i); //use temp to store the value
            gameList.set(i,gameList.get(indexMin));
            gameList.set(indexMin,temp);
        }//endfor
    }//end method selectionSort
    //end of Sorting Algorithm
    
    static void displayGames(ArrayList<Game> gameList){
        System.out.println("Game Details:");
        for(Game game: gameList){
            System.out.println(game.toString());
        }
        System.out.println("");
    }
    
    static void addGames(ArrayList<Game> gameList){
        addGamePC(gameList,"Disco Elysium: The Final Cut",97);
        addGamePC(gameList,"Half-Life",96);
        addGamePC(gameList,"Baldur's Gate 3",96);
        addGamePC(gameList,"Elden Ring",94);
        addGamePC(gameList,"Minecraft",93);
        addGamePC(gameList,"Grand Theft Auto V",96);

        addGameNintendoSwitch(gameList,"The Legend of Zelda: Breath of the Wild",97);
        addGameNintendoSwitch(gameList,"Super Mario Odyssey",97);
        addGameNintendoSwitch(gameList,"Xenoblade Chronicles 3",89);
        addGameNintendoSwitch(gameList,"Animal Crossing: New Horizons",90);
        addGameNintendoSwitch(gameList,"Super Mario Bros. Wonder",92);
        addGameNintendoSwitch(gameList,"Sonic Mania Plus",91);
    }
    static void addGamePC(ArrayList<Game> gameList, String name, int metascore){
        gameList.add(new Game(name,"PC",metascore));
    }
    static void addGameNintendoSwitch(ArrayList<Game> gameList, String name, int metascore){
        gameList.add(new Game(name,"Nintendo Switch",metascore));
    }
}
