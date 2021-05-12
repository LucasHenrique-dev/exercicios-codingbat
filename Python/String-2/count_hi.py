"""
Dada uma String "str", retorne o número de vezes em que a string "hi" aparece.
"""


def count_hi(str):
    return str.count("hi")


# OUTRO JEITO MENOS DIRETO E COM LOOPING
def count_hi_2(str):
    cont = 0
    for i in range(len(str)):
        if str[i:i+2] == "hi":
            cont += 1
    return cont


print(count_hi("hi World"))
print(count_hi_2("hi World"))
