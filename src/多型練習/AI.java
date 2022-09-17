package ‘½Œ^—ûK;

public abstract class AI extends Player{
	private static int amount = 0;
	
	public AI() {
		amount++;
	}

	@Override
	protected String nameSelf() {
		// TODO Auto-generated method stub
		return "AI"+ String.valueOf(amount);
	}
}
