"""
Sabendo que cada unidade de "small" vale 1 e que cada unidade de "big" vale 5,
retorne se é possível obter "goal" com os valores de "small" e "big" dados.
"""


def make_bricks(small, big, goal):
    big = int(goal/5) if big*5 > goal else big
    return (goal - (big*5 + small)) <= 0


print(make_bricks(2, 5, 18))
