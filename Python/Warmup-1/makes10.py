"""
Retorne true se um dos números dado for 10 ou a sua soma resulte em 10.
"""


def makes10(a, b):
    return a == 10 or b == 10 or (a+b == 10)


print(makes10(8, 2))
