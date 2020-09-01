package clases;

/**
 *
 * @author Jesus Paredes
 */
public class Rut {
    //Atributos
    private int numero;
    private char dVerificador;
    
    /**
     * Constructor por defecto
    */
    public Rut(){
        this.numero=0;
        dVerificador='0';
    }
    
    public Rut(int r){
        numero= r;
        this.dVerificador= calcularDV();
    }
      
    //dddddddd-c
    public Rut(String r){
        String []datos;
        datos= r.split("-");  //error  si datos.length==0
        if (datos.length==0){
            //Error
            numero=0;
            this.dVerificador='0';
        }
        else{
            try{
                numero=Integer.parseInt(datos[0]);
                this.dVerificador= Character.toUpperCase(datos[1].charAt(0));
            }
            catch (NumberFormatException e){
                numero=0;
                this.dVerificador='0';
            }
        }
        
        if (!esValido()){
            numero=0;
            this.dVerificador='0';
        }      
    }
    
    
    public Rut(Rut r){
        this.numero=r.numero;
        this.dVerificador= r.dVerificador;
    }
    
    public boolean esValido(){
        return (numero != 0) && (this.dVerificador== calcularDV());
    }
    
    public char calcularDV(){
        int num= numero; 
        int factor= 2;
        int suma=0;
        int digito;
        
        while (num>0){
            digito= num % 10;
            suma= suma + digito*factor;
            factor++;
            if (factor >7){
                factor=2;
            }
            num = num / 10;
        }
        int dv= 11 - suma % 11;
        
        char cDV;
        
        switch (dv){
            case 11: 
                cDV='0';
                break;
            case 10:
                cDV='K';
                break;
            default:    
                cDV= (char) (48 + dv);
        }
        return cDV;
    }
    
    public String toString(){
        return numero+"-"+dVerificador;
    }
}