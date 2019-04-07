package br.com.isaias_atv_2019_02_20;
import java.util.ArrayList;
import java.util.Random;

public class Teste {
	public static void main(String[] args) {
		ArrayList <Character> Personagens = new ArrayList<Character>();
        Random Chance = new Random ();
		King k = new King();
		Queen q = new Queen();
		Troll t = new Troll();
		Knight kn = new Knight();
		Personagens.add(k);
		Personagens.add(q);
		Personagens.add(t);
		Personagens.add(kn);
		System.out.println("=====================    Atacando   ===========================");
		for(Character e : Personagens) {
			e.fight();
		}
		System.out.println("=====================Mudando as Armas===========================");
		for(Character e : Personagens) {
			int i = Chance.nextInt(4)+1;
			if(i == 1) e.setWeapon(new AxeBehavior());
			else if (i == 2)e.setWeapon(new BowAndArrowBehavior());
			else if (i == 3)e.setWeapon(new KnifeBehavior());
			else e.setWeapon(new SwordBehavior());
		}
		System.out.println("=====================Atacando com as Armas Novas===========================");
		for(Character e : Personagens) {
			e.fight();
		}
		
	}

}
