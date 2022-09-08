try:
    length = float(input("What is the length of your fenced area(in meters)?"))
except:
    print("incompatible input, please run again.")
try:
    width = float(input("What is the width of your fenced area(in meters)?"))
except:
    print("incompatible input, please run again.")
try:
    postDistance = float(input("How far apart do you want your posts to be(in meters)?"))
except:
    print("incompatible input, please run again.")

lengthOfFence = length*2 + width*2
print("length of fence is ", lengthOfFence)
remainderOfModulusOperation = (lengthOfFence % postDistance)
print ("remainder is ", remainderOfModulusOperation)
if (lengthOfFence % postDistance) != 0:
    print("posts will be uneven, please run again.")
else:
    numberOfPostsToBuy = lengthOfFence/postDistance
    try:
        lengthOfBoard = float(input("What length of board will you be purchasing?"))
    except:
        print("incompatible input, please run again.")
    if lengthOfBoard<postDistance:
        print("Length of the board cannot be less than the post distance, please run again.")
    else:
        numberOfBoardsNeeded = lengthOfFence/lengthOfBoard
        try:
            boardsPerPost = float(input("How many boards do you want to run across each post?"))
        except:
            print("incompatible input, please run again.")
        numberOfBoardsNeeded = numberOfBoardsNeeded*boardsPerPost
        try:
            costOfAPost = float(input("How much does each post cost?"))
        except:
            print("incompatible input, please run again.")
        try:
            costOfABoard = float(input("How much does each board cost?"))
        except:
            print("incompatible input, please run again.")
        costOfAllBoards = costOfABoard*numberOfBoardsNeeded
        costOfAllPosts = costOfAPost*numberOfPostsToBuy
        totalCost = costOfAllPosts+costOfAllBoards
        print("You need ", numberOfPostsToBuy, " posts, ", numberOfBoardsNeeded, " boards, and it will cost ",
              costOfAllBoards, " dollars for the boards, and  ", costOfAllPosts, " dollars for the posts."
              " The grand total is, ", totalCost, " dollars.")
