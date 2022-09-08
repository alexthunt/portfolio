sentence = input("Provide a sentence for scrambling")

invalid_input = True
while invalid_input:
    try:
        stride = int(input("Provide the stride."))
        invalid_input = False
    except:
        print("Must be an integer.")

sentence = sentence.lower()

print("Let's Scramble!")
start_index = 0
while start_index < stride:
    print(sentence[start_index::stride], end="")
    start_index += 1
