package br.com.projetoCurso.cminado.modelo;
@FunctionalInterface
public interface CampoObservador {
	
	
	public void eventoOcorreu(Campo campo, CampoEvento evento);
}
