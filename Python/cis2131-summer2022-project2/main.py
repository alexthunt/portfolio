import math
import random


def get_name():
    return input("What is your name?")


def sum_of_four_six_sided_dice_with_lowest_dropped():
    list_of_numbers = [random.randint(1, 6), random.randint(1, 6), random.randint(1, 6), random.randint(1, 6)]
    highest_number = max(list_of_numbers)
    list_of_numbers.remove(max(list_of_numbers))
    second_highest_number = max(list_of_numbers)
    list_of_numbers.remove(max(list_of_numbers))
    third_highest_number = max(list_of_numbers)
    highest_three_numbers = [highest_number, second_highest_number, third_highest_number]
    sum_of_numbers = highest_three_numbers[0] + highest_three_numbers[1] + highest_three_numbers[2]
    return sum_of_numbers


def get_ability_modifier(stat):
    return (stat - 10) / 2


def menu():
    return int(input("What do you want to do? 1-Attack, 2-Negotiate, 3-Search, 4-Eat, or 5-End Game?"))


def attack(attack_stat):
    if (random.randint(1, 20) + get_ability_modifier(attack_stat)) >= 12:
        damage_done = (random.randint(1, 6) + get_ability_modifier(attack_stat))
        if damage_done < 0:
            damage_done = 0
        print("You hit the target for", damage_done)
    else:
        print("You miss.")


def negotiate(negotiate_stat):
    if (random.randint(1, 20) + get_ability_modifier(negotiate_stat)) >= 15:
        print("You successfully negotiated a truce.")
    else:
        print("You fumble on your words.")


def search(search_stat):
    if (random.randint(1, 20) + get_ability_modifier(search_stat)) >= 12:
        print("You found", random_treasure_generator())
    else:
        print("You didn't find anything.")


def random_treasure_generator():
    random_number = random.randint(1, 4)
    if random_number == 1:
        return "gems."
    if random_number == 2:
        return "gold."
    if random_number == 3:
        return "a jade figurine."
    if random_number == 4:
        return "a rare trinket."


def eat(eat_stat):
    print("your food is rancid.")
    if (random.randint(1, 20) + get_ability_modifier(eat_stat)) >= 10:
        print("Luckily, you are able to handle the rancid food without getting sick.")
    else:
        print("You got sick and need to stay in bed.")


strength = sum_of_four_six_sided_dice_with_lowest_dropped()
dexterity = sum_of_four_six_sided_dice_with_lowest_dropped()
constitution = sum_of_four_six_sided_dice_with_lowest_dropped()
intelligence = sum_of_four_six_sided_dice_with_lowest_dropped()
wisdom = sum_of_four_six_sided_dice_with_lowest_dropped()
charisma = sum_of_four_six_sided_dice_with_lowest_dropped()

name = get_name()
game_on = 1
while game_on == 1:
    what_to_do = menu()
    if what_to_do == 1:
        print(name, ", you decide to attack.")
        if strength > dexterity:
            attack(strength)
        else:
            attack(dexterity)
    elif what_to_do == 2:
        print(name, ", you decide to negotiate.")
        negotiate(charisma)
    elif what_to_do == 3:
        print(name, ", you decide to search.")
        if intelligence > wisdom:
            search(intelligence)
        else:
            search(wisdom)
    elif what_to_do == 4:
        print(name, ", you decide to eat.")
        eat(constitution)
    elif what_to_do == 5:
        game_on = 0
    else:
        print("Whatever you tried to do, you decide it isn't working.")
