package br.com.isaias_atv_2019_02_20;

import java.util.ArrayList;
import java.util.Random;

public class Teste2 {

	public static void main(String[] args) {
		ArrayList<DuploPersonagem> Personagens = new ArrayList<DuploPersonagem>();
		DuploPersonagem DP = new DuploPersonagem();
        Random Chance = new Random ();
        int j,l;
        for(int i = 0; i < 10; i++) {
        		j = Chance.nextInt(4) + 1;
        		if(j == 1) DP.setPersonagemUm(new King());
        		else if(j == 2)DP.setPersonagemUm(new Queen());
        		else if(j == 3)DP.setPersonagemUm(new Troll());
        		else if(j == 4)DP.setPersonagemUm(new Knight());
        		l = Chance.nextInt(4) + 1;
        		if(l == 1) DP.setPersonagemDois(new Queen());
        		else if(l == 2)DP.setPersonagemDois(new Troll());
        		else if(l == 3)DP.setPersonagemDois(new Knight());
        		else if(l == 4)DP.setPersonagemDois(new King());
        		Personagens.add(DP);
        		System.out.println(Personagens.get(i).getPersonagemUm().getClass().getSimpleName() + " - " + Personagens.get(i).getPersonagemDois().getClass().getSimpleName());
        }
        int i = 0;
		while(!Personagens.isEmpty()) {
			j = Chance.nextInt(2);
			if(!Personagens.get(i).getChar(j).getHit()) {
				Personagens.get(i).Morreu(j);
				if(j == 0)System.out.println(Personagens.get(i).getPersonagemUm().getClass().getSimpleName() + " É o Campeão" );
				else System.out.println(Personagens.get(i).getPersonagemDois().getClass().getSimpleName() + " É o Campeão" );
				Personagens.remove(i);
			}
			if(!Personagens.isEmpty()) i = (i + 1) % Personagens.size();
		}
	}

}
