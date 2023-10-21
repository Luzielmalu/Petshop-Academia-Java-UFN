import java.util.List;

public class Agenda extends Animal{
    private String animal; 
    private String servico;
    private String diaSemana;
    private String horario;
    private String cancelamento;
   

    public Agenda(String nome, String especie, String raca, String dataNascimento, String proprietario, String telefone){
        super(nome, especie, raca, dataNascimento, proprietario, telefone);
        this.animal = animal;
        this.servico = servico;
        this.diaSemana = diaSemana;
        this.horario = horario;
        this.cancelamento = cancelamento;
        
        
        
    }
    public String getAnimal() {
        return animal;
    }
    public void setAnimal(String animal) {
        this.animal = animal;
    }
    public String getServico() {
        return servico;
    }
    public void setServico(String servico) {
        this.servico = servico;
    }
    public String getDiaSemana() {
        return diaSemana;

    }
    public void setDiaSemana(String diaSemana) {
        this.diaSemana = diaSemana;
    }
        
    public String getHorario() {
        
        return horario;
    }
    public void setHorario(String horario) {
        this.horario = horario;
    
    }
    //agendar e não permitir agendar no mesmo dia e horário
    public boolean agendar(String novoHorario, String novoDiaSemana, List<Agenda> listaAgendamentos) {
        
        for (Agenda agendamento : listaAgendamentos) {
            if (agendamento.getDiaSemana().equals(novoDiaSemana) && agendamento.getHorario().equals(novoHorario)) {
                System.out.println("O dia selecionado já está ocupado.");
                return false; 
            }
        }

        setDiaSemana(novoDiaSemana);
        setHorario(novoHorario);
        return true; 
    }          
    //aqui mesmo se o cliente digitar não, vai retornar que está cancelado    
    public void cancelar(String cancelarAgen){
        String resultadoCancelamento = "";
        if(cancelarAgen.equalsIgnoreCase("sim")){
            resultadoCancelamento = "Agendamento cancelado!";
            System.out.println(resultadoCancelamento);   
            
        }else if(cancelarAgen.equalsIgnoreCase("não")){
            resultadoCancelamento = "Agendamento cancelado";
            System.out.println(resultadoCancelamento); 
             
        }
            
    }
    public String getCancelamento() {
        return cancelamento;
    }
    public void setCancelamento(String cancelamento) {
        this.cancelamento = cancelamento;
    }

    
        
        
}
