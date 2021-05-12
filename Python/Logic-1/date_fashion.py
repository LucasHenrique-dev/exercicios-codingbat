"""
Retorne 0, 1 ou 2 de acordo com a seguinte lógica e sabendo que "you" e "date"
possuem valor numérico de 0 a 10, inclusive:
2-> caso "you" ou "date" for 8 ou mais
0-> caso "you" ou "date" for 2 ou menos
1-> para todos os outros casos
"""


def date_fashion(you, date):
    if you <= 2 or date <= 2:
        return 0
    elif you >= 8 or date >= 8:
        return 2
    return 1


print(date_fashion(7, 2))
