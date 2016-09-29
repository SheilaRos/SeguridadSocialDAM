package SeguridadSocial;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SeguridadSocial{

    private Map <String, Persona> personaMapDNI= new HashMap();
    private Map <String, Persona> personaMapSS= new HashMap();
   /* El constructor no es necesario
   public SeguridadSocial() {
        personaMapDNI= new HashMap();
        personaMapSS= new HashMap();
    }*/

    // Debes comprobar que no se introduzcan dos personas con el mismo DNI/Número Seguridad Social
    public void altaPersona(Persona persona) {
       if(!personaMapDNI.containsKey(persona.getDNI()) && !personaMapSS.containsKey(persona.getNumSeguridadSocial())){
            personaMapDNI.put(persona.getDNI(), persona);
            personaMapSS.put(persona.getNumSeguridadSocial(), persona);
       }
    }
    public void bajaPersona(String dni) {
        personaMapSS.remove(personaMapDNI.get(dni).getNumSeguridadSocial());
        personaMapDNI.remove(dni);
    }
    public Persona obtenerPersonaPorDNI(String dni) {
        return personaMapDNI.get(dni);
    }
    public Persona obtenerPersonaPorNumSS(String numSS) {
        return personaMapSS.get(numSS);
    }
    public List<Persona> obtenerPersonasRangoSalarial(double min, double max){
        //Java 8:
       return personaMapSS.values().stream().filter(persona -> persona.getSalario()>=min && persona.getSalario()<=max).collect(Collectors.toList());
       /*Manera tradicional:
         List<Persona> aux=new ArrayList<>();
            for(Persona persona:personaMapDNI.values()){
                if(persona.getSalario()>=min && persona.getSalario()<=max){
                    aux.add(persona);
                }
            }
            return aux;
       */
    }
    public List<Persona> obtenerPersonasMayoresQue(int edad){
        return personaMapDNI.values().stream().filter(persona -> persona.getEdad()>edad).collect(Collectors.toList());
    }
    public List<Persona> obtenerTodas(){
        return new ArrayList<>(personaMapDNI.values());
    }
}