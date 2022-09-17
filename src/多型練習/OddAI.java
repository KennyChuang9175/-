package ‘½Œ^—ûK;

import java.util.Random;

public class OddAI extends AI{

	@Override
	protected String getPlayerType() {
		// TODO Auto-generated method stub
		return "ŠïÉAI";
	}

	@Override
	protected int guess(int min, int max) {
		int rand;
		if(max == min)
			return max;
		do 
		{
			rand=new Random().nextInt(max-min)+min;
		}while(rand%2!=1 || rand<min || rand >max);
		return rand;
	}

}
