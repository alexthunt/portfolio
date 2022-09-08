def shop():
    print(dictonary_of_items)
    item_to_buy = None
    name = None
    name_verification_sentinel = True
    while name_verification_sentinel:
        try:
            name = input("This is the list of items in stock, the first number listed is the price, the second is the "
                         "quantity. What is the name of the item you want to buy? Or say (exit) to go back to main "
                         "menu.")
            name.lower()
            if name == "exit":
                run_program_from_start()
            else:
                item_to_buy = dictonary_of_items[name]
                name_verification_sentinel = False
        except:
            print("Invalid input 8")
    quantity_to_buy = 0
    quantity_sentinel = True
    while quantity_sentinel:
        try:
            quantity_to_buy = int(input("How many do you want to buy?"))
            quantity_sentinel = False
        except:
            print("Invalid input 7")
    quantity_in_stock = item_to_buy[1]
    price_of_item = item_to_buy[0]
    if quantity_to_buy <= quantity_in_stock:
        new_quantity = quantity_in_stock-quantity_to_buy
        dictonary_of_items[name] = [price_of_item, new_quantity]
        print(dictonary_of_items)
    else:
        print("We don't have that many to sell. Sorry.")

def add_or_update():
    price = 0
    quantity = 0
    name = input("What is the name of the item you want to add or update?")
    name.lower()
    price_sentinel = True
    while price_sentinel:
        try:
            price = float(input("What is the price of this item?"))
            price_sentinel = False
        except:
            print("Invalid input 6")
    quantity_sentinel = True
    while quantity_sentinel:
        try:
            quantity = int(input("What is the quantity of this item?"))
            quantity_sentinel = False
        except:
            print("Invalid input 5")
    list_price_quantity = [price, quantity]
    dictonary_of_items[name] = list_price_quantity
    print(dictonary_of_items)


def delete():
    name = input("What is the name of the item you want to delete?")
    name.lower()
    try:
        del dictonary_of_items[name]
    except:
        print("Invalid input 23")


def manage():
    says = 0
    make_sure_it_works = True
    while make_sure_it_works:
        try:
            says = int(input("Do you want to add(1), update(2), or delete(3)?"))
            make_sure_it_works = False
        except:
            print("Invalid input 21")
    if says == 1:
        add_or_update()
    elif says == 2:
        add_or_update()
    elif says == 3:
        delete()
    else:
        print(says)
        print("Invalid Input 20")


def run_program_from_start():
    program_active = True
    while program_active:
        mode_sentinel = True
        mode = 0
        while mode_sentinel:
            try:
                mode = int(input("What do you want to do? Manage or Shop?(1 = manage, 2 = shop)"))
            except:
                print("Invalid Input 2")
                run_program_from_start()
            if mode == 1 or mode == 2:
                mode_sentinel = False
            else:
                print("Invalid input 1")
        if mode == 1:
            manage()
        if mode == 2:
            shop()

dictonary_of_items = {}
run_program_from_start()