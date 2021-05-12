"""
Dado um Array "nums", retorne true se nele houver a sequência: 1, 2, 3. Em qualquer
lugar.
"""


def array123(nums):
    for i in range(len(nums)-2):
        if nums[i:i+3] == [1, 2, 3]:
            return True
    return False


print(array123([4, 1, 2, 3]))
