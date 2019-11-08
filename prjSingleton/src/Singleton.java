
public class Singleton {
    //primero se procede a declarar
    private static Singleton declarar; //se tiene en metodo estatico por que se va acceder a sus metodos estaticos
    
    private Singleton()//se procede a crear un constructor privado 
    {
        
    }
    //se hace uso de la palabra reservada static para que pueda ser accedido 
    public static Singleton getDeclarar()
    {
        if(declarar==null)
        {
            declarar=new Singleton();
            
        }
        return declarar;
    }
    
    //se procede a colocar un metodos para autentificar su resultado
    public void conectar()
    {
        System.out.println("conectado a la BD");
    }

    public void desconectar()
    {
        System.out.println("desconectado a la BD");
    }

    
    
}
