<?php
$name = htmlspecialchars(filter_input(INPUT_POST, 'name'));
$current_age = htmlspecialchars(filter_input(INPUT_POST, 'current_age'));
$retirement_age = htmlspecialchars(filter_input(INPUT_POST, 'retirement_age'));
$current_bank_savings = htmlspecialchars(filter_input(INPUT_POST, 'current_bank_savings'));
$current_market_investments = htmlspecialchars(filter_input(INPUT_POST, 'current_market_investments'));
$amount_saved_in_bank_each_year = htmlspecialchars(filter_input(INPUT_POST, 'amount_saved_in_bank_each_year'));
$amount_invested_in_market_each_year = htmlspecialchars(filter_input(INPUT_POST, 'amount_invested_in_market_each_year'));
?>

<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title></title>
    </head>
    <body>
        <?php
        //calculate bank savings
        $time_spent_saving = $retirement_age - $current_age;
        for ($index = 0; $index < $time_spent_saving; $index++) {
            $current_bank_savings = ($current_bank_savings + $amount_saved_in_bank_each_year) * 1.01;
            $market_multiplier = ((rand(-10, 30)) / 100) + 1;
            $current_market_investments = ($current_market_investments + $amount_invested_in_market_each_year) * $market_multiplier;
            $current_age = $current_age+1;
            echo htmlspecialchars("$name, during year number $index, you are $current_age, you have a value of $current_bank_savings in the bank. And you have $current_market_investments in the market. \n");
        }
        $net_worth = $current_bank_savings+$current_market_investments;
        $net_worth_inflaction_adjustment = $net_worth/1.03^$time_spent_saving;
        echo htmlspecialchars("You will be worth $net_worth at retirement, but because of inflation it will only feel like you have $net_worth_inflaction_adjustment dollars.");
        ?>

    </body>
</html>