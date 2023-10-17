public class Animal{
    protected String nome;
    protected String especie;
    protected String raca;
    protected String dataNascimento;
    protected String proprietario;
    protected String telefone;

    public Animal(String nome, String especie, String raca, String dataNascimento, String proprietario, String telefone){
    
        this.nome = nome;
        this.especie = especie;
        this.raca = raca;
        this.dataNascimento = dataNascimento;
        this.proprietario = proprietario;
        this.telefone = telefone;

        
        
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEspecie() {
        return especie;
    }
    public void setEspecie(String especie) {
        this.especie = especie;
    }
    
    public String getRaça() {
        return raca;
    }
    public void setRaça(String raça) {
        this.raca = raça;
    }
    public String getDataNascimento() {
        return dataNascimento;
    }
    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    public String getProprietario() {
        return proprietario;
    }
    public void setProprietario(String proprietario) {
        this.proprietario = proprietario;
    }
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
    
        
}





