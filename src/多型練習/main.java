package ���^���K;

import java.awt.List;
import java.util.Collections;
import java.util.Scanner;
import java.util.ArrayList;

public class main {

	public static void main(String[] args) {
		gamesystem game=new gamesystem();
		ArrayList<Player> players =creatPlayers();
		
		System.out.println("������:  ");
		for(Player p : players) {
			System.out.print(p.getName());
		}
		System.out.println();
		
		game.creatAnswer();
		
		int turn=0;
		
		do 
		{
			Player player = players.get(turn);
			System.out.println(game.getMin()+" ~ "+ game.getMax() );
			int guess = player.guess(game.getMin(), game.getMax());
			System.out.println(player.getName()+"�ȗ�"+guess);
			boolean win =game.guess(guess);
			if(win)
				System.out.print(player.getName()+"�ț���");
			turn=turn+1 >=players.size() ?0 :turn+1;
		}while(!game.isOver());

	}
	
	private static ArrayList<Player> creatPlayers() {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		ArrayList<Player> players =new ArrayList<Player>();
		System.out.print("�A���L��ʌ����߉�");
		int human = sc.nextInt();
		System.out.print("�A���L��ʊ��AI�߉�");
		int ODDAI = sc.nextInt();
		System.out.print("�A���L��ʋ���AI�߉�");
		int EVENAI = sc.nextInt();
		
		for(int i=0;i<human;i++)
			players.add(new HumanPlayer());
		for(int i=0;i<ODDAI;i++)
			players.add(new OddAI());
		for(int i=0;i<EVENAI;i++)
			players.add(new EvenAI());
		
		Collections.shuffle(players);
		
		return players;
		
	}

	

	
}
