import math
import random


def affirmation_generator():
    random_number = random.randint(1, 5)
    if random_number == 1:
        return "You can do it!"
    if random_number == 2:
        return "Today is going to be a good day!"
    if random_number == 3:
        return "You are worthy of what your desire!"
    if random_number == 4:
        return "Overcome your fears and follow your dreams!"
    if random_number == 5:
        return "You are in charge of your life!"


def quadratic_equation_intercept_finder(a, b, c):
    if b ^ 2 - 4 * a * c < 0:
        print("There are no intercepts")

    else:
        intercept1 = (-1 * b + math.sqrt(b ^ 2 - 4 * a * c)) / (2 * a)
        intercept2 = (-1 * b - math.sqrt(b ^ 2 - 4 * a * c)) / (2 * a)
        print("first intercept is ", intercept1, ", second intercept is ", intercept2)


user_says_1_or_2 = int(input("1 for affirmation and 2 for quadratic equation solver"))
if user_says_1_or_2 == 1:
    print(affirmation_generator())
if user_says_1_or_2 == 2:
    a = int(input("enter a"))
    b = int(input("enter b"))
    c = int(input("enter c"))
    quadratic_equation_intercept_finder(a, b, c)
