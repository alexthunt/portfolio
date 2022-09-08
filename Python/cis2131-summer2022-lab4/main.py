month_loop_must_continue = "true"
while month_loop_must_continue == "true":
    month_number = int(input("What is the number of a month?"))
    if 0 < month_number <= 12:
        month_loop_must_continue = "false"
    else:
        print("Number must be between 1 and 12.")

day_loop_must_continue = "true"
while day_loop_must_continue == "true":
    day_number = int(input("What is the number of a day?"))
    if 0 < day_number <= 31:
        day_loop_must_continue = "false"
    else:
        print("Number must be between 1 and 31.")

year_loop_must_continue = "true"
while year_loop_must_continue == "true":
    year_number = int(input("What is the number of a year?"))
    if 2022 < year_number <= 2099:
        year_loop_must_continue = "false"
    else:
        print("Number must be between 2023 and 2099.")


start_month_to_increment = 6
start_day_to_increment = 17
start_year_to_increment = 2022
number_of_days_counted = 0

count_days_incomplete = "true"
while count_days_incomplete == "true":
    if start_day_to_increment == day_number:
        count_days_incomplete = "false"
    elif start_day_to_increment == 31:
        start_day_to_increment = 1
        number_of_days_counted += 1
    else:
        start_day_to_increment += 1
        number_of_days_counted += 1

count_months_incomplete = "true"
while count_months_incomplete == "true":
    if start_month_to_increment == month_number:
        count_months_incomplete = "false"
    elif start_month_to_increment == 12:
        start_month_to_increment = 1
        number_of_days_counted += 31
    else:
        start_month_to_increment += 1
        number_of_days_counted += 31

count_years_incomplete = "true"
while count_years_incomplete == "true":
    if start_year_to_increment == year_number:
        count_years_incomplete = "false"
    else:
        start_year_to_increment += 1
        number_of_days_counted += 365

print("From 6-17-2022 until that date there will be ", number_of_days_counted, " days.")

second = 00
minute = 00
hour = 00

for hour in range(24):
    for minute in range(60):
        for second in range(60):
            print(hour, ":", minute, ":", second)
