from time import sleep as timer

segundos = int(input('insira o tempo do timer: '))

for i in range(segundos,0,-1):
    timer(1)
    print(f'{i} segundos')

print('tampo esgotado')