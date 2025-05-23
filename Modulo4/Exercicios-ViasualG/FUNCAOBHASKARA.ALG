Algoritmo "funcaobhaskara"

Var
delta,x1,x2: real

funcao linhas(a,b,c: real ): logico
inicio
   delta <- b^2 - 4*a*c
   se delta < 0 entao
      escreval("não possui raiz real")
      retorne falso
   senao
      x1 <- (-b + raizq(delta))/(2*a)
      x2 <- (-b - raizq(delta))/(2*a)
      escreval("delta: ", delta)
      escreval("x1: ", x1)
      escreval("x2: ", x2)
      retorne verdadeiro
   fimse
fimfuncao

inicio
   se linhas(4, -5, -12)entao
      escreval("realizado com sucesso")
   fimse
Fimalgoritmo