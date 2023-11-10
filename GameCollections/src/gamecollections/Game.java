package gamecollections;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author GaLa
 */
public class Game {

    public String getName() {
        return name;
    }

    public String getPlatform() {
        return platform;
    }

    public int getMetascore() {
        return metascore;
    }
    private final String name;
    private final String platform;
    private final int metascore;
    
    public Game(String name, String platform, int metascore){
        this.name = name;
        this.platform = platform;
        this.metascore = metascore;
    }
    
    public int compareTo(Game anotherGame) {
        if((Integer.valueOf(getMetascore()).compareTo(anotherGame.getMetascore())< 0 ))
            return -1;
        if((Integer.valueOf(getMetascore()).compareTo(anotherGame.getMetascore())== 0 ))
            return 0;
        return 1;
    }//end method compareTo
    
    @Override
    public String toString(){
        return getName() + " (" + getPlatform() + "): " + getMetascore();
    }
}

//"Disco Elysium: The Final Cut",97
//"Half-Life",96
//"Baldur's Gate 3",96
//"Elden Ring",94
//"Minecraft",93
//"Grand Theft Auto V",96
//"Persona 5 Royal",95
//
//"The Legend of Zelda: Breath of the Wild",97
//"Super Mario Odyssey",97
//"Persona 5 Royal",94
//"Xenoblade Chronicles 3",89
//"Animal Crossing: New Horizons",90
//"Super Mario Bros. Wonder",92
//"Sonic Mania Plus",91

