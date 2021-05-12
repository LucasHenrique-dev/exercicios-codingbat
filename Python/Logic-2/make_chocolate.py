"""
Sabendo que cada unidade de "small" vale 1 e que cada unidade de "big" vale 5,
retorne a quantidade de "small" necessária para se atingir o "goal", sabendo que
deverá se usar todas as "big" possíveis antes. Caso não dê para atingir o "goal",
retorne -1.
Ex.:((4, 1, 9) → 4; (4, 1, 10) → -1; (4, 1, 7) → 2).
"""


def make_chocolate(small, big, goal):
    goal -= int(goal/5)*5 if big*5 > goal else big * 5
    if goal > small:
        return -1
    else:
        return goal


print(make_chocolate(4, 1, 9))
