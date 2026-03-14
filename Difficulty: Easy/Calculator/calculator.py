def utility(a, b, opr):
    if opr == 1:
        # Use end="" to prevent a trailing newline
        print(str(a + b), end="")
    elif opr == 2:
        print(str(a - b), end="")
    elif opr == 3:
        print(str(a * b), end="")
    else:
        print("Invalid Input", end="")