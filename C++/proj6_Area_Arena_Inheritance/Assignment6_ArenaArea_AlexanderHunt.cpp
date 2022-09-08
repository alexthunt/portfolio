/*==========================================================

 Title:       Assignment 6 - Arena Area Inheritance
 Course:      CIS 2252
 Author:      <Alexander Hunt>
 Date:        <12/04/2021>
 Description: This programs accepts a number and then outputs the square of that number. Then it outputs the square of that number multiplied by pi.

 ==========================================================
*/

#include <iostream>

using namespace std;

//Create classes Arena and ArenaArea here

class Arena {
    public:
    int arena_Radius;
    
    int display() {
        int radiusSquared;
        radiusSquared = arena_Radius*arena_Radius;
        cout << radiusSquared;
        return radiusSquared;
    }
};

class ArenaArea: public Arena {
    public:
    void scan_input() {
        cin >> arena_Radius;
    }
    
    int display() {
        double areaOfArena;
        areaOfArena = arena_Radius*arena_Radius*3.14;
        cout << areaOfArena;
        return areaOfArena;
    }
};

int main()
{
    //DO NOT MODIFY ANYTHING IN THE main() !!!
    
    ArenaArea stadium; //Declaring ArenaArea object stadium
    
    stadium.scan_input(); //Read the radius input
    
    stadium.Arena::display(); //Print the radius squared
    
    cout << endl;
    
    stadium.display(); //Print the area of the Arena (stadium) object
    
    return 0;
}

