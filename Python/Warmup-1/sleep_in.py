"""
Retorne true se "weekday" for false ou "vacation" true.
"""


def sleep_in(weekday, vacation):
    return not weekday or vacation


print(sleep_in(False, False))
