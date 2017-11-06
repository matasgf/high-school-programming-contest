#include <iostream>
#include <string>
 
using namespace std;
 
int main(int argc, char **argv) {
    int numCases;
    string name, verb;
    cin >> numCases;
    while (numCases) {
        --numCases;
        cin >> name >> verb;
        cout << name << " is " << verb << " today!" << endl;
    }
    return 0;
}

