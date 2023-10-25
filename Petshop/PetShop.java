import java.util.ArrayList;
import java.util.Scanner;

public class PetShop {
    public static void main(String[] args) throws Exception {
        ArrayList<Produto> brinquedos = new ArrayList<>();
        ArrayList<Produto> alimentos = new ArrayList<>();
        ArrayList<Produto> produtos = new ArrayList<>();
        ArrayList<Cachorro> listaCachorros = new ArrayList<>();
        ArrayList<Gato> listaGatos = new ArrayList<>();
        ArrayList<Agenda> listaAgendamentos = new ArrayList<>();
        
        Log meuLogger = new Log("Log.txt");
        //aqui o usuário digita os dados para cadastro ou S para sair
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Cadastro dos clientes Petshop Amigo Fiel. " );
            System.out.println("Digite o nome do animal(ou S para sair): " );
            String nome = scanner.nextLine();
        if(nome.equalsIgnoreCase("S")){
        break;
        }
            System.out.println("Digite a especie: ");
            String especie = scanner.nextLine();
            System.out.println("Digite a raça: ");
            String raca = scanner.nextLine();
            System.out.println("Digite a data de nascimento: ");
            String dataNascimento = scanner.nextLine();
            System.out.println("Digite o nome do proprietário: ");
            String proprietario = scanner.nextLine();
            System.out.println("Digite o telefone para contato: ");
            String telefone = scanner.nextLine();
        
            System.out.println("=======================");
    
            //alguns serviços do Petshop
            System.out.println("=====Nossos Serviços:====== ");
            Banho banho = new Banho();
            banho.descricao();
            banho.preco();
            Tosa tosa = new Tosa();
            tosa.descricao();
            tosa.preco();
            ConsultaVeterinaria consultaVet = new ConsultaVeterinaria();
            consultaVet.descricao();
            consultaVet.preco();
            BanhoETosa banhoTosa = new BanhoETosa();
            banhoTosa.descricao();
            banhoTosa.preco();
            //aqui o usuário escolhe o tipo de serviço
            System.out.println("Banho: " + banho.preco());
            System.out.println("Tosa: "  + tosa.preco());
            System.out.println("Consulta Veterinária: "  + consultaVet.preco());
            System.out.println("Banho e tosa: " + banhoTosa.preco());
            System.out.println("===========================");
            System.out.println("Digite o serviço escolhido:" );
            String servicos = scanner.nextLine();
            meuLogger.logger.info("Servico escolhido: " + servicos);
        
            System.out.println("===========================");
            //agenda: aqui são incluídos os agendamentos pelo scanner
            String cancelarAgen = "Agendamento cancelado!";
            Agenda agendamento = new Agenda(nome,  especie, raca, dataNascimento, proprietario, telefone);
            listaAgendamentos.add(0, agendamento);
            agendamento.setDiaSemana(cancelarAgen);;
            agendamento.setHorario(cancelarAgen);   
            agendamento.setCancelamento(cancelarAgen);
        
            //o usuário escolhe o dia e horário do agendamento
            System.out.println("Dias disponíveis: ");
            System.out.println("Segunda" );
            System.out.println("Terça" );
            System.out.println("Quarta" );
            System.out.println("Quinta" );
            System.out.println("Sexta" );
            System.out.println("Sábado" );
            System.out.println("===========================");
            System.out.println("Horários disponíveis: ");
            System.out.println("09:00" );
            System.out.println("10:00" );
            System.out.println("11:00" );
            System.out.println("14:00" );
            System.out.println("15:00" );
            System.out.println("16:00" );
            System.out.println("===========================");
            System.out.println("Digite o dia do agendamento: ");
            String novoDiaSemana = scanner.nextLine();
            meuLogger.logger.info("Dia escolhido: " + novoDiaSemana);
            System.out.println("===========================");
            System.out.println("Digite o horário: ");
            String novoHorario = scanner.nextLine();
            meuLogger.logger.info("Horário escolhido: " + novoHorario);
        

            boolean sucessoAgen = agendamento.agendar(novoHorario, novoDiaSemana, listaAgendamentos);
        if(sucessoAgen){
            System.out.println("Agendamento realizado!");
                
        }else {   
            //aqui pergunta se o usuário deseja cancelar o agen caso o horário já esteja preenchido
            System.out.println("===========================");   
            System.out.println("Deseja cancelar o agendamento? " );
            System.out.println("Digite sim ou não" );
            String cancelarAgen1  = scanner.nextLine();
            System.out.println("Digite novamente os dados com novo horário.");
            System.out.println("===========================");
        
            agendamento.cancelar(cancelarAgen);
            String resultadoCancelamento = agendamento.getCancelamento();
            System.out.println(resultadoCancelamento);
        }
            //aqui mesmo o agen sendo cancelado, está retornando a lista com os dados. E não é p retornar.
            //Não consegui ajeitar! :/

            System.out.println("==========================");
            //clientes agendados inseridos pelo scanner
            System.out.println("Dados do agendamento:");
        for(Agenda agendamentos : listaAgendamentos){
                System.out.println("Animal: " + agendamentos.getNome());
                System.out.println("Espécie: " + agendamentos.getEspecie());
                System.out.println("Raça: " + agendamentos.getRaça());
                System.out.println("Data nascimento: " + agendamentos.getDataNascimento());
                System.out.println("proprietário: " + agendamentos.getProprietario());
                System.out.println("telefone: " + agendamentos.getTelefone());
                System.out.println("Serviço:  " + servicos);
                System.out.println("Dia agendado: " + novoDiaSemana);
                System.out.println("Horário agendado: " + novoHorario);
            }
    
        }
            //clientes pets já cadastrados no sistema
            Cachorro ca1 = new Cachorro("Caramelo", "Cachorro", "viralata", "20/9/21","Patricia", "8199413987");
            Cachorro ca2 = new Cachorro("Tufo", "Cachorro", "Bulldog", "8/3/17","Vinicius", "8199413987");
            Gato ga1 = new Gato("Lala", "Gato", "SRD", "8/05/18","Layla", "8199413987");
            Gato ga2 = new Gato("Chica", "Gato", "SRD", "15/08/17","Luzi", "8199413987");
            listaCachorros.add(ca1);
            listaCachorros.add(ca2);
            listaGatos.add(ga1);
            listaGatos.add(ga2);

            //adicionando produtos ao estoque
            System.out.println("===========================");
            System.out.println("======Nossos produtos======");
            Produto item1 = new Produto( "Bolinha ",  6.0,   20);
            Produto item2 = new Produto( "Varinha ",  8.0,   30);
            Produto item3 = new Produto( "Osso de plastico ", 10.0,  10);
            brinquedos.add(item1);
            brinquedos.add(item2);
            brinquedos.add(item3);

            Produto item4 = new Produto( "Ração ",   150.0,  30);
            Produto item5 = new Produto( "Petisco ",  5.0,  40);
            alimentos.add(item4);
            alimentos.add(item5);
        

        Produto produtos1 = new Produto("Caminha", 200.0,  5);
        produtos.add(produtos1);
        Produto produtos2 = new Produto("Caixa passeio", 120.0, 10);
        produtos.add(produtos2);
        System.out.println("===========================");
        
        //listando os produtos do estoque
        System.out.println("Lista dos nossos produtos em estoque: ");
        for(Produto brinquedo : brinquedos){
        System.out.println("Brinquedos: ");
        System.out.println("Item: " + brinquedo.getItem()+  "\nPreço: " + brinquedo.getPreço() +   
                           "\nQuantidade em estoque: " + brinquedo.getQuantidadeEstoque()); 
                           
        }
        System.out.println("----------------------------");
        for(Produto alimento : alimentos){
        System.out.println("Alimentos: ");
        System.out.println("Item: " + alimento.getItem()  + "\nPreço: " + alimento.getPreço() + 
                           "\nQuantidade em estoque: " +  alimento.getQuantidadeEstoque());
                           
        }
        System.out.println("----------------------------");
        for(Produto produto : produtos){
        System.out.println("Produtos: ");
        System.out.println("Item: " + produto.getItem() + "\nPreço: " + produto.getPreço() +
                            "\nQuantidade em estoque: " + produto.getQuantidadeEstoque());
        }
                            
        System.out.println("===========================");

        //caso o cliente queira algum produto, o usuário inclui no sistema
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("O cliente deseja comprar algum produto? ");
        System.out.println("Digite o produto desejado");
        String produto1 = scanner.nextLine();
        System.out.println("Digite a quantidade desejada");
        int quantDesejada = scanner.nextInt();
        scanner.nextLine();
        System.out.println("===========================");
        System.out.println("Produto escolhido pelo cliente: " + produto1);
        System.out.println("Quantidade desejada: " + quantDesejada);
        System.out.println("Produto separado.");

        //aqui  é a parte que atualiza o estoque conforme as vendas.
        System.out.println("===========================");
        
        Produto vendaProduto = produtos.get(quantDesejada);
        int quantVenda = 6;
        if(vendaProduto.getQuantidadeEstoque() >= quantDesejada){
            vendaProduto.vender(quantDesejada);
            System.out.println("Venda realizada!");
            
        }else{
            System.out.println("Produto fora de estoque.");
        }

        System.out.println("===========================");
       //lista dos clientes pets já cadatrados no sistema
        System.out.println("====Lista dos clientes pets:==== ");
        System.out.println("=======Cachorros=======");
        for (Cachorro cachorro : listaCachorros) {
            System.out.println("Nome: " + cachorro.getNome() + 
            "\nEspécie: " + cachorro.getEspecie() + "\nRaça:" + cachorro.getRaça() + "\nData Nascimento: " + cachorro.getDataNascimento()
            + "\nProprietário: " + cachorro.getProprietario() + "\nTelefone: " + cachorro.getTelefone());
            
        }
        System.out.println("=======Gatos=======");
        for (Gato gato : listaGatos) {
            System.out.println("Nome: " + gato.getNome() + 
            "\nEspécie: " + gato.getEspecie() + "\nRaça:" + gato.getRaça() + "\nData Nascimento: " + gato.getDataNascimento()
            + "\nProprietário: " + gato.getProprietario() + "\nTelefone: " + gato.getTelefone());
        }
     
        System.out.println("=======================");
        meuLogger.logger.info("Lista atualizada " + listaAgendamentos);
    }

    
}

    
