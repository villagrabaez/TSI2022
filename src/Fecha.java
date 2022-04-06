public class Fecha {
    private int dia;
    private int mes;
    private int anio;

    public Fecha(int dia, int mes, int anio)
    {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }

    // 14/11/2022
    public String getFecha()
    {
        return this.dia + "/" + this.mes + "/" + this.anio;
    }
}
