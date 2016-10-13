class Farm 
{     
   private Animal[] someAnimals = new Animal[3];
   public Farm()	{
   	someAnimals[0] = new NamedCow("cow", "Elsie", "moo");
   	someAnimals[1] = new Chick("chick", "cheep", "chirp");
   	someAnimals[2] = new Pig("pig","snort");	}
   	public void animalSounds()	{
   		for (int nI = 0; nI < someAnimals.length; nI++)	{
   			System.out.println(someAnimals[nI].getType() + " goes " + someAnimals[nI].getSound());
   		}
   		System.out.println("The cow is known as " + ((NamedCow)someAnimals[0]).getName() );
   	}
}
