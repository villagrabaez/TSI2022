public class Calculadora {
    private String marca;
    private int num1, num2;

    public Calculadora(int num1, int num2)
    {
        this.num1 = num1;
        this.num2 = num2;
    }

    public int getSuma()
    {
        return this.num1 + this.num2;
    }

    public int getResta()
    {
        return this.num1 - this.num2;
    }
}
