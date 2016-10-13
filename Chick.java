class Chick implements Animal 
{     
     private String myType;
     private String mySound;
     private float prob;
     public Chick(String type, String sound1, String sound2)
     {
     	myType = type;
          prob = (float)Math.random();
     	if (prob < .5)
          {
               mySound = sound1;
          }
          if (prob > .5)
          {
               mySound = sound2;
          }
     }
     public Chick()
     {
     	myType = "unknown";
     	mySound = "unknown";
     }
     public String getSound()
     {
          return mySound;
     }
     public String getType()
     {
     	return myType;
     }
}
