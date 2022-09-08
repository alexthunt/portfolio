import random

hourlyWage = float(input("How much gold do you earn for every hour of adventuring in dungeons?"))
hoursWorked = float(input("How long did you spend adventuring?"))
goldEarned = hourlyWage*hoursWorked
print("You made " + str(goldEarned) + " gold")
print("The lord of this realm demands his due in taxes for his lavish lifestyle. "
      "His tax collectors come calling and they take 10% of your gold earned during your adventure.")
goldTakenByTaxCollector = goldEarned*0.1
goldEarnedAfterTaxes = goldEarned*0.9
print("You owe " + str(goldTakenByTaxCollector) + " gold to the tax collector " + "You only have " +
      str(goldEarnedAfterTaxes) + " now.")
oneTwoOrThree = random.randint(1, 3)
if oneTwoOrThree == 1:
    print("The lord buys a new golden goblet.")
if oneTwoOrThree == 2:
    print("The lord buys a dragonskin rug.")
if oneTwoOrThree == 3:
    print("The lord remodels the forbidden wing of his castle.")
