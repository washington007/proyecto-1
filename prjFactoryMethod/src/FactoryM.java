public class FactoryM {
    private static FactoryM declarar;
    
    private FactoryM()
    {
        
    }
    public static FactoryM getDeclarar()
    {
        if(declarar == null)
        {
            declarar = new FactoryM();
        }
        return declarar;
    }
    
    //se crea dos metodos  
    public void conectar()
    {
        System.out.println("conectado a la BD");
    }
    
    public void desconectar()
    {
        System.out.println("desconectado a la BD");
    }
}
