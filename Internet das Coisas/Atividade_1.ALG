Algoritmo "Atividade_1"
// Disciplina   : [Linguagem e L�gica de Programa��o]
// Professor   : Antonio Carlos Nicolodi 
// Descri��o   : Aqui voc� descreve o que o programa faz! (fun��o)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 15/04/2025
Var
// Se��o de Declara��es das vari�veis 
a,b,c,delta,x1,x2: real
number, contador, opcao: inteiro

Inicio
// Se��o de Comandos, procedimento, fun��es, operadores, etc.

escreval("escolha uma opcao")
escreval("1 - par ou impar")
escreval("2 - bhaskara")
escreval("3 - contador")
escreval("qual a opcao voce deseja executar:")
leia(opcao)

escolha opcao
   caso 1
      escreva("insira  um numero: ")
      leia(number)

      se (number %2 = 0) entao
         escreva("o numero", number, " � par")
      senao
         escreva("o numero", number, " � impar")
   fimse
   
   caso 2
      escreva("insira o coeficiente A: ")
      leia(a)
      escreva("insira o coeficiente B: ")
      leia(b)
      escreva("insira o coeficiente C: ")
      leia(c)

      delta <- (b^2)- 4 . a . c

      escreval("o valor de delta: ", delta)

      x1 <- (-b + raizq(delta))/2.a
      x2 <- (-b - raizq(delta))/2.a

      escreval("o x1 �: ", x1)
      escreval("o x2 �: ", x2)
   fimescolha
   
   caso 3
      para contador de 0 ate 50 passo 5 faca
         escreval(contador)
      fimpara
   fimescolha
   
   outrocaso
   fimescolha


Fimalgoritmo