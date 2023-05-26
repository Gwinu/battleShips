import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

class battleShip //Basicially declares all the simple things needed
{                    
    private String name = " "; 
    private String type;
    private int xPos = 0;
    private int yPos = 0;
    private boolean isVertical = false;
    private int length = 0;
    private int hp = 3;
    public battleShip(int x, int y, boolean vertical){
        xPos = x;
        yPos = y;
        isVertical = vertical;
    }
    public battleShip(int x, int y, boolean vertical, int length, String type){
        xPos = x;
        yPos = y;
        isVertical = vertical;
        this.length = length;
        this.hp = length;
        this.type = type;
    }
    public String toString()
    {
        return "[" +getXPos()+ ", " +getYPos()+ ", " +getVertical();
    }
    public int getXPos(){ //gets X cord
        return xPos;}
    public int getYPos(){ //gets Y cord
        return yPos;}
    public boolean getVertical(){ //True or false to see if its vertical
        return isVertical;}
    public int getLength(){ // returns the length
        return length;}
    public String getName(){ //returns the name
        return name;}
    public String getType(){
        return type;}
    public int getHP(){
        return hp;}
        
    public void setHP(int x){
        hp = x;
    }
}
class frigate extends battleShip
{
    public frigate(int x, int y, boolean vertical) {
        super(x,y,vertical,1,"fr");
    }
}

class destroyer extends battleShip
{
    public destroyer(int x, int y, boolean vertical) {
        super(x,y,vertical,3,"dr");
    }
}

class cruiser extends battleShip
{
    public cruiser(int x, int y, boolean vertical) {
        super(x,y,vertical,5,"cr");
    }
}

class airCarrier extends battleShip
{
    private int width = 2;
    public airCarrier(int x, int y, boolean vertical) {
        super(x,y,vertical,5,"ar");
    }
    
}