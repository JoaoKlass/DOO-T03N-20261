package loja.model;

public class Venda {
    private static int contId = 1;
    private int id;
    private int quant;
    private double valVen;
    private double desconto;

    public Venda(int quant, double valVen, double desconto){
        this.id = contId++; // Gera id
        this.quant = quant;
        this.valVen = valVen;
        this.desconto = desconto;
    }

}
