package hello;



public class Greeter {



  private String name = "";



  public String getName() 

  {

    return name;

  }



  public void setName(String name) 

  {

      this.name = name;

  }



  public String sayHello() 

  {

  	if (name.equals("")) 

    {

       return "Hello!";

    }

    else 

    {

       return "Hello " + name + "!";

    }

  }
  
  public String duplicate(){
    if (name.equals("")) 

    {

       return "Hello!";

    }

    else 

    {

       return "Hello " + name + "!";

    }
  }

}
