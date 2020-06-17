package StateDesign;
public class HomeState implements State {
	private TV tv;
	/**
	 * Initializing the interface to implement super methods
	 * @param tv
	 */
	public HomeState(TV tv) 
	{
		this.tv = tv;
	}
	
	/**
	 * Each function below performs actions specific to its associated state (class)
	 */
	@Override
	public void pressHomeButton() 
	{
		System.out.println("TV is already on the home screen\n");
		
	}
	
	@Override
	public void pressNetflixButton() 
	{
		System.out.println("Loading Netflix...\n");		
		tv.setState(tv.getNetflixState());
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
		System.out.println("Home: You must pick an app to show movies.\n");
	}
	
	@Override
	public void pressTVButton() 
	{
		System.out.println("Home: You must pick an app to show TV shows.\n");
	}

}
