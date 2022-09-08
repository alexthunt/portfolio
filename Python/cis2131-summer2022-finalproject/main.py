import random

from Hand import Hand
from ScoreSheet import ScoreSheet


def dealers_turn():
    while dealer.get_value() <= 16:
        dealer.hit()


def players_turn():
    rand = random.randint(1, 2)
    if rand == 1:
        player.hit()
        return True
    else:
        return False


score_sheet = ScoreSheet()
number_of_times_the_loop_has_been_completed = 0
while number_of_times_the_loop_has_been_completed < 100000:
    player = Hand()
    dealer = Hand()
    starting_value = player.get_value()
    player_won = False
    player_lost = False
    player_draw = False
    player_hit = players_turn()
    if player.get_value() > 21:
        player_lost = True
    elif player.get_value() == 21:
        player_won = True
    else:
        dealers_turn()
        if dealer.get_value() > 21:
            player_won = True
        else:
            if player.get_value() > dealer.get_value():
                player_won = True
            elif player.get_value() < dealer.get_value():
                player_lost = True
            else:
                player_draw = True
    score_sheet.insert_outcome(starting_value, player_won, player_lost, player_draw, player_hit)
    number_of_times_the_loop_has_been_completed += 1
    print(number_of_times_the_loop_has_been_completed)
score_sheet.print()
