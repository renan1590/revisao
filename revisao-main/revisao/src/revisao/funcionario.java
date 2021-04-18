package revisao;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


public class funcionario extends usuario {


	
	private String nome;
	private String email;
	List<Integer> horaT = new ArrayList<Integer>();
	List<Float> valorH = new ArrayList<Float>();
	private Calendar dataNascimento;
	private String sexo;

	public String getSexo() 
		{
		return sexo;
		}

	public void setSexo(String sexo) {
		Scanner entrada = new Scanner(System.in);
		Boolean nun = true;

		do {
			if ((sexo.length() > 0) && (sexo.equals("Feminino") || (sexo.equals("Masculino")))) 
			{
				nun = false;
			} 
			else 
			{
				System.out.print(" incorreto Digite novamente o sexo (masculino e feminino): ");
				sexo = entrada.nextLine();
			}

		} while (nun);
		this.sexo = sexo;
	}

	public String getNome() 
		{
		return nome;
		}

	public void setNome(String nome) 
	{
		if (nome.length() > 0)
		{
			this.nome = nome;
		}
	}

	public String getEmail()
		{
		return email;
		}

	public void setEmail(String email)
	{
		if (email.length() > 0)
		{

			this.email = email;
		}
	}

	public String getdataNascimento() 
	{
		String format = (dataNascimento.get(Calendar.DAY_OF_MONTH) + "/" + (dataNascimento.get(Calendar.MONTH) + 1)
				+ "/" + (dataNascimento.get(Calendar.YEAR)));
		return format;
	}

	public void setdataNascimento(Calendar dataNascimento) 
	{
		if (dataNascimento != null) 
		{
			this.dataNascimento = dataNascimento;
		}
	}

	public List<Integer> getHoraT() 
		{
		return horaT;
		}

	public void setHoraT(List<Integer> horaT) 
	{
		if (horaT != null)
		{
			this.horaT = horaT;
		}
	}

	public List<Float> getvalorH() 
		{
		return valorH;
		}

	public void setvalorH(List<Float> valorH) 
	{
		if (valorH != null) 
		{
			this.valorH = valorH;
		}
	}

	public void calcoloMes()
	{
		for (int i = 0; i < horaT.size(); i++) 
		{
			float salar = valorH.get(i) * horaT.get(i);
			System.out.print("\nSalario " + (i + 1) + ": R$ " + salar);
		}
	}

	public void totalSalario()
	{
		float salarTotal = 0;
		for (int i = 0; i < horaT.size(); i++) 
		{
			salarTotal += (valorH.get(i) * horaT.get(i));
		}
		System.out.print("\nSalario Total: R$ " + salarTotal);
	}

	public void mediaSalarrial() 
	{
		float salarTotal = 0, mediaSalar = 0;

		for (int i = 0; i < horaT.size(); i++) 
		{
			salarTotal += (valorH.get(i) * horaT.get(i));
			mediaSalar = salarTotal / horaT.size();
		}
		System.out.println("\n Media Salario: R$ " + mediaSalar);
	}


	public void menoresSalarios(int nun) 
	{
		List<Float> menores = new ArrayList<Float>();
		for (int i = 0; i < horaT.size(); i++) 
		{
			menores.add((float) (valorH.get(i) * horaT.get(i)));
			Collections.sort(menores);
		}
		System.out.println(" \n Menores Salarios ");
		for (int j = 0; j < nun; j++) 
		{
			System.out.println("Salario " + j + ": R$" + menores.get(j));
		}
	
	
	}
	public void maioresSalarios(int nun) 
	{
		List<Float> maiores = new ArrayList<Float>();
		for (int i = 0; i < horaT.size(); i++) 
		{
			maiores.add((float) (valorH.get(i) * horaT.get(i)));
			Collections.sort(maiores);
			Collections.reverse(maiores);
		}
		System.out.println(" \n Maiores Salarios ");
		for (int r = 0; r < nun; r++) {
			System.out.println("Salario " + r + ": R$" + maiores.get(r));
		}
	
	}

	public void mesesTrabalhados() {
		System.out.println("\nMeses trabalhados: " + horaT.size());
	}
	public void anosTrabalhados() 
	{
		int meses = horaT.size();
		int ano = 0;

		if (meses > 12) 
		{
			ano = meses / 12;
			meses = meses % 12;
		}
	
		System.out.println("Anos Trabalhados: " + ano);
		System.out.println("Fração (sobra) de Meses Trabalhados: "+ meses);
		System.out.println("Anos e Meses Trabalhados: "+ano+" Ano e " + meses+" Meses");
	}

	public int anosTrabalhar2() 
	{
		int meses = horaT.size();
		int ano = 0;

		if (meses > 12) 
		{
			ano = meses / 12;
			meses = meses % 12;
		}
		return ano;

	}

	public void aposentar() 
	{
		int ano = anosTrabalhar2();
		int dado = 0, falta = 0, dado2;

		if (getSexo().equals("Feminino")) 
		{
			dado = dataNascimento.get(Calendar.YEAR) + 62;
			falta = (0 > (35 - ano)) ? 0 : (35 - ano);
			dado2 = 2021 + falta;
			System.out.println("Ano dos 35 anos de Contribuição:"+dado2);
			System.out.println("Ano Idade Mínima 62 anos:"+dado);
			System.out.println("Ano Nascimento: "+dataNascimento.get(Calendar.YEAR));
			System.out.println("Ano Aposentadoria:"+Math.max(dado, dado2));
			System.out.println("\n");
			System.out.println("Idade Aposentadoria:"+(Math.max(dado, dado2) - dataNascimento.get(Calendar.YEAR)));
			System.out.println("Idade Atual: "+(2021 - dataNascimento.get(Calendar.YEAR)));
			System.out.println("\n");
			System.out.println("Anos faltantes para se aposentar: "+(Math.max(dado, dado2) - 2021));

		} 
		else if (getSexo().equals("Masculino")) 
		{
			dado = dataNascimento.get(Calendar.YEAR) + 65;
			falta = (0 > (35 - ano)) ? 0 : (35 - ano);
			dado2 = 2021 + falta;
			System.out.println("Ano dos 35 anos de Contribuição:"+dado2);
			System.out.println("Ano Idade Mínima (65 anos):"+dado);
			System.out.println("Ano Nascimento: "+dataNascimento.get(Calendar.YEAR));
			System.out.println("Ano Aposentadoria:"+Math.max(dado, dado2));
			System.out.println("\n");
			System.out.println("Idade Aposentadoria:"+(Math.max(dado, dado2) - dataNascimento.get(Calendar.YEAR)));
			System.out.println("Idade Atual: "+(2021 - dataNascimento.get(Calendar.YEAR)));
			System.out.println("\n");
			System.out.println("Anos faltantes para se aposentar: "+(Math.max(dado, dado2) - 2021));	
		}

	}

	@Override
	public String toString() 
	{
		StringBuilder builder = new StringBuilder();
		builder.append("\nUser: ");
		builder.append(getUsuario());
		builder.append("\nPass: ");
		builder.append(getSenha());
		builder.append("\nNome: ");
		builder.append(nome);
		builder.append("\nE-mail: ");
		builder.append(email);
		builder.append("\nHoras Trabalhadas: ");
		builder.append(horaT);
		builder.append("\nValor Hora: ");
		builder.append(valorH);
		builder.append("\nData de Nascimento: ");
		builder.append(getdataNascimento());
		return builder.toString();
	}

	
}


