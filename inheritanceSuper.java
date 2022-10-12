class productA
{
    productA()
    {
        System.out.println("A's Default Constructer");
    }
    productA(int no)
    {
        System.out.println("A's Parametric Constructer "+no);
    }
}
class productB extends productA
{
    productB()
    {
        System.out.println("B's Default Constructer");
    }
    productB(int no)
    {
        super(50);
        System.out.println("B's Parametric Constructer "+no);
    }
}
class productC extends productB
{
    productC()
    {
        System.out.println("C's Default Constructer");
    }
    productC(int no)
    {
        super(100);
        System.out.println("C's Parametric Constructer "+no);
    }
}
class inheritanceSuper
{
    public static void main(String args[])
    {
        //productC proC=new productC();
        productC proC=new productC(150);

    }
}