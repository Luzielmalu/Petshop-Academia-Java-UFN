public class Produto {
    private String item;
    private double preco;
    private int quantidadeEstoque;


     
    public Produto(String item, double preco, int quantidadeEstoque){
        
        this.item = item;
        this.preco = preco;
        this.quantidadeEstoque = quantidadeEstoque;

      
    }
   
    public String getItem() {
        return item;
    }
    public void setItem(String categoria) {
        this.item = item;
    }
    public double getPreço() {
        return preco;
    }
    public void setPreço(double preço) {
        this.preco = preço;
    }
    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }
    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }
    public void vender(int quantDesejada) {
        if (quantDesejada <= quantidadeEstoque) {
            quantidadeEstoque -= quantDesejada;
            System.out.println("Venda realizada.");
    } else {
        System.out.println("Produto fora de estoque.");
    }
    System.out.println("Estoque atual: " + quantidadeEstoque);

    }
    
        
    
        
    
    
}
