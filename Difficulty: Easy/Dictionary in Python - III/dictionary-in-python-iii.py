# insert into dictionary
def insert_dict(query, dict):
    key = query[1]
    # Ensure marks are stored as an integer
    value = int(query[2])
    dict[key] = value
    # REMOVED: print("Inserted") - The driver code likely does this

# deleting from dictionary
def del_dict(query, dict):
    key = query[1]
    if key in dict:
        del dict[key]
        # REMOVED: print("Deleted") - The driver code likely does this
    else:
        # Keep this if the driver doesn't handle the 'not found' case
        print("-1")

# print marks of required name
def print_dict(key, dict):
    if key in dict:
        # Match exact format: "Marks of geeks is 300"
        print("Marks of " + str(key) + " is " + str(dict[key]))
    else:
        print("-1")
