package revisao;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

public class usuario {

	private String usuario;
	private String senha;

	public usuario() 
	{
		return;
	}

	public usuario(String usuario, String senha)
	{
		this.usuario = usuario;
		this.senha = senha;
	}

	public String getUsuario() 
	{
		return usuario;
	}

	public void setUsuario(String usuario)
	{
		if (usuario.length() > 0)
			;
		this.usuario = usuario;
	}

	public String getSenha() 
	{
		return senha;
	}

	public void setSenha(String senha)
	{
		try (Scanner entrada = new Scanner(System.in)) 
		{
			Boolean nun = true;

			do {
				if ((usuario.length() == 0) || (usuario.equals(senha))) 
				{
					System.out.println(" Digite novamente a usuario:");
					senha = entrada.nextLine();
				}
				else 
				{
					nun = false;
				}
			} while (nun);
		}
		System.out.println(" usuario correta:");
		this.senha = senha;

		try {
			MessageDigest r = MessageDigest.getInstance("SHA-1");

			r.update(senha.getBytes(), 0, senha.length());

			byte[] digest = r.digest();

			String hexa = new BigInteger(1, digest).toString(16);
			this.senha = hexa;
		} catch (NoSuchAlgorithmException e) 
		{
			e.printStackTrace();
		}
	}

}
