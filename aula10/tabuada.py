numero = int(input(f'digite o numero que quer saber a tabuada>>> '))

for i in range(1,11,1):
    print(f'|{numero} X {i} = {numero * i}  |')
    print('-'*14)