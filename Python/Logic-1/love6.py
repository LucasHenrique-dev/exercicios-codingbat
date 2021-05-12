"""
Dado 2 números inteiros ("a" e "b"), retorne true caso eles sejam "6" ou se sua
soma ou diferença absoluta resulte em 6.
"""


def love6(a, b):
    return a == 6 or b == 6 or a+b == 6 or abs(a-b) == 6


print(love6(4, 2))
