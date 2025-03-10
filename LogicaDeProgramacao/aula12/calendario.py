import calendar
from datetime import datetime

ano = datetime.now().year
dia = datetime.now().day
mes = datetime.now().month

print(f'Voce esta no ano de {ano}\nmes: {mes}\ndia: {dia}')

print(calendar.calendar(ano))
