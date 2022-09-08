class ScoreSheet:
    def __init__(self):
        self.four_win = 0
        self.five_win = 0
        self.six_win = 0
        self.seven_win = 0
        self.eight_win = 0
        self.nine_win = 0
        self.ten_win = 0
        self.eleven_win = 0
        self.twelve_win = 0
        self.thirteen_win = 0
        self.fourteen_win = 0
        self.fifteen_win = 0
        self.sixteen_win = 0
        self.seventeen_win = 0
        self.eighteen_win = 0
        self.nineteen_win = 0
        self.twenty_win = 0
        self.twenty_one_win = 0
        self.twenty_two_win = 0
        self.four_win_with_hit = 0
        self.five_win_with_hit = 0
        self.six_win_with_hit = 0
        self.seven_win_with_hit = 0
        self.eight_win_with_hit = 0
        self.nine_win_with_hit = 0
        self.ten_win_with_hit = 0
        self.eleven_win_with_hit = 0
        self.twelve_win_with_hit = 0
        self.thirteen_win_with_hit = 0
        self.fourteen_win_with_hit = 0
        self.fifteen_win_with_hit = 0
        self.sixteen_win_with_hit = 0
        self.seventeen_win_with_hit = 0
        self.eighteen_win_with_hit = 0
        self.nineteen_win_with_hit = 0
        self.twenty_win_with_hit = 0
        self.twenty_one_win_with_hit = 0
        self.twenty_two_win_with_hit = 0

        self.four_lose = 0
        self.five_lose = 0
        self.six_lose = 0
        self.seven_lose = 0
        self.eight_lose = 0
        self.nine_lose = 0
        self.ten_lose = 0
        self.eleven_lose = 0
        self.twelve_lose = 0
        self.thirteen_lose = 0
        self.fourteen_lose = 0
        self.fifteen_lose = 0
        self.sixteen_lose = 0
        self.seventeen_lose = 0
        self.eighteen_lose = 0
        self.nineteen_lose = 0
        self.twenty_lose = 0
        self.twenty_one_lose = 0
        self.twenty_two_lose = 0
        self.four_lose_with_hit = 0
        self.five_lose_with_hit = 0
        self.six_lose_with_hit = 0
        self.seven_lose_with_hit = 0
        self.eight_lose_with_hit = 0
        self.nine_lose_with_hit = 0
        self.ten_lose_with_hit = 0
        self.eleven_lose_with_hit = 0
        self.twelve_lose_with_hit = 0
        self.thirteen_lose_with_hit = 0
        self.fourteen_lose_with_hit = 0
        self.fifteen_lose_with_hit = 0
        self.sixteen_lose_with_hit = 0
        self.seventeen_lose_with_hit = 0
        self.eighteen_lose_with_hit = 0
        self.nineteen_lose_with_hit = 0
        self.twenty_lose_with_hit = 0
        self.twenty_one_lose_with_hit = 0
        self.twenty_two_lose_with_hit = 0

        self.four_draw = 0
        self.five_draw = 0
        self.six_draw = 0
        self.seven_draw = 0
        self.eight_draw = 0
        self.nine_draw = 0
        self.ten_draw = 0
        self.eleven_draw = 0
        self.twelve_draw = 0
        self.thirteen_draw = 0
        self.fourteen_draw = 0
        self.fifteen_draw = 0
        self.sixteen_draw = 0
        self.seventeen_draw = 0
        self.eighteen_draw = 0
        self.nineteen_draw = 0
        self.twenty_draw = 0
        self.twenty_one_draw = 0
        self.twenty_two_draw = 0
        self.four_draw_with_hit = 0
        self.five_draw_with_hit = 0
        self.six_draw_with_hit = 0
        self.seven_draw_with_hit = 0
        self.eight_draw_with_hit = 0
        self.nine_draw_with_hit = 0
        self.ten_draw_with_hit = 0
        self.eleven_draw_with_hit = 0
        self.twelve_draw_with_hit = 0
        self.thirteen_draw_with_hit = 0
        self.fourteen_draw_with_hit = 0
        self.fifteen_draw_with_hit = 0
        self.sixteen_draw_with_hit = 0
        self.seventeen_draw_with_hit = 0
        self.eighteen_draw_with_hit = 0
        self.nineteen_draw_with_hit = 0
        self.twenty_draw_with_hit = 0
        self.twenty_one_draw_with_hit = 0
        self.twenty_two_draw_with_hit = 0

    def insert_outcome(self, starting_value, player_won, player_lost, player_draw, player_hit):
        if player_won and not player_hit:
            if starting_value == 4:
                self.four_win += 1
            elif starting_value == 5:
                self.five_win += 1
            elif starting_value == 6:
                self.six_win += 1
            elif starting_value == 7:
                self.seven_win += 1
            elif starting_value == 8:
                self.eight_win += 1
            elif starting_value == 9:
                self.nine_win += 1
            elif starting_value == 10:
                self.ten_win += 1
            elif starting_value == 11:
                self.eleven_win += 1
            elif starting_value == 12:
                self.twelve_win += 1
            elif starting_value == 13:
                self.thirteen_win += 1
            elif starting_value == 14:
                self.fourteen_win += 1
            elif starting_value == 15:
                self.fifteen_win += 1
            elif starting_value == 16:
                self.sixteen_win += 1
            elif starting_value == 17:
                self.seventeen_win += 1
            elif starting_value == 18:
                self.eighteen_win += 1
            elif starting_value == 19:
                self.nineteen_win += 1
            elif starting_value == 20:
                self.twenty_win += 1
            elif starting_value == 21:
                self.twenty_one_win += 1
            elif starting_value == 22:
                self.twenty_two_win += 1
        elif player_won and player_hit:
            if starting_value == 4:
                self.four_win_with_hit += 1
            elif starting_value == 5:
                self.five_win_with_hit += 1
            elif starting_value == 6:
                self.six_win_with_hit += 1
            elif starting_value == 7:
                self.seven_win_with_hit += 1
            elif starting_value == 8:
                self.eight_win_with_hit += 1
            elif starting_value == 9:
                self.nine_win_with_hit += 1
            elif starting_value == 10:
                self.ten_win_with_hit += 1
            elif starting_value == 11:
                self.eleven_win_with_hit += 1
            elif starting_value == 12:
                self.twelve_win_with_hit += 1
            elif starting_value == 13:
                self.thirteen_win_with_hit += 1
            elif starting_value == 14:
                self.fourteen_win_with_hit += 1
            elif starting_value == 15:
                self.fifteen_win_with_hit += 1
            elif starting_value == 16:
                self.sixteen_win_with_hit += 1
            elif starting_value == 17:
                self.seventeen_win_with_hit += 1
            elif starting_value == 18:
                self.eighteen_win_with_hit += 1
            elif starting_value == 19:
                self.nineteen_win_with_hit += 1
            elif starting_value == 20:
                self.twenty_win_with_hit += 1
            elif starting_value == 21:
                self.twenty_one_win_with_hit += 1
            elif starting_value == 22:
                self.twenty_two_win_with_hit += 1
        elif player_lost and player_hit:
            if starting_value == 4:
                self.four_lose_with_hit += 1
            elif starting_value == 5:
                self.five_lose_with_hit += 1
            elif starting_value == 6:
                self.six_lose_with_hit += 1
            elif starting_value == 7:
                self.seven_lose_with_hit += 1
            elif starting_value == 8:
                self.eight_lose_with_hit += 1
            elif starting_value == 9:
                self.nine_lose_with_hit += 1
            elif starting_value == 10:
                self.ten_lose_with_hit += 1
            elif starting_value == 11:
                self.eleven_lose_with_hit += 1
            elif starting_value == 12:
                self.twelve_lose_with_hit += 1
            elif starting_value == 13:
                self.thirteen_lose_with_hit += 1
            elif starting_value == 14:
                self.fourteen_lose_with_hit += 1
            elif starting_value == 15:
                self.fifteen_lose_with_hit += 1
            elif starting_value == 16:
                self.sixteen_lose_with_hit += 1
            elif starting_value == 17:
                self.seventeen_lose_with_hit += 1
            elif starting_value == 18:
                self.eighteen_lose_with_hit += 1
            elif starting_value == 19:
                self.nineteen_lose_with_hit += 1
            elif starting_value == 20:
                self.twenty_lose_with_hit += 1
            elif starting_value == 21:
                self.twenty_one_lose_with_hit += 1
            elif starting_value == 22:
                self.twenty_two_lose_with_hit += 1
        elif player_lost and not player_hit:
            if starting_value == 4:
                self.four_lose += 1
            elif starting_value == 5:
                self.five_lose += 1
            elif starting_value == 6:
                self.six_lose += 1
            elif starting_value == 7:
                self.seven_lose += 1
            elif starting_value == 8:
                self.eight_lose += 1
            elif starting_value == 9:
                self.nine_lose += 1
            elif starting_value == 10:
                self.ten_lose += 1
            elif starting_value == 11:
                self.eleven_lose += 1
            elif starting_value == 12:
                self.twelve_lose += 1
            elif starting_value == 13:
                self.thirteen_lose += 1
            elif starting_value == 14:
                self.fourteen_lose += 1
            elif starting_value == 15:
                self.fifteen_lose += 1
            elif starting_value == 16:
                self.sixteen_lose += 1
            elif starting_value == 17:
                self.seventeen_lose += 1
            elif starting_value == 18:
                self.eighteen_lose += 1
            elif starting_value == 19:
                self.nineteen_lose += 1
            elif starting_value == 20:
                self.twenty_lose += 1
            elif starting_value == 21:
                self.twenty_one_lose += 1
            elif starting_value == 22:
                self.twenty_two_lose += 1
        elif player_draw and player_hit:
            if starting_value == 4:
                self.four_draw_with_hit += 1
            elif starting_value == 5:
                self.five_draw_with_hit += 1
            elif starting_value == 6:
                self.six_draw_with_hit += 1
            elif starting_value == 7:
                self.seven_draw_with_hit += 1
            elif starting_value == 8:
                self.eight_draw_with_hit += 1
            elif starting_value == 9:
                self.nine_draw_with_hit += 1
            elif starting_value == 10:
                self.ten_draw_with_hit += 1
            elif starting_value == 11:
                self.eleven_draw_with_hit += 1
            elif starting_value == 12:
                self.twelve_draw_with_hit += 1
            elif starting_value == 13:
                self.thirteen_draw_with_hit += 1
            elif starting_value == 14:
                self.fourteen_draw_with_hit += 1
            elif starting_value == 15:
                self.fifteen_draw_with_hit += 1
            elif starting_value == 16:
                self.sixteen_draw_with_hit += 1
            elif starting_value == 17:
                self.seventeen_draw_with_hit += 1
            elif starting_value == 18:
                self.eighteen_draw_with_hit += 1
            elif starting_value == 19:
                self.nineteen_draw_with_hit += 1
            elif starting_value == 20:
                self.twenty_draw_with_hit += 1
            elif starting_value == 21:
                self.twenty_one_draw_with_hit += 1
            elif starting_value == 22:
                self.twenty_two_draw_with_hit += 1
        elif player_draw and not player_hit:
            if starting_value == 4:
                self.four_draw += 1
            elif starting_value == 5:
                self.five_draw += 1
            elif starting_value == 6:
                self.six_draw += 1
            elif starting_value == 7:
                self.seven_draw += 1
            elif starting_value == 8:
                self.eight_draw += 1
            elif starting_value == 9:
                self.nine_draw += 1
            elif starting_value == 10:
                self.ten_draw += 1
            elif starting_value == 11:
                self.eleven_draw += 1
            elif starting_value == 12:
                self.twelve_draw += 1
            elif starting_value == 13:
                self.thirteen_draw += 1
            elif starting_value == 14:
                self.fourteen_draw += 1
            elif starting_value == 15:
                self.fifteen_draw += 1
            elif starting_value == 16:
                self.sixteen_draw += 1
            elif starting_value == 17:
                self.seventeen_draw += 1
            elif starting_value == 18:
                self.eighteen_draw += 1
            elif starting_value == 19:
                self.nineteen_draw += 1
            elif starting_value == 20:
                self.twenty_draw += 1
            elif starting_value == 21:
                self.twenty_one_draw += 1
            elif starting_value == 22:
                self.twenty_two_draw += 1

    def print(self):
        print(f"[4] wins:{self.four_win} draws:{self.four_draw} losses:{self.four_lose} [4 with hit] wins:{self.four_win_with_hit} draws:{self.four_draw_with_hit} losses:{self.four_lose_with_hit}")
        print(f"[5] wins:{self.five_win} draws:{self.five_draw} losses:{self.five_lose} [5 with hit] wins:{self.five_win_with_hit} draws:{self.five_draw_with_hit} losses:{self.five_lose_with_hit}")
        print(f"[6] wins:{self.six_win} draws:{self.six_draw} losses:{self.six_lose} [6 with hit] wins:{self.six_win_with_hit} draws:{self.six_draw_with_hit} losses:{self.six_lose_with_hit}")
        print(f"[7] wins:{self.seven_win} draws:{self.seven_draw} losses:{self.seven_lose} [7 with hit] wins:{self.seven_win_with_hit} draws:{self.seven_draw_with_hit} losses:{self.seven_lose_with_hit}")
        print(f"[8] wins:{self.eight_win} draws:{self.eight_draw} losses:{self.eight_lose} [8 with hit] wins:{self.eight_win_with_hit} draws:{self.eight_draw_with_hit} losses:{self.eight_lose_with_hit}")
        print(f"[9] wins:{self.nine_win} draws:{self.nine_draw} losses:{self.nine_lose} [9 with hit] wins:{self.nine_win_with_hit} draws:{self.nine_draw_with_hit} losses:{self.nine_lose_with_hit}")
        print(f"[10] wins:{self.ten_win} draws:{self.ten_draw} losses:{self.ten_lose} [10 with hit] wins:{self.ten_win_with_hit} draws:{self.ten_draw_with_hit} losses:{self.ten_lose_with_hit}")
        print(f"[11] wins:{self.eleven_win} draws:{self.eleven_draw} losses:{self.eleven_lose} [11 with hit] wins:{self.eleven_win_with_hit} draws:{self.eleven_draw_with_hit} losses:{self.eleven_lose_with_hit}")
        print(f"[12] wins:{self.twelve_win} draws:{self.twelve_draw} losses:{self.twelve_lose} [12 with hit] wins:{self.twelve_win_with_hit} draws:{self.twelve_draw_with_hit} losses:{self.twelve_lose_with_hit}")
        print(f"[13] wins:{self.thirteen_win} draws:{self.thirteen_draw} losses:{self.thirteen_lose} [13 with hit] wins:{self.thirteen_win_with_hit} draws:{self.thirteen_draw_with_hit} losses:{self.thirteen_lose_with_hit}")
        print(f"[14] wins:{self.fourteen_win} draws:{self.fourteen_draw} losses:{self.fourteen_lose} [14 with hit] wins:{self.fourteen_win_with_hit} draws:{self.fourteen_draw_with_hit} losses:{self.fourteen_lose_with_hit}")
        print(f"[15] wins:{self.fifteen_win} draws:{self.fifteen_draw} losses:{self.fifteen_lose} [15 with hit] wins:{self.fifteen_win_with_hit} draws:{self.fifteen_draw_with_hit} losses:{self.fifteen_lose_with_hit}")
        print(f"[16] wins:{self.sixteen_win} draws:{self.sixteen_draw} losses:{self.sixteen_lose} [16 with hit] wins:{self.sixteen_win_with_hit} draws:{self.sixteen_draw_with_hit} losses:{self.sixteen_lose_with_hit}")
        print(f"[17] wins:{self.seventeen_win} draws:{self.seventeen_draw} losses:{self.seventeen_lose} [17 with hit] wins:{self.seventeen_win_with_hit} draws:{self.seventeen_draw_with_hit} losses:{self.seventeen_lose_with_hit}")
        print(f"[18] wins:{self.eighteen_win} draws:{self.eighteen_draw} losses:{self.eighteen_lose} [18 with hit] wins:{self.eighteen_win_with_hit} draws:{self.eighteen_draw_with_hit} losses:{self.eighteen_lose_with_hit}")
        print(f"[19] wins:{self.nineteen_win} draws:{self.nineteen_draw} losses:{self.nineteen_lose} [19 with hit] wins:{self.nineteen_win_with_hit} draws:{self.nineteen_draw_with_hit} losses:{self.nineteen_lose_with_hit}")
        print(f"[20] wins:{self.twenty_win} draws:{self.twenty_draw} losses:{self.twenty_lose} [20 with hit] wins:{self.twenty_win_with_hit} draws:{self.twenty_draw_with_hit} losses:{self.twenty_lose_with_hit}")
        print(f"[21] wins:{self.twenty_one_win} draws:{self.twenty_one_draw} losses:{self.twenty_one_lose} [21 with hit] wins:{self.twenty_one_win_with_hit} draws:{self.twenty_one_draw_with_hit} losses:{self.twenty_one_lose_with_hit}")
        print(f"[22] wins:{self.twenty_two_win} draws:{self.twenty_two_draw} losses:{self.twenty_two_lose} [22 with hit] wins:{self.twenty_two_win_with_hit} draws:{self.twenty_two_draw_with_hit} losses:{self.twenty_two_lose_with_hit}")
