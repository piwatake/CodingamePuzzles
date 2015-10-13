#include <iostream>
#include <string>
#include <vector>
#include <algorithm>

using namespace std;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
 
 
class link{
    public:
        int node1;
        int node2;
        
        link(int n1, int n2){
            node1 = n1;
            node2 = n2;
        };
};

class node{
    public:
        int linksfromgate;
        vector<int> links;
};
        
void linkprint(link l){
    cerr << l.node1 << " " << l.node2 << endl;
}

void nodeprint(node n){
    cerr << "a node has links... ";
    for(int i =0 ; i<n.links.size() ; i++ ){
        cerr << n.links.at(i) << endl;
    }
}
 
int main()
{
    int N; // the total number of nodes in the level, including the gateways
    int L; // the number of links
    int E; // the number of exit gateways
    
    vector<link> mylinks;
    node mynodes [N];
    
    cin >> N >> L >> E; cin.ignore();
    for (int i = 0; i < L; i++) {
        vector<link>::iterator it;
        it = mylinks.begin();
        int N1; // N1 and N2 defines a link between these nodes
        int N2;
        cin >> N1 >> N2; 
        link* temp = new link(N1, N2);
        mylinks.push_back(*temp);
        
        
        vector<int>::iterator link1it;
        link1it = mynodes[N1].links.end();
        mynodes[N1].links.push_back(N2);
        
        vector<int>::iterator link2it;
        link1it = mynodes[N2].links.end();
        mynodes[N2].links.push_back(N1);
        
        cin.ignore();
    }
    
    //print data test. 
    for_each(mylinks.begin(), mylinks.end(), linkprint);
    
    //for_each(mynodes, mynodes+N, nodeprint);
    for(int j = 0; j< N;j++){
        cerr << "node " << j << " has links to... ";
        for(int k = 0; k< mynodes[j].links.size(); k ++){
            cerr << mynodes[j].links.at(k) << ",";
        }
        cerr << endl;
    }
    
    
    for (int i = 0; i < E; i++) {
        int EI; // the index of a gateway node
        cin >> EI; cin.ignore();
    }

    // game loop
    while (1) {
        int SI; // The index of the node on which the Skynet agent is positioned this turn
        cin >> SI; cin.ignore();

        // Write an action using cout. DON'T FORGET THE "<< endl"
        // To debug: cerr << "Debug messages..." << endl;

        cout << "0 1" << endl; // Example: 0 1 are the indices of the nodes you wish to sever the link between
    }
}