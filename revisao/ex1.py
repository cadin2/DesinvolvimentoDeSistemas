n1 = int(input("insira o primeiro numero: "))
n2 = int(input("insira o segundo numero: "))
operacao = input("insira os sinais (+)soma, (-)subtração, (*)multiplicação e (/)divisão: ")

match operacao:
    case '+':
        print(f'{n1} + {n2} = {n1 + n2}')
    case '-':
        print(f'{n1} - {n2} = {n1 - n2}')
    case '/':
        print(f'{n1} / {n2} = {n1 / n2}')
    case '*':
        print(f'{n1} * {n2} = {n1 * n2}')
    case _:
        print('operação invalida')