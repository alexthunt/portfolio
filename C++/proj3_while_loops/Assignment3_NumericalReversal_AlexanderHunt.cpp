/******************************************************************************

                              Online C++ Compiler.
               Code, Compile, Run and Debug C++ program online.
Write your code in this editor and press "Run" button to compile and execute it.

*******************************************************************************/

#include <iostream>
#include <array>

using namespace std;


int main() {
    int sizeOfArray;
    cin >> sizeOfArray;
    sizeOfArray--;
    int firstArray[sizeOfArray];
    
    //while loop variables
    int entryNumber = 0;
    while (entryNumber <= sizeOfArray) {
        cin >> firstArray[entryNumber];
        
        entryNumber++;
    }
    
    //while loop variables
    int outputNumber = 0;
    int arrayNumberToOutput = sizeOfArray;
    while (outputNumber <= sizeOfArray) {
        cout << firstArray[arrayNumberToOutput];
        cout << " ";
        
        arrayNumberToOutput--;
        outputNumber++;
    }
    
 return 0;
}