notas = [0,0,0]

for i in range(0,3,1):
    nota = float(input(f"Digite a {i + 1}ª nota: "))
    notas[i] = nota

mediaFinal = (notas[0] * 2 + notas[1] * 3 + notas[2] * 5) / 10

print(f"a media final do aluno é: {mediaFinal:.2f}")