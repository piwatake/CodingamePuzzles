import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Player {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int road = in.nextInt(); // the length of the road before the gap.
        int gap = in.nextInt(); // the length of the gap.
        int platform = in.nextInt(); // the length of the landing platform.
        boolean jumped = false;

        // game loop
        while (true) {
            int speed = in.nextInt(); // the motorbike's speed.
            int coordX = in.nextInt(); // the position on the road of the motorbike.
            
            System.err.println("Gap length is "+gap+"with "+platform+" space left.");
            
            if(coordX > road && coordX < road + gap){
                break;
            }else if(speed > gap+1){
                System.out.println("SLOW");
                speed -= 1;
            }else if(jumped && speed != 0){
                System.out.println("SLOW");
                speed -= 1;
            }
            else if(speed == gap+1 && coordX == road-1){ 
                jumped = true;
                System.out.println("JUMP");
                
            } else if(speed != gap+1){
                speed += 1;
                System.out.println("SPEED");
            }else if (speed == gap+1){
                System.out.println("WAIT");
            }

            // Write an action using System.out.println()
            // To debug: System.err.println("Debug messages...");

            //System.out.println("SPEED"); // A single line containing one of 4 keywords: SPEED, SLOW, JUMP, WAIT.
            coordX += speed;
        }
    }
}