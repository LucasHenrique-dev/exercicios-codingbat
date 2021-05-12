"""
Dada uma String "str", retorne true se ela possuir a string "xyz", contanto que
ela não seja precedida por um ponto ".".
"""


def xyz_there(str):
    for i in range(len(str)):
        if str[i:i+3] == "xyz" and not str[i-1:i] == ".":
            return True
    return False


print(xyz_there('abc.xyz'))
