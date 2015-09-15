import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int L = in.nextInt();
        in.nextLine();
        int H = in.nextInt();
        in.nextLine();
        String T = in.nextLine();
        
        int offset = 0;
        
        String output[] = new String[H];
        
        for(int i = 0; i<H;i++){
            output[i] = "";
        }
        
        int tsize = 0;
        
        for(char c : T.toCharArray()){
            if(Character.isDefined(c)){
                tsize++;
                System.err.println("Debug messages..."+tsize);
            }
        }
        
        
        
        for (int i = 0; i < H; i++) {
            String ROW = in.nextLine();
            
            System.err.println("Debug messages..."+(offset*L)+" ,"+((offset*L)+L+1));
            
            for(int j =0; j< tsize;j++){
                
                String findoffsetfor = T.substring(j,j+1);
                
                offset = findOffset(findoffsetfor);
                System.err.println("Debug messages..."+(offset*L)+" ,"+((offset*L)+L+1));
                String result = new StringBuilder(T.length()*L).append(output[i]).append(ROW.substring((offset*L), ((offset*L)+L))).toString();
                output[i] = result;
                
                
            }
            
            

        }

        // Write an action using System.out.println()
        // To debug: System.err.println("Debug messages...");


        for(String s : output){
            System.out.println(s);
        }

    }
    
    
    
    public static int findOffset(String find){
        if(find.equals("A")||find.equals("a")){
            return 0;
        }else if(find.equals("B")||find.equals("b")){
            return 1;
        }else if(find.equals("C")||find.equals("c")){
            return 2;
        }else if(find.equals("D")||find.equals("d")){
            return 3;
        }else if(find.equals("E")||find.equals("e")){
            return 4;
        }else if(find.equals("F")||find.equals("f")){
            return 5;
        }else if(find.equals("G")||find.equals("g")){
            return 6;
        }else if(find.equals("H")||find.equals("h")){
            return 7;
        }else if(find.equals("I")||find.equals("i")){
            return 8;
        }else if(find.equals("J")||find.equals("j")){
            return 9;
        }else if(find.equals("K")||find.equals("k")){
            return 10;
        }else if(find.equals("L")||find.equals("l")){
            return 11;
        }else if(find.equals("M")||find.equals("m")){
            return 12;
        }else if(find.equals("N")||find.equals("n")){
            return 13;
        }else if(find.equals("O")||find.equals("o")){
            return 14;
        }else if(find.equals("P")||find.equals("p")){
            return 15;
        }else if(find.equals("Q")||find.equals("q")){
            return 16;
        }else if(find.equals("R")||find.equals("r")){
            return 17;
        }else if(find.equals("S")||find.equals("s")){
            return 18;
        }else if(find.equals("T")||find.equals("t")){
            return 19;
        }else if(find.equals("U")||find.equals("u")){
            return 20;
        }else if(find.equals("V")||find.equals("v")){
            return 21;
        }else if(find.equals("W")||find.equals("w")){
            return 22;
        }else if(find.equals("X")||find.equals("x")){
            return 23;
        }else if(find.equals("Y")||find.equals("y")){
            return 24;
        }else if(find.equals("Z")||find.equals("z")){
            return 25;
        }else{
            return 26;
        }
    }
}