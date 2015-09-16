using System;
using System.Linq;
using System.IO;
using System.Text;
using System.Collections;
using System.Collections.Generic;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution
{
    static void Main(string[] args)
    {
        int n = int.Parse(Console.ReadLine()); // the number of temperatures to analyse
        string temps = Console.ReadLine(); // the n temperatures expressed as integers ranging from -273 to 5526

        // Write an action using Console.WriteLine()
        // To debug: Console.Error.WriteLine("Debug messages...");
        
        //string  = new String(temps.ToCharArray().Where(c => Char.IsDigit(c)).ToArray());
        
        
        
        int closest = 7000;
        
        if(n == 0){
            closest = 0;
        } else {
            
            int[] intsarr = temps.Split(null).Select(int.Parse).ToArray();
            Console.Error.WriteLine(intsarr.Length);
            
            foreach (int t in intsarr){
            
            
            Console.Error.WriteLine(t);
            int totest = Math.Abs(t);
            if(totest==Math.Abs(closest)){
                if(t>0&&closest<0){
                    closest = t;
                }
            }
            else if(totest<Math.Abs(closest)){
                closest = t;
            }
            
        }
            
        }
        
        
        

            Console.WriteLine(closest);
        
        
    }
}