"""
Dada uma String "str", retorne o número de vezes em que a string "code" aparece,
contudo o "d" pode ser substituído por qualquer outra letra ("b", "z", "m"...).
Ex.:(('aaacodebbb') → 1; ('codexxcode') → 2; ('cozexxcope') → 2).
"""


def count_code(str):
    cont = 0
    for i in range(len(str)):
        if str[i:i+2] == "co" and str[i+3:i+4] == "e":
            cont += 1
    return cont


print(count_code("cofe"))
