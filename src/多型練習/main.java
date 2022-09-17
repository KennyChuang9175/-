package ‘½Œ^—ûK;

import java.awt.List;
import java.util.Collections;
import java.util.Scanner;
import java.util.ArrayList;

public class main {

	public static void main(String[] args) {
		gamesystem game=new gamesystem();
		ArrayList<Player> players =creatPlayers();
		
		System.out.println("‡˜ˆ×:  ");
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
			System.out.println(player.getName()+"àÈ—¹"+guess);
			boolean win =game.guess(guess);
			if(win)
				System.out.print(player.getName()+"àÈ›”—¹");
			turn=turn+1 >=players.size() ?0 :turn+1;
		}while(!game.isOver());

	}
	
	private static ArrayList<Player> creatPlayers() {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		ArrayList<Player> players =new ArrayList<Player>();
		System.out.print("—A“ü—LŠôˆÊŒ»›‰Šß‰Æ");
		int human = sc.nextInt();
		System.out.print("—A“ü—LŠôˆÊŠïÉAIŠß‰Æ");
		int ODDAI = sc.nextInt();
		System.out.print("—A“ü—LŠôˆÊ‹ôÉAIŠß‰Æ");
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
