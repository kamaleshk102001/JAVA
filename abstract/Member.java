

public abstract class Member{
    private String name;
    public abstract void welcomeMessage();         // a method without defenition or defenition in it's derived class
    public String getName(){
        return name;                        //it's just to define that we can give concrete methods in abstract class
    }
}