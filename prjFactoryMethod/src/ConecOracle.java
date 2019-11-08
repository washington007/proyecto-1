
public class ConecOracle implements iCone{
    private String host;
    private String puerto;
    private String usuario;
    private String contraseña;
    
    public ConecOracle()
    {
        this.host = "localhost";
        this.puerto = "1521";
        this.usuario = "admin";
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
