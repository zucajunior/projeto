/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.data.crud;

import br.data.entity.Cidade;

/**
 *
 * @author alexandrelerario
 */
public class CrudCidade {

    private static java.util.ArrayList<Cidade> lcid = new java.util.ArrayList<>();

    ;

    public CrudCidade() {

    }

    public java.util.ArrayList<Cidade> getAll() {
        return lcid;
    }

    public void add(Cidade cid) {
        lcid.add(cid);
    }

    public void create(Cidade cid) {
        lcid.add(cid);

    }

    public Cidade getCidade(int codigo) {
        for (Cidade cidade : lcid) {
            if (cidade.getCodigo() == codigo) {
                return cidade;
            }
        }
        return null;
    }

    public void Remove(int codigo) {
        Cidade cid = getCidade(codigo);
        if (cid != null) {
            lcid.remove(cid);
        }
    }
}
