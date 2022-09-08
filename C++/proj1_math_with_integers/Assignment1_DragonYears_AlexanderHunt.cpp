/*==========================================================

 Title:       Assignment 1 - Dragon Years
 Course:      CIS 2252
 Author:      <Alexander Hunt>
 Date:        <09/26/21>
 Description: Calculates the wizard age of a dragon over 2 years old.

 ==========================================================
*/

#include <iostream>
#include <string>

using namespace std;

int
main ()
{

  string dragonName;
  cin >> dragonName;

  double dragonAge;
  cin >> dragonAge;

  double twoYearOldDragonInWizardYears = 21;
  double yearsToAddPerYearToConvertToWizardYears = 4;
  double wizardAgeOfDragon =
    (dragonAge - 2) * (yearsToAddPerYearToConvertToWizardYears) +
    twoYearOldDragonInWizardYears;

  cout << "The dragon named " + dragonName;
  cout << " is ";
  cout << wizardAgeOfDragon;
  cout << " years old in wizard years.";



  return 0;
}
