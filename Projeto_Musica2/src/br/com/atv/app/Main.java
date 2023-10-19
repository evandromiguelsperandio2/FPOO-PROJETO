package br.com.atv.app;
import br.com.apk.model.Audio;
import br.com.apk.model.PodCast;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Audio musica = new Audio();
		
		PodCast podca = new PodCast();
		
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("-- 🎧 Musica 🎧 --");
		
		musica.setNome("Baby Shark");
		
		musica.setCantor("Raposa Rosa");
		
		musica.setClassificacao("Livre");
		
		musica.setGenero("Infantail");
		
		musica.setCurtidas(2000000);
		
		musica.setDuracao(2.16);
		
		musica.setTotalReproducao(1);
		
		musica.setTotalVisualizacao("8 Bilhões");
		
		
		System.out.println("Nome da Musica: " + musica.getNome());
		
		System.out.println("Cantor: " + musica.getCantor());
		
		System.out.println("Classificação: " + musica.getClassificacao());
		
		System.out.println("Genero: " + musica.getGenero());
		
		System.out.println("Duração: " + musica.getDuracao() + " minutos");
		
		System.out.println("Horas escutadas: " + musica.getTotalReproducao() + "hr");
		
		System.out.println("Visualizações totais: " + musica.getTotalVisualizacao());
		
		musica.imprimeAudio();
		
		System.out.println("Se você gostou dessa música digite 1, se não gostou digite 2");
		int curtir = scan.nextInt();
		
		switch (curtir) {
		case 1: 
			System.out.println("Obrigado por te curtido");
			musica.imprimeAudio();
			break;
		
		
		case 2: 
			System.out.println("pena que você não curtiu");
			break;

		
		default:
			System.out.println("Por favor digite em letra minusculas, sem acento e corretamente");
			
		
		
		
		
		System.out.println("-----------------------------------------------------------------");
		
		System.out.println("-- 🎙 Pod Cast 🎙 --");
		
		podca.setNome("FilosoCast");
		
		podca.setConvidado("Marcelo e Parizoti");
		
		podca.setClassificacao("Maior de 16");
		
		podca.setCurtidas(100);
		
		podca.setDuracao(120);
		
		podca.setTotalVisualizacao("100 mil");
		
		System.out.println("Nome do PodCast: " + podca.getNome());
		
		System.out.println("Convidados: " + podca.getConvidado());
		
		System.out.println("Classificação: " + podca.getClassificacao());
		
		System.out.println("Duração Média: " + podca.getDuracao() + " minutos");
		
		podca.imprimeAudio();
		
		System.out.println("Visualizações totais: " + podca.getTotalVisualizacao());
		
		
		
		//-----------------------------------------------------------------------------------------------------
		

		
		
	}
	}

}
