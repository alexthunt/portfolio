/*==========================================================

 Title:       Assignment 5 - Wizard Identification using Classes
 Course:      CIS 2252
 Author:      <First & Last Name>
 Date:        < / / >
 Description: This program ....

 ==========================================================
*/

#include <iostream>

using namespace std;

//Create your class Wizard here.
class Wizard {
    public:
    int c_wizardAge;
    int c_wizard_ID;
    string c_wizardFirstName;
    string c_wizardLastName;
    
    void set_wizardAge(int age) {
        c_wizardAge=age;
    }
    void set_wizard_ID(int id) {
        c_wizard_ID=id;
    }
    void set_wizardFirstName(string f) {
        c_wizardFirstName=f;
    }
    void set_wizardLastName(string l) {
        c_wizardLastName=l;
    }
    
    int get_wizardAge() {
        return c_wizardAge;
    }
    int get_wizard_ID() {
        return c_wizard_ID;
    }
    string get_wizardLastName() {
        return c_wizardLastName;
    }
    string get_wizardFirstName() {
        return c_wizardFirstName;
    }
};

int main() {
//DO NOT MODIFY THE MAIN()!!!!
    int wizardAge, wizard_ID;
    string wizardFirstName, wizardLastName;
    
    cin >> wizardAge >> wizardFirstName >> wizardLastName >> wizard_ID;
    
    Wizard wiz;
    wiz.set_wizardAge(wizardAge);
    wiz.set_wizard_ID(wizard_ID);
    wiz.set_wizardFirstName(wizardFirstName);
    wiz.set_wizardLastName(wizardLastName);
    
    cout << wiz.get_wizardAge() << "\n";
    cout << wiz.get_wizardLastName() << ", " << wiz.get_wizardFirstName() << "\n";
    cout << wiz.get_wizard_ID();
    
    return 0;
}

