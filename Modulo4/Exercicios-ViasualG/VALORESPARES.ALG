Algoritmo "valorespares"
// Disciplina   : [Linguagem e L�gica de Programa��o]
// Professor   : Antonio Carlos Nicolodi 
// Descri��o   : Aqui voc� descreve o que o programa faz! (fun��o)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 23/04/2025
Var
val: vetor[1..7] de inteiro
i,totpar:inteiro


Inicio
totpar <- 0
para i <- 1 ate 7 faca
   escreval("digite o", i," valor:")
   leia(val[i])
   se (val[i] % 2 = 0) entao
      totpar <- totpar + 1
   fimse
fimpara
escreva("o total de pares foi ", totpar)
Fimalgoritmo