package StateDesign;
public class NetflixState implements State {
	private TV tv;
	
	/**
	 * Initializing the interface to implement super methods
	 * @param tv
	 */
	public NetflixState(TV tv) 
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
		System.out.println("We are already in Netflix\n");		
	}

	@Override
	public void pressHuluButton() 
	{
		System.out.println("Loading Hulu...\n");		
		tv.setState(tv.getHuluState());
	}

	@Override
	public void pressMovieButton()
	{	
		String[] films = {"Netflix Movies:", "Forest Gump", "Justice League", "Bad Boys", "Spider-Man", "007\n"};
		for(String i : films)
		{
			System.out.println(i);
		}
	}

	@Override
	public void pressTVButton()
	{
		// TODO Auto-generated method stub
		String[] shows = {"Netflix Shows:", "The Flash", "Dragon Ball Z", "Boy meets World", "Seinfeld", "That 70's Show\n"};
		for(String i : shows)
		{
			System.out.println(i);
		}
	}
}
