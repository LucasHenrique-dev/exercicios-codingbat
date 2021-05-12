"""
Retorne true se "talking" for true e "hour" for menor que 7 ou maior que 20.
"hour" está em um range 0..23 que será determinado pelo horário da hora atual.
"""


def parrot_trouble(talking, hour):
    return talking and (hour < 7 or hour > 20)


print(parrot_trouble(True, 6))
