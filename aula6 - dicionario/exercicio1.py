produto = {}

while True:
    nome = input("insira o nome do produto:")
    preco = input("insira o preco do produto:")
    estoque = input("insira a quantidade de estoque do produto:")
    print('--------------------------------------')

    produto[nome] = {
        'preço' : preco,
        'estoque': estoque
    }    

    sair = input('deseja continuar: (sim ou nao) ')
    if sair == 'nao':
        break

print(produto)