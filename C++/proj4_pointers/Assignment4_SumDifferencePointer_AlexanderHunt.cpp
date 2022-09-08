/******************************************************************************

                              Online C++ Compiler.
               Code, Compile, Run and Debug C++ program online.
Write your code in this editor and press "Run" button to compile and execute it.

*******************************************************************************/

#include <iostream>
using namespace std;

void Modify(int *x, int *y) {
    
    int originalx = *x;
    int originaly = *y;
    int yNonAbsVal;
    int yAbsVal;
    
    *x= originalx + originaly;
    
    yNonAbsVal= originalx - originaly;
    if (yNonAbsVal < 0) {
        yAbsVal=yNonAbsVal*-1;
        *y=yAbsVal;
    }
    else {
        *y=yNonAbsVal;
    }
}

int main() {
    //DO NOT MODIFY ANYTHING IN THE main() !!!
    
    int x, y;
    
    int *ptr_x = &x;
    int *ptr_y = &y;
    
    cin >> x;
    cin >> y;
    
    Modify(ptr_x, ptr_y);
    
    cout << x << endl;
    cout << y;
                 
    return 0;
}
