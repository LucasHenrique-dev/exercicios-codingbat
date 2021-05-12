"""
Dado um número inteiro "speed" e um tipo booleano "is_birthday", retorne 2, 1 ou 0
seguindo a seguinte lógica:
0-> se "speed" for menor ou igual a 60
1-> se "speed" estiver no intervalo entre 61 e 80, inclusive
2-> se "speed" for maior ou igual a 81
Porém se "is_birthday" for true, o "speed" pode ser 5 unidades maior em cada caso.
"""


def caught_speeding(speed, is_birthday):
    new_speed = speed-5 if is_birthday else speed
    if new_speed >= 81:
        return 2
    elif new_speed >= 61:
        return 1
    return 0


print(caught_speeding(65, True))
