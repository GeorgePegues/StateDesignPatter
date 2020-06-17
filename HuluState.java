package StateDesign;
public class HuluState implements State {
	private TV tv;
	
	/**
	 * Initializing the interface to implement super methods
	 * @param tv
	 */
	public HuluState(TV tv) 
	{
		this.tv = tv;
	}
	
	/**
	 * Each function below performs actions specific to its associated state (class)
	 */
	@Override
	public void pressHomeButton() 
	{
		System.out.println("Loading the Home screen...\n");
	}

	@Override
	public void pressNetflixButton() 
	{
		System.out.println("Loading Netlfix...\n");
		tv.setState(tv.getNetflixState());
	}

	@Override
	public void pressHuluButton() 
	{
		System.out.println("We are already in Hulu\n");		
	}

	@Override
	public void pressMovieButton() {
		String[] films = {"Hulu Movies:", "Batman The Dark Knight Rises", "Zombieland", "Love Rosie", "The Notebook", "Madea\n"};
		for(String i : films)
		{
			System.out.println(i);
		}
	}

	@Override
	public void pressTVButton() {
		// TODO Auto-generated method stub
		String[] shows = {"Hulu Shows:", "Power", "Riverdale", "American Horror Story", "Black Mirror", "Criminal Minds\n"};
		for(String i : shows)
		{
			System.out.println(i);
		}
	}
}
