<?php ?>

<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title></title>
    </head>
    <body>

        <form action="view.php" method="post">
            <label>Name: </label>
            <input type="text" name="name"/><br>
            <Label>Current Age: </label>
            <input type="text" name="current_age"/><br>
            <Label>Age You Wish To Retire</label>
            <input type="text" name="retirement_age"/><br>
            <Label>Current Bank Savings</label>
            <input type="text" name="current_bank_savings"/><br>
            <Label>Current Market Investments</label>
            <input type="text" name="current_market_investments"/><br>
            <Label>Amount Saved In Bank Each Year</label>
            <input type="text" name="amount_saved_in_bank_each_year"/><br>
            <Label>Amount Invested In Market Each Year</label>
            <input type="text" name="amount_invested_in_market_each_year"/><br>
            <input type="submit" value="Submit"/>
        </form>

    </body>
</html>