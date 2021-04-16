package revisao;

public class usuario {

	private String usuario;
	private String senha;
	
	public usuario () {	
	}
	public usuario (String usuario, String senha) {
		this.usuario = usuario;
		this.senha = senha;
	}
	
	
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		if (usuario.length() > 0);
		this.usuario = usuario;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		if (senha.length() > 0);
		this.senha = senha;
	}
	@Override
	public String toString() {
		return "usuario [usuario=" + usuario + ", senha=" + senha + "]";
	}
	
	
	
}
