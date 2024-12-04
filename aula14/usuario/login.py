def loginUser():
    import json
    print('----LOGIN-DE-USUARIO----')
    login = input('insira o nome de usuario>>> ')
    senha = input('insira o nome de senha>>> ')

    with open('dados.json','r', encoding='utf8') as leitura:
        dados = json.load(leitura)
        c_user = dados['nome']
        c_senha = dados['senha']
    
    if c_user == login and c_senha:
        print(f'login feito com sucesso!')
    else: 
        print('login ou senha incorretos!')
