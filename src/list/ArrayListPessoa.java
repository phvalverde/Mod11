package list;

import domain.Pessoa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListPessoa {

    public static void main(String[] args) {
        ListaPessoa();
    }

    private static void ListaPessoa() {
        List<Pessoa> lista = new ArrayList<Pessoa>();
        Pessoa a = new Pessoa("João", "M", "18 anos");
        Pessoa b = new Pessoa("Ana", "F", "17 anos");
        Pessoa c = new Pessoa("Antônio", "M", "19 anos");
        Pessoa d = new Pessoa("Maria", "F", "18 anos");
        lista.add(a);
        lista.add(b);
        lista.add(c);
        lista.add(d);
        Collections.sort(lista);

        System.out.println("");
        System.out.println("**** Todas as pessoas **** " + lista);
        System.out.println("");
        System.out.println("**** Homens **** " + lista.get(1) + lista.get(2));
        System.out.println("");
        System.out.println("**** Mulheres **** " + lista.get(0) + lista.get(3));





    }





}
