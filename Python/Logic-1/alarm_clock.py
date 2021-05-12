"""
Dada um número inteiro "day" que segue a lógica: 0-> domingo, 1-> segunda..
6-> sábado. E um tipo booleano "vacation", Retorne os seguintes valores com
suas lógicas correspondentes:
"7:00"-> quando for um dia da semana e "vacation" for false
"10:00"-> quando for um fim de semana e "vacation" false ou um dia de semana e
"vacation" true
"off"-> quando for um fim de semana e "vacation" for true
"""


def alarm_clock(day, vacation):
    semana = [n for n in range(1, 6)]
    if vacation:
        if day in semana:
            return "10:00"
        return "off"
    if day in semana:
        return "7:00"
    return "10:00"


print(alarm_clock(0, True))