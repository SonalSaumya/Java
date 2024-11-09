package day1;



public class Accounts {
    
    private int accid;
    private String name;
    private static float intrate;

    static 
    {
        System.out.println("static block 1");
        intrate = 6.5f;

    }

    static 
    {
        System.out.println("Static block 2");
    }


    public Accounts()
    {
        accid = 1000;
        name = "Siddhi";

    }

    public Accounts (int accid,String name)
    {
        this.accid = accid;
        this.name = name;
    }
}
