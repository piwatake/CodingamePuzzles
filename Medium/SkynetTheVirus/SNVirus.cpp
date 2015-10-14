#include <iostream>
#include <string>
#include <vector>
#include <algorithm>
#include <type_traits>
#include <deque>
#include <list>



using namespace std;

template<typename T, std::size_t N>
constexpr std::size_t size(T(&)[N]) { return N; }

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
        bool visited;
        int parent;
        vector<int> links;
        node(){
          visited = false;
          parent = -1;
        };
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


vector<node> bfs(vector<node> graph, int start, int tar ){
    cerr << "does this even work " << endl;
    vector<node> toret = graph;
    for(int i = 0;i<std::extent<decltype(graph)>::value;i++){
        toret[i].parent = -1;
    }
    
    //start position denoted by parent of itself. 
    toret[start].parent = start;
    //graph[start].distance = 0;
    cerr << toret[start].parent << endl;
    
    
    deque<int> Q;
    Q.push_front(start);
    //graph[start].visited = true;
    
    while(!Q.empty()){
        int t = Q.back();
        Q.pop_back();
            if(t== tar){
                return toret;
            }
            
        
        for(int j = 0; j<toret[t].links.size();j++){
            cerr << "something elsehappened" << endl;
            int u = toret[t].links.at(j);
            if(toret[u].parent == -1){
                cerr << u << "has parent" << t << endl;
                toret[u].parent = t;
                Q.push_front(u);
            }
        }
        
    }
    
    return toret;
}

 
int main()
{
    int N; // the total number of nodes in the level, including the gateways
    int L; // the number of links
    int E; // the number of exit gateways
    
    //vector<link> mylinks;
    vector<node> mynodes(N);
    
    
    cin >> N >> L >> E; cin.ignore();
    for (int i = 0; i < L; i++) {
        //vector<link>::iterator it;
        //it = mylinks.begin();
        int N1; // N1 and N2 defines a link between these nodes
        int N2;
        cin >> N1 >> N2; 
        //link temp = new link(N1, N2);
        //mylinks.push_back(&temp);
        
        
        //vector<int>::iterator link1it;
        //link1it = mynodes[N1].links.end();
        mynodes[N1].links.push_back(N2);
        
        //vector<int>::iterator link2it;
        //link1it = mynodes[N2].links.end();
        mynodes[N2].links.push_back(N1);
        
        cin.ignore();
    }
    
    //print data test. 
    //for_each(mylinks.begin(), mylinks.end(), linkprint);
    
    for(int j = 0; j< N;j++){
        cerr << "node " << j <<" parent " << mynodes[j].parent << " has links to... ";
        for(int k = 0; k< mynodes[j].links.size(); k ++){
            cerr << mynodes[j].links.at(k) << ",";
        }
        cerr << endl;
    }
    
    int EI;
    for (int i = 0; i < E; i++) {
         // the index of a gateway node
        cin >> EI; cin.ignore();
    }
    
    

    // game loop
    while (1) {
        int SI; // The index of the node on which the Skynet agent is positioned this turn
        cin >> SI; cin.ignore();
        
        vector<node> test = bfs(mynodes, SI, EI);
        
        
        
        for(int m = 0; m< N;m++){
            cerr << "node " << m <<" parent " << mynodes[m].parent <<  " has links to... ";
            for(int k = 0; k< mynodes[m].links.size(); k ++){
                cerr << mynodes[m].links.at(k) << ",";
            }
            cerr << endl;
        }
        
        
        int ind1 = 0;
        int ind2 = 0;
        if(mynodes[EI].links.size() > 0 ){
            ind1 = EI;
            ind2 = mynodes[EI].links.back();
            mynodes[EI].links.pop_back();
            
        }
        
        //cerr << dist << " and "  << endl;

        // Write an action using cout. DON'T FORGET THE "<< endl"
        // To debug: cerr << "Debug messages..." << endl;

        cout << ind1 << " " << ind2 << endl; // Example: 0 1 are the indices of the nodes you wish to sever the link between
    }
}