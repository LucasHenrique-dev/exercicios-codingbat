"""
Dada uma String "str", retorne uma nova com um "not" no início, exceto se ela já
começar com, nesse caso retorne a string sem alteração.
"""


def not_string(str):
    if str.startswith('not'):
        return str
    else:
        return 'not ' + str


# OUTRO JEITO DE SE FAZER
def not_string_2(str):
    if len(str) >= 3 and str[:3] == "not":
        return str
    return "not " + str
    # str[:3] goes from the start of the string up to but not
    # including index 3


print(not_string("x"))
