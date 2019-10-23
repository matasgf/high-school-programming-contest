#include <iostream>
#include <string>
 
using namespace std;
 
int main(int argc, char **argv)
{
    string noun, verb;

    while (cin >> noun >> verb) {
        cout << noun << " is " << verb << " today!" << endl;
    }
    return 0;
}

