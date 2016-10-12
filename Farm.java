class Farm 
{     
   private Animal[] someAnimals = new Animal[3];
   public Farm()	{
   	someAnimals[0] = new Cow("cow","moo");
   	someAnimals[1] = new Chick("chick", "chirp");
   	someAnimals[2] = new Pig("pig","snort");	}
   	public void animalSounds()	{
   		for (int nI = 0; nI < someAnimals.length; nI++)	{
   			System.out.println(someAnimals[nI].getType() + " goes " + someAnimals[nI].getSound());
   		}
   	}
}
