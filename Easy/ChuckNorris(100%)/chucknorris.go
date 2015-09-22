package main

import "fmt"
import "os"
import "bufio"
//import "unicode/utf8"
//import "strings"
import "strconv"

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/

type chardata struct {
    atype string
    reps string
}


func main() {
    scanner := bufio.NewScanner(os.Stdin)

    scanner.Scan()
    MESSAGE := scanner.Text()
    
    length := len(MESSAGE)
    
    
    //var charscode [int(length)]chardata
    
    
    //fmt.Fprintln(os.Stderr, int(length), charscode )
    
    //stemp := []string{"", ""}
    
    sreadfrom := ""
    sans := ""
    
   // var slice = make([]string,length) 
    
    //for key, value := range slice {
    //slice[key] = MESSAGE[key]
    //}
    
    
    for l := 0 ; l < length ; l++ {
        temp1 := int64(MESSAGE[l])
        asbin := strconv.FormatInt(temp1, 2)
        lookat := string(asbin)
        
        if len(lookat) == 6 {
         temp := "0"
         temp += lookat
         sreadfrom += temp
        } else {
            sreadfrom += lookat
        }
        
        
    }
    
        fmt.Fprintln(os.Stderr, sreadfrom)
    
        //0,1, or 2.
        
        state := 0
        // 1 == true, 0 == false
        //prev := false
        count := 0
        
        for j := 0 ; j < len(sreadfrom) ; j++ {
            //fmt.Println(rune(lookat[j]))
            
            s, _ := strconv.Unquote(strconv.QuoteRuneToASCII(rune(sreadfrom[j])))
            
            
            //initial encounter 1
            if s == "1" && state == 0 {
                
                state = 1
                
            }
            
            //initial encounter 0
            if s == "0" && state == 0 {
                
                state = 2
                
            }
            
            //swapped from 0 to 1
            if s == "0" && state == 1 {
             //print
             
             sans += "0 "
             
             for k := 0 ; k < count ; k++ {
                 sans += "0"
             }
             
             count = 0
             state = 2
             sans += " "
            }
            
            //swapped from 1 to 0
            if s == "1" && state == 2 {
             //print
             
             sans += "00 "
             
             for k := 0 ; k < count ; k++ {
                 sans += "0"
             }
             
             count = 0
             state = 1
             sans += " "
            }
            
            
            count++
            
            //if reached the end
            if j == len(sreadfrom) -1 {
                if state == 1 {
                    sans += "0 "
             
                    for k := 0 ; k < count ; k++ {
                      sans += "0"
                    }   
                    
                }
                if state == 2 {
                    sans += "00 "
             
                    for k := 0 ; k < count ; k++ {
                      sans += "0"
                    }   
                    
                }
                
                //sans += " "
            }
            

	  
            
        }
        
        count = 0
        state = 0
        
        //sans += " "
        


        
    //}
    

    
    fmt.Println(sans)// Write answer to stdout
}