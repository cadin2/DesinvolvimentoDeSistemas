class Usurario:
    def __init__(self,nome,login,senha):
        self.nome = nome
        self.login = login
        self.senha = senha
        self.livro = None

    # isso é necessario para chamar outra classe dentro de uma classe
    @property
    def livro(self):
        return self.livro
    
    @livro.setter
    def  adicionarLivro(self,livro):
        self. = livro

class Livro:
    def __init__(self,nome,autor):
        self.nome = nome
        self.autor = autor

    def mostrarAutor(self):
        return self.autor
        
user = Usurario('Pablo Marçal', 'cadeirante','odeio o datena')
book = Livro('como cadeirar alguem','Datena')

user.livro = book
print(user.livro.mostrarAutor())
print()

