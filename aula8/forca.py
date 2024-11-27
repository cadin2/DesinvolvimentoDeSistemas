tentativas = 6
palavra_secreta = 'PYTHON'
letras_palavra = set(palavra_secreta)
letras_tentadas = set()
    
while tentativas > 0 and letras_palavra:
    palavra_exibida = []
    for letra in palavra_secreta:
        if letra in letras_tentadas:    
            palavra_exibida.append(letra)
        else:
            palavra_exibida.append('_')
        
    print("palavra:",' '.join(palavra_exibida))

    letra = input('Digite uma letra>>> ').upper()

    letras_tentadas.add(letra)
    print(letras_tentadas)
    if letra in letras_palavra:
        print(f'boa sacripanta a letra {letra} esta na palavra!')
        letras_palavra.remove(letra)
    else:
        print(f'tenta de novo largatixa malasiatica, n tem {letra} na palavra')
        tentativas -= 1
        print(f'vidas restantes: {tentativas}')

if not letras_palavra:
    print(f'voce ganhou')
else: 
    print(f'voce perdeu, e a palavra era {palavra_secreta}')