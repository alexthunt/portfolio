/******************************************************************************

                              Online C++ Compiler.
               Code, Compile, Run and Debug C++ program online.
Write your code in this editor and press "Run" button to compile and execute it.

*******************************************************************************/

#include <iostream>

using namespace std;

int
main ()
{
  int firstNumber;
  cin >> firstNumber;
  int secondNumber;
  cin >> secondNumber;

  for (firstNumber = firstNumber; firstNumber <= secondNumber; firstNumber++){
    if (firstNumber == 0){
	    cout << "zero";
	  }
	if (firstNumber == 1){
	    cout << "one";
	  }
    if (firstNumber == 2){
	    cout << "two";
	  }
	if (firstNumber == 3){
	    cout << "three";
	  }
	if (firstNumber == 4){
	    cout << "four";
	  }
	if (firstNumber == 5){
	    cout << "five";
	  }
	if (firstNumber == 6){
	    cout << "six";
	  }
	if (firstNumber == 7){
	    cout << "seven";
	  }
	if (firstNumber == 8){
	    cout << "eight";
	  }
	if (firstNumber == 9){
	    cout << "nine";
	  }
	if (firstNumber > 9){
	    if (firstNumber % 2 == 0){
	        cout << "even";
	    }
	    else {
	        cout << "odd";
	    }
	  }
	  	cout << "\n";
    }

      return 0;
    }

