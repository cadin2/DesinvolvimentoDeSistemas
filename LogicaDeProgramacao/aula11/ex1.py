n1 = int(input('insira o primeiro numero>>> '))
n2 = int(input('insira o segundo numero>>> '))
operacao = input('insira a operação(/,*,-,+)>>> ')

soma = n1 + n2
sub = n1 - n2
mult = n1 * n2
try:
    div = n1 / n2
    print(f'{n1} / {n2} = {div}')
except ZeroDivisionError:
    print('não pode dividir por 0 animal')


if operacao == '+':
    print(f'{n1} + {n2} = {soma}')
elif operacao == '-':
    print(f'{n1} - {n2} = {sub}')
elif operacao == '*':
    print(f'{n1} * {n2} = {mult}')

        
