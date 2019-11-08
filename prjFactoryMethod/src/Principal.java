public class Principal {
 
    public static void main(String[] args) {
        ConexionF fac = new ConexionF();
        
        iCone cx1=fac.getCone("ORACLE");
        cx1.conectar();
        cx1.deesconectar();
        
        iCone cx2=fac.getCone("MYSQL");
        cx1.conectar();
        cx1.deesconectar();
        
        /*
        iCone cx3=fac.getCone("H2");
        cx1.conectar();
        cx1.deesconectar();
        */
    
    }
}
