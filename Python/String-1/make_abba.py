"""
Dada 2 Strings ("a" e "b"), retorne outra no fomato "abba".
Ex.:(('Hi', 'Bye') → 'HiByeByeHi'; ('What', 'Up') → 'WhatUpUpWhat'; ('Yo', 'Alice') → 'YoAliceAliceYo').
"""


def make_abba(a, b):
    return a + 2*b + a


print(make_abba("Hi", "bye"))
