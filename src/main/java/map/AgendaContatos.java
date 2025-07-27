package main.java.map;

import java.security.Key;
import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {

    private Map<String, String> contatos = new HashMap<>();

    public void adicionarContato(String nome, String numero){
        this.contatos.put(nome, numero);
    }

    public void removerContato(String nome){
        if(!this.contatos.isEmpty()){
            this.contatos.remove(nome);
        }
    }

    public void exibirContatos(){
        System.out.println("-----------");
        for (String v : contatos.keySet()) {
            System.out.println(v);
        }
        System.out.println(contatos);
        System.out.println("-----------");
    }

    public String pesquisarPorNome(String nome){
        System.out.println("-----------");
        if(contatos.containsKey(nome)){
            return contatos.get(nome);
        }
        System.out.println("-----------");
        return "Não existe um contato com esse nome";
    }

    public static void main(String[] args) {
        AgendaContatos agenda = new AgendaContatos();

        agenda.adicionarContato("leo", "(11)5555-6666");
        agenda.adicionarContato("Caio", "(11)5555-7777");
        agenda.adicionarContato("Luiz", "(11)5555-8888");
        agenda.adicionarContato("Bia", "(11)5555-8888");
        agenda.adicionarContato("Caio", "(11)5555-9999"); // Quando usamos o metodo put para adicionar um
                                                                        // elemento que já existe em um map o elemento
                                                                        // existente não será substituído pelo novo e o novo
                                                                        // e o novo não será ignorado mas o novo elemento
                                                                        // será utilizado como uma atualização do valor antigo
        agenda.exibirContatos();

        agenda.removerContato("Caio");
        agenda.exibirContatos();

        System.out.println(agenda.pesquisarPorNome("Luiz"));
    }

}
