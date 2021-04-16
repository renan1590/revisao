package revisao;

import java.util.Arrays;

public class funcionario extends usuario {

	private String nome;
	private String email;
	private String datanacimento;
    
	int[] horatrab = { 12, 56};
	int[] valorhora = { 45, 85};
	
	public String getNome() {
		return nome;
	}
	@Override
	public String toString() {
		return "funcionario [nome=" + nome + ", email=" + email + ", datanacimento=" + datanacimento + ", horatrab="
				+ Arrays.toString(horatrab) + "]";
	}
	public void setNome(String nome) {
		if (nome.length() > 0);
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		if (email.length() > 0);
		this.email = email;
	}
	public String getDatanacimento() {
		return datanacimento;
	}
	public void setDatanacimento(String datanacimento) {
		if (datanacimento.length() > 0);
		this.datanacimento = datanacimento;
	}
	
	
	
	
	
}
