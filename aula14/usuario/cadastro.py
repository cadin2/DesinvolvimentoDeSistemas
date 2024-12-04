def cadastroUser():
    import json

    print('----CADASTRO-DE-USUARIO----')
    nome = input('insira seu nome>>> ')
    login = input('insira o email>>> ')
    

    while True:
        senha = input('insira a senha>>> ')
        c_senha = input('digite sua senha novamente>>>')

        if senha == c_senha:
            print('cadastro feito com sucesso!')
            break
        else:
            print('senhas divergentes, tente novamente')

    dados = {
        'nome': nome,
        'login': login,
        'senha': senha
    }
    
    with open('dados.json','w', encoding='utf8') as leitura:
        json.dump(
            dados,
            leitura,
            indent=2
        )
