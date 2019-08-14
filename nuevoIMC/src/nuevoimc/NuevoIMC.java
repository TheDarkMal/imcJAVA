
package nuevoimc;

public class NuevoIMC {
    public NuevoIMC(){
    
    
    }
    
    public double resultadoimc(double peso, double estatura){
        double resultado = peso/Math.pow(estatura, 2);
        return resultado;
    }
    
    public String obsIMC(double imc){
    String diagnostico="";
    if(imc <15){
        diagnostico="delgadez muy severa";
    }else if (imc >=15 &&  imc <=15.9 ){
        diagnostico="delgadex severa";
    }else if(imc >16 && imc <=18.4){
        diagnostico="delgadez";
    }else if (imc >=18.5 && imc <=24.9){
        diagnostico="peso saludable";
    }else if(imc >=25 && imc<=29.9){
        diagnostico="sobrepeso";
    }else if (imc>=30 && imc <=34.9){
        diagnostico="obesidad severa";
    }else if(imc>=35){
    diagnostico="obesidad morvida";
    }
    return diagnostico;
    }
    
    

}
