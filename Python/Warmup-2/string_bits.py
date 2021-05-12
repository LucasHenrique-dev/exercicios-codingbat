"""
Dada uma String "str", retorne uma nova onde deverá seguir a seguinte lógica:
1° caractere, 3°, 5°, 7°, 9°...
"""


def string_bits(str):
    return str[0::2]


# UM JEITO MAIS EXPLICADO E PASSO A PASSO
def string_bits_2(str):
    result = ""
    # Many ways to do this. This uses the standard loop of i on every char,
    # and inside the loop skips the odd index values.
    for i in range(len(str)):
        if i % 2 == 0:
            result = result + str[i]
    return result


print(string_bits("Heeololeo"))
print(string_bits_2("HELLO"))
