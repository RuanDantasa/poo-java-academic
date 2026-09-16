package poo_lista02_unidade1;

public class Invoice {
    private String numero;
    private String descricao;
    private int quantidade;
    private double precoItem;

    public Invoice(String numero, String descricao, int quantidade, double precoItem) {
        this.numero = numero;
        this.descricao = descricao;
        setQuantidade(quantidade);
        setPrecoItem(precoItem);
    }

    public String getNumero(){
        return this.numero;
    }
    
    public String getDescricao(){
        return this.descricao;
    }

    public int getQuantidade(){
        return this.quantidade;
    }
    
    public double getPrecoItem(){
        return this.precoItem;
    }

    public void setNumero(String novoValor){
        this.numero = novoValor;
    }

    public void setDescricao(String novoValor){
        this.descricao = novoValor;
    }
    
    public void setQuantidade(int novoValor){
        if(novoValor < 0){
            this.quantidade = 0;
        
        } else {
            this.quantidade = novoValor;
        
        }
    }
    
    public void setPrecoItem(double novoValor){
        if (novoValor  < 0) {
            this.precoItem = 0.0;

        }else {
            this.precoItem = novoValor;
        
        }
        
    }

    public double getInvoiceAmount(){
        return quantidade * precoItem;
    }
}
