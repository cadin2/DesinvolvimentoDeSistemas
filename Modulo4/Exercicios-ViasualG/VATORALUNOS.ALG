Algoritmo "vatoralunos"
// Disciplina   : [Linguagem e L�gica de Programa��o]
// Professor   : Antonio Carlos Nicolodi 
// Descri��o   : Aqui voc� descreve o que o programa faz! (fun��o)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 23/04/2025
Var
nome: vetor[1..4] de caractere
n1: vetor[1..4] de real
n2: vetor[1..4] de real
m: vetor[1..4] de real
i: inteiro

Inicio
para i <- 1 ate 4 faca
   escreval("Aluno ", i)
   escreva("Nome:")
   leia(nome[i])
   escreva("primeira nota: ")
   leia(n1[i])
   escreva("segundo nota: ")
   leia(n2[i])
   m[i] <- (n1[i] + n2[i])/2
fimpara
limpatela
escreval("LISTA DE ALUNOS")
escreval("-----------------")
para i<- 1 ate 4 faca
   escreval(nome[i], m[i])
fimpara
Fimalgoritmo