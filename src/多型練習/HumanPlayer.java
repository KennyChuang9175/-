package 多型練習;
import java.util.Scanner;
public class HumanPlayer extends Player {
	Scanner scn=new Scanner(System.in);
	@Override
	protected String nameSelf() {
		Scanner sc=new Scanner(System.in);
		System.out.println("輸入姓名: ");
		String name=sc.next();
		return name;
	}

	@Override
	protected String getPlayerType() {
		return "玩家";
	}

	@Override
	protected int guess(int min, int max) {
		int answer=scn.nextInt();
		while(answer<min || answer>max) {
			System.out.println("請輸入範圍內的數字");
			answer=scn.nextInt();
		}
		
		return answer;
	}

}
