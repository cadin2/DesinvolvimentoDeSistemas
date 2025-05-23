Algoritmo "bola inverso esquerdo"
// Disciplina   : [Linguagem e Lógica de Programação]
// Professor   : Antonio Carlos Nicolodi

Var

i, j,k, linhas: inteiro
espaco: caractere

Inicio

linhas <- 5
espaco <- " "

para i de 1 ate linhas faca
   para j de 1 ate i faca
   escreva("*")
   fimpara
escreval(espaco)
fimpara

para i de 1 ate linhas faca
   para j de 1 ate (linhas - i) faca
      escreva(espaco)  // Imprime os espaços antes dos asteriscos
   fimpara
   para k de 1 ate i faca
      escreva("*")  // Imprime os asteriscos
   fimpara
   escreval(" ")  // Nova linha após cada iteração
fimpara

Fimalgoritmo
