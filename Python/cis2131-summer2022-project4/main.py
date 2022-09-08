import os

roster = []


def administrator():
    print("administrator mode.")
    admin = int(input("Do you want to create(1), update(2), delete(3), or print roster(4)?"))
    if admin == 1:
        admin_create()
    if admin == 2:
        admin_update()
    if admin == 3:
        admin_delete()
    if admin == 4:
        admin_print_roster()


def admin_create():
    class_name = input("What is the name of the class you are going to create?")
    roster.append(class_name)
    student_names = []
    sentinel = 0
    while sentinel < 5:
        student_name = input("maximum students is 5, what is the name of a student to add? Or say \"done\"")
        student_name.lower()
        if student_name == "done":
            break
        student_names.append(student_name)
        sentinel += 1
    file_to_create = open(class_name, "w")
    index = 0
    for x in student_names:
        file_to_create.write(f"{student_names[index]}splithere \n")
        index += 1
    file_to_create.close()


def admin_update():
    class_name = input("What is the name of the class you want to update?")
    file_to_read = open(class_name, "r")
    student_names = []
    for line in file_to_read:
        name = line.split("splithere")
        student_names.append(name[0])
    file_to_read.close()
    print(student_names)
    what_now = int(input("Do you want to add someone(1), remove someone(2), or change the name of this class(3)?"))
    if what_now == 1:
        name = input(
            "What is the name of the person you want to add? Keep in mind, if this class already has 5 people, no one else can be added.")
        if len(student_names) < 5:
            student_names.append(name)
            file_to_write = open(class_name, "w")
            index = 0
            for x in student_names:
                file_to_write.write(f"{student_names[index]}splithere \n")
                index += 1
            file_to_write.close()
    if what_now == 2:
        name = input("Write the name of the person that will be removed from this class.")
        student_names.remove(name)
        file_to_write = open(class_name, "w")
        index = 0
        for x in student_names:
            file_to_write.write(f"{student_names[index]}splithere \n")
            index += 1
        file_to_write.close()
    if what_now == 3:
        os.remove(class_name)
        roster.remove(class_name)
        new_class_name = input("Write the new name of this class")
        roster.append(new_class_name)
        file_to_write = open(new_class_name, "w")
        index = 0
        for x in student_names:
            file_to_write.write(f"{student_names[index]}splithere \n")
            index += 1
        file_to_write.close()


def admin_delete():
    class_name = input("Write the name of the class that you want to delete.")
    os.remove(class_name)


def admin_print_roster():
    for class_name in roster:
        file_to_read = open(class_name)
        student_names = []
        for line in file_to_read:
            name = line.split("splithere")
            student_names.append(name[0])
        file_to_read.close()
        print(f"{class_name} has {student_names}.")


def enroll(student_name):
    print(roster)
    class_name = input("write the name of the class you want to enroll in, if that class is full you can't enroll.")
    file_to_read = open(class_name, "r")
    student_names = []
    for line in file_to_read:
        name = line.split("splithere")
        student_names.append(name[0])
    file_to_read.close()
    if len(student_names) < 5:
        student_names.append(student_name)
        file_to_write = open(class_name, "w")
        index = 0
        for x in student_names:
            file_to_write.write(f"{student_names[index]}splithere \n")
            index += 1
        file_to_write.close()


def unenroll(student_name):
    class_name = input("write the name of the class that you want to un-enroll from.")
    file_to_read = open(class_name, "r")
    student_names = []
    for line in file_to_read:
        name = line.split("splithere")
        student_names.append(name[0])
    file_to_read.close()
    student_names.remove(student_name)
    file_to_write = open(class_name, "w")
    index = 0
    for x in student_names:
        file_to_write.write(f"{student_names[index]}splithere \n")
        index += 1
    file_to_write.close()


def print_enrolled_classes(student_name):
    for class_name in roster:
        file_to_read = open(class_name, "r")
        student_names = []
        for line in file_to_read:
            name = line.split("splithere")
            student_names.append(name[0])
        file_to_read.close()
        if student_name in student_names:
            print(class_name)


def student():
    student_name = input("What is your name?")
    student_name.lower()
    student_input = int(input("Do you want to enroll(1), un-enroll(2), or print a list of your classes?(3)?"))
    if student_input == 1:
        enroll(student_name)
    if student_input == 2:
        unenroll(student_name)
    if student_input == 3:
        print_enrolled_classes(student_name)


while True:
    mode = int(input("Administrator mode(1) or student mode(2)?"))
    if mode == 1:
        administrator()

    if mode == 2:
        student()
