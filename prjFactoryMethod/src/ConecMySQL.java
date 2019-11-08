
public class ConecMySQL implements iCone{
    private String host;
    private String puerto;
    private String usuario;
    private String contraseña;
    
    public ConecMySQL()
    {
        this.host = "localhost";
        this.puerto = "3306";
        this.usuario = "root";
        this.contraseña = "123";
    }
    
    @Override
    public void conectar()
    {
        System.out.println("se conecto correctamente a MySQL");
    }

    @Override
    public void deesconectar() {
        System.out.println("se desconecto correctamente a MySQL");
    }
}
