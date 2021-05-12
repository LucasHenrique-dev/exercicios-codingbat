"""
Dada uma lista numérica "nums", retorne true caso ela possua um "2" imediatamente
próximo a outro, em qualquer lugar.
Ex.:(([1, 2, 2]) → True; ([1, 2, 1, 2]) → False; ([2, 1, 2]) → False).
"""


def has22(nums):
    for i in range(len(nums)):
        if nums[i:i+2] == [2, 2]:
            return True
    return False


print(has22([1, 2, 3, 2]))
