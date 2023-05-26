import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

class hitBoard
{
    private String[][] field = {
                             {"  "," 1 "," 2 "," 3 "," 4 "," 5 "," 6 "," 7 "," 8 "," 9 "," 10 "},
                             {"A "," ⬛ "," ⬛ "," ⬛ "," ⬛ "," ⬛ "," ⬛ "," ⬛ "," ⬛ "," ⬛ "," ⬛ "},
                             {"B "," ⬛ "," ⬛ "," ⬛ "," ⬛ "," ⬛ "," ⬛ "," ⬛ "," ⬛ "," ⬛ "," ⬛ "},
                             {"C "," ⬛ "," ⬛ "," ⬛ "," ⬛ "," ⬛ "," ⬛ "," ⬛ "," ⬛ "," ⬛ "," ⬛ "},
                             {"D "," ⬛ "," ⬛ "," ⬛ "," ⬛ "," ⬛ "," ⬛ "," ⬛ "," ⬛ "," ⬛ "," ⬛ "},
                             {"E "," ⬛ "," ⬛ "," ⬛ "," ⬛ "," ⬛ "," ⬛ "," ⬛ "," ⬛ "," ⬛ "," ⬛ "},
                             {"F "," ⬛ "," ⬛ "," ⬛ "," ⬛ "," ⬛ "," ⬛ "," ⬛ "," ⬛ "," ⬛ "," ⬛ "},
                             {"G "," ⬛ "," ⬛ "," ⬛ "," ⬛ "," ⬛ "," ⬛ "," ⬛ "," ⬛ "," ⬛ "," ⬛ "},
                             {"H "," ⬛ "," ⬛ "," ⬛ "," ⬛ "," ⬛ "," ⬛ "," ⬛ "," ⬛ "," ⬛ "," ⬛ "},
                             {"I "," ⬛ "," ⬛ "," ⬛ "," ⬛ "," ⬛ "," ⬛ "," ⬛ "," ⬛ "," ⬛ "," ⬛ "},
                             {"J "," ⬛ "," ⬛ "," ⬛ "," ⬛ "," ⬛ "," ⬛ "," ⬛ "," ⬛ "," ⬛ "," ⬛ "},
     };

    public hitBoard(){}
    
    public String[][] getField() //Gets the field
    {
        return field;
    }
    public void showField(){ //Displays the field
        for(String[] row : field){
            for(String col : row){
                System.out.print(col);
            }
            System.out.println();
        }
    }
}
class board
{
    private String[][] field = {                    
                             {"  ","| 1 ","| 2 ","| 3 ","| 4 ","| 5 ","| 6 ","| 7 ","| 8 ","| 9 ","| 10 |"}, {},
                             {"A_","|_🌊 ","|_🌊 ","|_🌊 ","|_🌊 ","|_🌊 ","|_🌊 ","|_🌊 ","|_🌊 ","|_🌊 ","|_🌊  |"},{},
                             {"B_","|_🌊 ","|_🌊 ","|_🌊 ","|_🌊 ","|_🌊 ","|_🌊 ","|_🌊 ","|_🌊 ","|_🌊 ","|_🌊  |"},{},
                             {"C_","|_🌊 ","|_🌊 ","|_🌊 ","|_🌊 ","|_🌊 ","|_🌊 ","|_🌊 ","|_🌊 ","|_🌊 ","|_🌊  |"},{},
                             {"D_","|_🌊 ","|_🌊 ","|_🌊 ","|_🌊 ","|_🌊 ","|_🌊 ","|_🌊 ","|_🌊 ","|_🌊 ","|_🌊  |"},{},
                             {"E_","|_🌊 ","|_🌊 ","|_🌊 ","|_🌊 ","|_🌊 ","|_🌊 ","|_🌊 ","|_🌊 ","|_🌊 ","|_🌊  |"},{},
                             {"F_","|_🌊 ","|_🌊 ","|_🌊 ","|_🌊 ","|_🌊 ","|_🌊 ","|_🌊 ","|_🌊 ","|_🌊 ","|_🌊  |"},{},
                             {"G_","|_🌊 ","|_🌊 ","|_🌊 ","|_🌊 ","|_🌊 ","|_🌊 ","|_🌊 ","|_🌊 ","|_🌊 ","|_🌊  |"},{},
                             {"H_","|_🌊 ","|_🌊 ","|_🌊 ","|_🌊 ","|_🌊 ","|_🌊 ","|_🌊 ","|_🌊 ","|_🌊 ","|_🌊  |"},{},
                             {"I_","|_🌊 ","|_🌊 ","|_🌊 ","|_🌊 ","|_🌊 ","|_🌊 ","|_🌊 ","|_🌊 ","|_🌊 ","|_🌊  |"},{},
                             {"J_","|_🌊 ","|_🌊 ","|_🌊 ","|_🌊 ","|_🌊 ","|_🌊 ","|_🌊 ","|_🌊 ","|_🌊 ","|_🌊  |"}
                                };
     Scanner in = new Scanner (System.in);
     /*private String[][] field  THAT IS SINGLE SPACED, UPPER USED ONE IS DOUBLE SPACED Y AXIS, BUT STILL SINGLE SPACE X-AXIS = {
     };*/
    
    public board(){}
    
    public String[][] getField() //Gets the field
    {
        return field;
    }
    
    public void showField()
    { //Displays the field
        for(String[] row : field){
            for(String col : row){
                System.out.print(col);
            }
            System.out.println();
        }
    }
}