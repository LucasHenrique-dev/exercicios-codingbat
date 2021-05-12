"""
Dada uma String "str", retorne uma nova que obedeça a seguinte lógica:
string_splosion("Code")-> "CCoCodCode".
"""


def string_splosion(str):
    result = ""
    for i in range(len(str)):
        result += str[:i+1]
    return result


print(string_splosion("Code"))
