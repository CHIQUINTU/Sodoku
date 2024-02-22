import java.time.Year;

public class Sudoku {

    private int [][] felder;

    public Sudoku (){
        this.felder= new int [9][9];
        this.felder[0][0]=5;
        this.felder[1][0]=3;
        this.felder[2][0]=9;

        }
    
    public void printsudoku(){

    System.out.println("*---*---*---*");
    //System.out.print("|");
   
        //System.out.print("|");
        // System.out.print(""+felder[0][0]+felder[1][0]+felder[2][0]);//x Zeilen und y Spalten

        for (int y=0; y<felder.length;y++){
            System.out.print("|");// erst mal lauft die aussere schleife y 
            for (int x=0; x<felder.length;x++){// druck eine zeile
                if(felder[x][y]==0){
                    System.out.print(" ");
                }  else {
                    System.out.print(felder[x][y]);// Zahl
                }     
                if(x%3==2){
                    System.out.print("|");
                }  
            }        
            
            System.out.println("");
            if(y%3==2){
                System.out.println("*---*---*---*"); 
            
            }


        }        
    }

    public static void main(String[] args) {
        
        Sudoku x = new Sudoku();
        x.printsudoku();

    }

}