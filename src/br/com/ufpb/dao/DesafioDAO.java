package br.com.ufpb.dao;

import br.com.ufpb.modelo.Desafio;

public class DesafioDAO extends GenericDAO <Desafio> {
	 
	public long retornaIdDesafio(){
		DesafioDAO dao = new DesafioDAO();
		int ultimo;
		if (dao.findAll().size()==0){
			ultimo= 0; 
		}else{
			ultimo  = dao.findAll().size()-1;
		}
		return ultimo;
	}
}
