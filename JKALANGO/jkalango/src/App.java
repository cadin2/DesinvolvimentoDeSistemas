import java.util.ArrayList;
import java.util.List;

import br.com.jkalango.dto.Criador;

public class App {
    public static void main(String[] args) throws Exception {
        Criador paulo = new Criador("Paulo", "paulindolein244@gmail.com", 943764568, "meu nome é paulo, ");
        Criador paulo1 = new Criador("pedro", "paulindolein244@gmail.com", 943234348, "meu nome é ak, ");
        Criador paulo2 = new Criador("joao", "paulindolein244@gmail.com", 94323448, "meu nome é asd, ");
        Criador paulo3 = new Criador("juliao", "paulindolein244@gmail.com", 941347548, "meu nome é sdjf, ");
        Criador paulo4 = new Criador("julio", "paulindolein244@gmail.com", 947897548, "meu nome é kdngk, ");
        Criador paulo5 = new Criador("pedrete", "paulindolein244@gmail.com", 943747548, "meu nome é smki, ");
        Criador paulo6 = new Criador("kesley", "paulindolein244@gmail.com", 943747548, "meu nome é kahuw, ");
        Criador paulo7 = new Criador("paulo", "paulindolein244@gmail.com", 943747548, "meu nome é fjiafj, ");
        Criador paulo8 = new Criador("Paulo", "paulindolein244@gmail.com", 943747548, "meu nome é dmkand, ");
        Criador paulo9 = new Criador("Paulo", "paulindolein244@gmail.com", 943747548, "meu nome é dnjad, ");

        List<Criador> listcreator = new ArrayList<>();
        listcreator.add(paulo);
        listcreator.add(paulo2);
        listcreator.add(paulo3);
        listcreator.add(paulo4);
        listcreator.add(paulo5);
        listcreator.add(paulo6);
        listcreator.add(paulo7);
        listcreator.add(paulo8);
        listcreator.add(paulo9);

        for(Criador criador:listcreator){
            System.out.format("nome:"+criador.getNome());
            System.out.format("\nemail:"+criador.getEmail());
            System.out.format("\ntelefone:"+criador.getTelefone());
            System.out.format("\nperfil:"+ criador.getPerfil());
            System.out.println("\n------------------------------------------------------------------------------------------------------------------------------------");
        }


    }
}
