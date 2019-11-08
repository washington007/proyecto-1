
public class coneVacia implements iCone{
        //se crea dos metodos  
    @Override
    public void conectar() {
        System.out.println("conetados");
    }
    
    @Override
    public void deesconectar() {
        System.out.println("desconestado");
    }
}

