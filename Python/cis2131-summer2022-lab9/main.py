import json
import urllib.error
import urllib.parse
import urllib.request


def get_stock_price(stock_symbol):
    url = "https://query1.finance.yahoo.com/v8/finance/chart/"

    html = urllib.request.urlopen(f'{url}{stock_symbol}?interval=1d').read()

    result = json.loads(html)

    closing_price = result['chart']['result'][0]['indicators']['quote'][0]['close'][0]

    return closing_price


total = 0
while True:
    stock_symbol_input = input("Enter the symbol of the stock you wish to buy or sell. Or say 'done' to finish.")
    stock_symbol_input.lower()
    if stock_symbol_input == 'done':
        break
    stock_price = get_stock_price(stock_symbol_input)
    order = input(f"The price of this stock is {stock_price}. Type 'buy' or 'sell' then put the number of shares after a space. If you are done, just write the word 'done'.")
    order.lower()
    if order == "done":
        break
    split_order = order.split()
    buy_or_sell = split_order[0]
    shares = split_order[1]
    int_shares = int(shares)
    if buy_or_sell == "buy":
        cost = int_shares * stock_price
        print(f"The cost of this purchase is {cost}")

    if buy_or_sell == "sell":
        old_cost = float(input("What is the price at which you bought this stock originally?"))
        purchase_price = old_cost * int_shares
        sell_price = stock_price * int_shares
        cash_return = sell_price - purchase_price
        print(f"Your return on this investment is {cash_return}")
        total += cash_return

print(f"Your total return is {total}")
