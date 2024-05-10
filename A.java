class A{
    float a;
    int b;

    void show()
    {
        a=27;
        b=28;
    }

    A(A ref)
    {
        a=ref.a;
        b=ref.b;

        system.out.println("a");
        system.out.println("b");
    }


}
class B{
    public static void main(string[] args){
    A r=new A();
    A r2=new A(r);
}
}
