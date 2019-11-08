
import com.sun.org.apache.bcel.internal.generic.RETURN;


public class ConexionF {
    //se coloc una interfaz para acceder a todas las clases
    //devuelve una interrfaz de conexion
    public iCone getCone(String motor)
    {
        if(motor==null)
        {
            return new coneVacia();
        }
        if(motor.equalsIgnoreCase("MYSQL")){
        return new ConecMySQL();
        }else if (motor.equalsIgnoreCase("ORALE"))
        {
            return new ConecOracle();
        }else if (motor.equalsIgnoreCase("POSTGRE"))
        {
            return new ConecPostgre();
        }else if (motor.equalsIgnoreCase("SERVER"))
        {
            return new ConecSQLserver();
        }
        return new coneVacia();
    }
}
