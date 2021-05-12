"""
Dado um número inteiro "temp" e um tipo booleano "is_summer", retorne true caso
"temp" estiver entre 60 e 90, inclusive, a menos que "is_summer" seja true aí
o limite superior máximo passa a ser 100.
"""


def squirrel_play(temp, is_summer):
    if temp >= 60:
        if temp > 90:
            return temp <= 100 and is_summer
        return True
    return False


print(squirrel_play(95, True))
