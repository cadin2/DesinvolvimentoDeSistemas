saldo = 50
while True:
    try:
        opcao = int(input('1 - SACAR \n2 - SALDO \n0 - SAIR\n '))
        match opcao:
            case 1:
                try:
                    valorSaque = float(input('Digite o valor a ser sacado'))
                    if valorSaque > saldo:
                        raise Exception
                    elif valorSaque < 0:
                        raise Exception
                    else:
                        print(f'O valor R$ {valorSaque} foi sacado!')
                        saldo -= valorSaque
                except Exception:
                    print('OPERAÇÃO INVÁLIDA')
            case 2:
                print(f'O SALDO DISPONÍVEL É DE R$ {saldo}')
            case 0:
                confirma = input('Confirma? s/n\n').lower()
                
                if confirma == 's':
                    break
                else:
                    continue
            case _:
                print('OPCAO INVÁLIDA TENTE NOVAMENTE!')
    except ValueError as erro:
        print(f'OPÇÃO INVÁLIDA TENTE NOVAMENTE! Código do erro {erro}')
    except Exception as erro:
        print(f'ERRO DESCONHECIDO TENTE NOVAMENTE! Código do erro {erro} ')
    finally:
        print(f'Usuário, saldo disponível é de R${saldo}')