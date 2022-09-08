import random


def draw_a_card_from_an_infinitely_deep_deck():
    rand = random.randint(1, 13)
    card_value = 0
    if rand == 1:
        card_value = 11
    if rand == 2:
        card_value = 2
    if rand == 3:
        card_value = 3
    if rand == 4:
        card_value = 4
    if rand == 5:
        card_value = 5
    if rand == 6:
        card_value = 6
    if rand == 7:
        card_value = 7
    if rand == 8:
        card_value = 8
    if rand == 9:
        card_value = 9
    if rand == 10:
        card_value = 10
    if rand == 11:
        card_value = 10
    if rand == 12:
        card_value = 10
    if rand == 13:
        card_value = 10
    return card_value


class Hand:
    def __init__(self):
        self.card_one = draw_a_card_from_an_infinitely_deep_deck()
        self.card_two = draw_a_card_from_an_infinitely_deep_deck()
        self.card_three = 0
        self.card_four = 0
        self.card_five = 0
        self.card_six = 0
        self.card_seven = 0
        self.card_eight = 0
        self.card_nine = 0

    def get_value(self):
        return self.card_one + self.card_two + self.card_three + self.card_four + self.card_five + self.card_six + self.card_seven + self.card_eight + self.card_nine

    def hit(self):
        if self.card_three == 0:
            self.card_three = draw_a_card_from_an_infinitely_deep_deck()
        elif self.card_four == 0:
            self.card_four = draw_a_card_from_an_infinitely_deep_deck()
        elif self.card_five == 0:
            self.card_five = draw_a_card_from_an_infinitely_deep_deck()
        elif self.card_six == 0:
            self.card_six = draw_a_card_from_an_infinitely_deep_deck()
        elif self.card_seven == 0:
            self.card_seven = draw_a_card_from_an_infinitely_deep_deck()
        elif self.card_eight == 0:
            self.card_eight = draw_a_card_from_an_infinitely_deep_deck()
        elif self.card_nine == 0:
            self.card_nine = draw_a_card_from_an_infinitely_deep_deck()