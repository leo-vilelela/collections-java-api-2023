package main.java.set;

import com.sun.source.doctree.SeeTree;

import java.util.HashSet;
import java.util.Set;

public class ConjuntConvidados {

    private Set<Convidado> convidadoSet;

    public ConjuntConvidados() {
        this.convidadoSet = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigoConvite){
          convidadoSet.add(new Convidado(nome, codigoConvite));
    }

    public void removerConvidado(int codigoConvite){
        Convidado convidadoToRemove = null;
        for(Convidado convidado : convidadoSet) {
            if (convidado.getCodigoConvite() == codigoConvite){
                convidadoToRemove = convidado;
                break;
            }
        };
        convidadoSet.remove(convidadoToRemove);
    }

    public int contarConvidados(){
        return convidadoSet.size();
    }

    public void exibirConvidados(){
        System.out.println(convidadoSet);
    }

    public static void main(String[] args) {
        ConjuntConvidados conjuntConvidados = new ConjuntConvidados();

        conjuntConvidados.adicionarConvidado("convidado 1", 1);
        conjuntConvidados.adicionarConvidado("convidado 2", 2);
        conjuntConvidados.adicionarConvidado("convidado 3", 2);
        conjuntConvidados.adicionarConvidado("convidado 4", 4);

        System.out.println("Existem " + conjuntConvidados.contarConvidados() + " convidado(s) dentro do set de convidados");
        conjuntConvidados.removerConvidado(2);
        System.out.println("Existem " + conjuntConvidados.contarConvidados() + " convidado(s) dentro do set de convidados");
        conjuntConvidados.exibirConvidados();
    }
}
