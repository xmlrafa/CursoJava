package testeSave;

import java.util.List;

public class funcionario {
	int idFuncionario;
	String nomeFuncionario;
	String dataNascimentoFuncionario;
	String rgFuncionario;
	String enderecoFuncionario;
	List<funcionario> funcionarios;
	
	public funcionario() {
		
	}	

	public funcionario(int idFuncionario) {
		super();
		this.idFuncionario = idFuncionario;
	}

	public int getIdFuncionario() {
		return idFuncionario;
	}

	public void setIdFuncionario(int idFuncionario) {
		this.idFuncionario = idFuncionario;
	}

	public String getNomeFuncionario() {
		return nomeFuncionario;
	}
	
	public void setNomeFuncionario(String nomeFuncionario) {
		this.nomeFuncionario = nomeFuncionario;
	}

	public String getDataNascimentoFuncionario() {
		return dataNascimentoFuncionario;
	}

	public void setDataNascimentoFuncionario(String dataNascimentoFuncionario) {
		this.dataNascimentoFuncionario = dataNascimentoFuncionario;
	}

	public String getRgFuncionario() {
		return rgFuncionario;
	}

	public void setRgFuncionario(String rgFuncionario) {
		this.rgFuncionario = rgFuncionario;
	}

	public String getEnderecoFuncionario() {
		return enderecoFuncionario;
	}

	public void setEnderecoFuncionario(String enderecoFuncionario) {
		this.enderecoFuncionario = enderecoFuncionario;
	}
	
	
	
}
