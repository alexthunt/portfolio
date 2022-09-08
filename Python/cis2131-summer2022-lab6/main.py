import os.path


def get_price_of_item():
    price = 0
    validate_price_loop_sentinel = True
    while validate_price_loop_sentinel:
        validate_price_loop_sentinel = False
        try:
            price = float(input("What is the desired price of this item?\n"))
        except ValueError:
            print("Invalid input for price of an item to be created.")
            validate_price_loop_sentinel = True
    return price


def get_quantity_of_item():
    quantity = 0
    validate_quantity_loop_sentinel = True
    while validate_quantity_loop_sentinel:
        validate_quantity_loop_sentinel = False
        try:
            quantity = int(input("How many of this item should be stock?\n"))
        except ValueError:
            print("Invalid input for quantity of an item to be created.")
            validate_quantity_loop_sentinel = True
    return quantity


def get_name_of_item():
    name_of_item = input("What is the name of your item?\n")
    name_of_item = name_of_item.lower()
    return name_of_item


def item_exists(item_name):
    if os.path.exists(item_name):
        return True
    else:
        return False


def update_item(name_of_item):
    file_to_read = open(name_of_item)
    price = file_to_read.readline()
    quantity = file_to_read.readline()
    file_to_read.close()
    print(f"This item is in stock. It currently has a price of {price} dollars and a quantity of {quantity}.")
    new_price = get_price_of_item()
    new_quantity = get_quantity_of_item()
    file_to_write = open(name_of_item, "w")
    file_to_write.write(f"{new_price} \n {new_quantity}")


def create_item(name_of_item):
    print("That item isn't in stock yet.")
    price = get_price_of_item()
    quantity = get_quantity_of_item()
    file_to_create = open(name_of_item, "w")
    file_to_create.write(f"{price} \n {quantity}")
    file_to_create.close()


def create_or_update_an_item():
    name_of_item = get_name_of_item()
    if item_exists(name_of_item):
        update_item(name_of_item)
    else:
        create_item(name_of_item)


def delete_an_item():
    name_of_item = get_name_of_item()
    if item_exists(name_of_item):
        os.remove(name_of_item)
    else:
        print("That item doesn't exist.")


def manage():
    create_update_or_delete_sentinel = True
    while create_update_or_delete_sentinel:
        create_update_or_delete_sentinel = False
        create_update_or_delete = input("Do you want to create, update, or delete items?\n")
        create_update_or_delete = create_update_or_delete.lower()
        if create_update_or_delete == "create" or create_update_or_delete == "update":
            create_or_update_an_item()
        elif create_update_or_delete == "delete":
            delete_an_item()
        else:
            print("Invalid input for create, update, or delete menu.")
            create_update_or_delete_sentinel = True


def shop():
    continue_buying = 'y'

    while continue_buying == 'y':
        item = input("Welcome to our amazing vending machine, what do you want to buy?")

        if os.path.isfile(item):
            item_file = open(item)
            price = float(item_file.readline())
            quantity_available = int(item_file.readline())

            item_file.close()

            print(f"{item} costs: ${price:.2f} and there are {quantity_available} available")

            quantity_to_buy = quantity_available + 1

            while quantity_to_buy > quantity_available:
                quantity_to_buy = int(input(f"How many {item} do you want to buy?"))

            print(f"That will cost ${quantity_to_buy * price}")

            item_file = open(item, 'w')  # will erase the file it opens

            item_file.write(f"{price}\n")
            item_file.write(f'{quantity_available - quantity_to_buy}')

            item_file.close()

        else:
            print("sorry we don't sell that")

        continue_buying = input("Do you want to buy more? y/n")


mode_loop_sentinel = True
while mode_loop_sentinel:
    mode = input("Do you want to manage, shop, or end?\n")
    mode = mode.lower()
    if mode == "manage":
        manage()
    elif mode == "shop":
        shop()
    elif mode == "end":
        mode_loop_sentinel = False
    else:
        print("Invalid input for manage or shop menu.")
