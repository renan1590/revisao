package revisao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;
import java.util.Scanner;


public class main {

	public static void main(String[] args) {
		
		int ano = 0, mes = 0, dia = 0;
		Scanner entrada = new Scanner(System.in);


		usuario u = new usuario();
		funcionario funs = new funcionario();
		/**/
		funs.setUsuario("renan");
		funs.setSenha("renan2");
		funs.setNome("renan M");
		funs.setEmail("Renan1.998@hotmail.com");
		funs.setSexo("Masculino");
		
		List<Integer> horaT = Arrays.asList(1, 200,30, 400, 50, 60, 700, 80, 900, 10, 11, 12, 13, 14, 15, 16, 17, 18, 18);
        ArrayList<Float> valorH = new ArrayList<>(Arrays.asList(100.33f,20000f,300f,40000f,500f,100.33f,20000f,300f,40000f,500f,100.33f,20000f,300f,40000f,500f,500f,500f,500f,500f));
        funs.setHoraT(horaT);
        funs.setvalorH(valorH);

		Calendar d = Calendar.getInstance();
		d.set(Calendar.DATE, 29);
		d.set(Calendar.MONTH, 11);
		d.set(Calendar.YEAR, 1998);
		
		funs.setdataNascimento(d);
		System.out.println("----------------------------------------\n:");
		funs.calcoloMes();
		funs.totalSalario();
		funs.mediaSalarrial();
		System.out.println("----------------------------------------\n:");
		funs.menoresSalarios(2);
		funs.maioresSalarios(2);
		System.out.println("----------------------------------------\n:");
		funs.mesesTrabalhados();
		funs.anosTrabalhados();
		System.out.println("----------------------------------------\n:");
		funs.aposentar();
		
		
		System.out.println(funs.getdataNascimento());
		System.out.println(funs);
	
	}
}
