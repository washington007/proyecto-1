public class Principal {

    public static void main(String[] args)
    {
        // se crea una instancia 
        Singleton c = Singleton.getDeclarar();
        c.conectar();
        c.desconectar();
        
        boolean res = c instanceof Singleton;
        System.out.println(res);
    }
}
