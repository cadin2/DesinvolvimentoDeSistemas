tentar = 's'
nome_cadastrado = 'ADM'
senha_cadastrada = 'ADM'

while tentar == 's':
    nome = input('Digite o nome :')
    senha = input('Digite a senha :')

    if nome_cadastrado == nome and senha_cadastrada == senha:
        print(f'Seja bem vindo(a), {nome}')
        break
    else:
        print('Usuário ou senha incorretos! Tente novamente')