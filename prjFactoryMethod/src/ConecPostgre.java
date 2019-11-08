
public class ConecPostgre implements iCone{
    private String host;
    private String puerto;
    private String usuario;
    private String contraseña;
    
    public ConecPostgre()
    {
        this.host = "localhost";
        this.puerto = "5543";
        this.usuario = "server";
        this.contraseña = "123";
    }
    
    @Override
    public void conectar()
    {
        System.out.println("se conecto correctamente a ORACLE");
    }

    @Override
    public void deesconectar() {
        System.out.println("se desconecto correctamente a ORACLE");
    }
}
