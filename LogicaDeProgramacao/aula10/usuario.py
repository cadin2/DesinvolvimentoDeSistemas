usuarioSenha = ('administro', '40028922')

while True:
    entrada = input('digite o usuario>>> ').lower()
    entradaSenha = input('digite a senha>>> ')
    
    if  entrada == usuarioSenha[0]:
        if entradaSenha == usuarioSenha[1]:
            print('logado com sucesso')
            break
    else:
        print('usuario ou senha estao errado, tente novamente')