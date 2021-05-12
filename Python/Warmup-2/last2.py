"""
Dada uma String "str", retorne a quantidade de vezes que o conjunto das 2 últimas
letras se repentem (não deverá ser contado o próprio final). Pode haver sobreposição.
Ex.:(('hixxhi') → 1; ('xaxxaxaxx') → 1; ('axxxaaxx') → 2).
"""


def last2(str):
    end = str[-2:]
    result = 0
    for i in range(len(str)):
        if str[:i].endswith(end):
            result += 1
    return result


# OUTRO JEITO MAIS EXPLICADO E PASSO A PASSO
def last2_2(str):
    # Screen out too-short string case.
    if len(str) < 2:
        return 0

    # last 2 chars, can be written as str[-2:]
    last_2 = str[len(str) - 2:]
    count = 0

    # Check each substring length 2 starting at i
    for i in range(len(str) - 2):
        sub = str[i:i + 2]
        if sub == last_2:
            count = count + 1

    return count


print(last2("hixxxx"))
print(last2_2("hixxxx"))
