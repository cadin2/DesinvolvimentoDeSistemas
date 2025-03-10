def tabela():
    global tabelaImc
    tabelaImc = {
        'magreza_grave' : 'menor que 16',
        'magreza_moderada' : '16 entre 16,9',
        'magreza_leve' : '17 entre 18,5',
        'peso_ideal' : '18,6 entre 24,9',
        'sobrepeso' : '25 entre 29,9',
        'obesidade' : 'maior 30',
    }

def calcular_imc():
    tabela()
    while True:
        peso = float(input('insira o peso>>> '))
        altura = float(input('insira sua altura>>> '))

        imc = peso / (altura * altura)

        print(f'o seu imc foi {imc:.1f}')

        if imc < 16:
            print(tabelaImc['magreza_grave'])
        elif 16 <= imc < 16.9:
            print(tabelaImc['magreza_moderada'])
        elif 17 <= imc < 18.5:
            print(tabelaImc['magreza_leve'])
        elif 18.6 <= imc < 24.9:
            print(tabelaImc['peso_ideal'])
        elif 25 <= imc < 29.9:
            print(tabelaImc['sobrepeso'])
        elif imc > 30:
            print(tabelaImc['obesidade'])

        sair = input('voce deseja encerrar (s ou n): ')
        
        if sair == 'n':
            continue
        else:
            break

calcular_imc()

