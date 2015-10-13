#include <iostream>
#include <string>
#include <vector>
#include <algorithm>
#include <set>
#include <list>

using namespace std;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
int main()
{
    
    std::set<std::string> mySet;
    int N;
    int elementsStored = 0;
    cin >> N; cin.ignore();
    for (int i = 0; i < N; i++) {
        string telephone;
        cin >> telephone;
        mySet.insert(telephone);
        cin.ignore();
    }
    
    std::set<string> substrings;
    
    set<std::string>::iterator it;
      for (it = mySet.begin(); it != mySet.end(); ++it) {
          string temp = *it;
          //cerr << temp << endl;
          int len = temp.size();
          
          
          
          for (int j = 1; j <= len; j++){
              string srchItem = temp.substr(0,j);
              //cerr << srchItem << " is ";
              if(substrings.find(srchItem) != substrings.end()){
                  //cerr << "found." << endl;
                  continue;
              } else {
                  elementsStored++;
                  //cerr << "not found." << endl;
                  substrings.insert(srchItem);
              }
          }
          
          //cout << endl;
      }

    // Write an action using cout. DON'T FORGET THE "<< endl"
    // To debug: cerr << "Debug messages..." << endl;

    cout << elementsStored << endl; // The number of elements (referencing a number) stored in the structure.
}