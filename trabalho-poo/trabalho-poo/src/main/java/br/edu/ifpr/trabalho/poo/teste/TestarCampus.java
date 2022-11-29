package br.edu.ifpr.trabalho.poo.teste;

import java.util.ArrayList;

import br.edu.ifpr.trabalho.poo.implementacao.BuscaDados;
import br.edu.ifpr.trabalho.poo.implementacao.InserirDados;
import br.edu.ifpr.trabalho.poo.implementacao.LeituraDados;
import br.edu.ifpr.trabalho.poo.interfaces.IBuscaDeDados;
import br.edu.ifpr.trabalho.poo.interfaces.IInserirDados;
import br.edu.ifpr.trabalho.poo.interfaces.ILeituraDeDados;
import br.edu.ifpr.trabalho.poo.modelo.Campus;

public class TestarCampus {

	public static void main(String[] args) {
		ILeituraDeDados leitura = new LeituraDados();
		IBuscaDeDados busca = new BuscaDados();
		IInserirDados insercao = new InserirDados();
		Campus campus = leitura.lerDadosCampus();
		insercao.salvarCampus(campus);
		ArrayList<Campus> listaCampus = busca.buscarCampi();
		for (Campus c : listaCampus) {
			c.imprimirDados();
		}
	}

}
