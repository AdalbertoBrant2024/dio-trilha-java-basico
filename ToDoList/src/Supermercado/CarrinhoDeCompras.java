
package Supermercado;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class CarrinhoDeCompras {
    List<Item> carrinhoCompras;
    public CarrinhoDeCompras(){
        carrinhoCompras = new ArrayList<>();
    }
    
    public void adicionarItem(String nome, double preco, int quantidade){
        carrinhoCompras.add(new Item(nome, preco, quantidade));
    }
    
    public void removerItem(String nome){
        for (Item t : carrinhoCompras){
            if(t.getNome().equalsIgnoreCase(nome)){
                carrinhoCompras.remove(t);
                System.out.println("Item "+nome+ " removido");
                break;
            }
        }
        
    }
    
    public double calcularValorTotal(){
        double soma = 0;
        for(Item t : carrinhoCompras){
            soma += t.getTotalItem();
        }
        return soma;
    }
    
    public void exibirItems(){
        if(carrinhoCompras.size() != 0){
            for(Item t : carrinhoCompras){
                System.out.println(t.toString());
            }
        }
        else{
            System.out.println("Carrinho está vazio, vamos comprar Agora ?");
        }
    }
}
