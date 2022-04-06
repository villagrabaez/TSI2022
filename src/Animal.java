public class Animal {
    // Propiedades / atributos
    public int edad;
    public float peso;
    // Metodos
    public void setEdad( int edad )
    {
        this.edad = edad;
    }
    public int getEdad()
    {
        return this.edad;
    }
    public void setPeso(float peso)
    {
        this.peso = peso;
    }
    public float getPeso()
    {
        return this.peso;
    }
    public void dormir()
    {
        System.out.println("El animal duerme.");
    }
    public void comer()
    {
        System.out.println("El animal come.");
    }
}
