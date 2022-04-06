public class Mundial {
    private Fecha fechaInicio;

    public Mundial(Fecha inicioMundial)
    {
        this.fechaInicio = inicioMundial;
    }

    public String getFechaInicioMundial()
    {
        return fechaInicio.getFecha();
    }
}
