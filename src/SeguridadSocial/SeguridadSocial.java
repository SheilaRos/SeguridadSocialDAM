package SeguridadSocial;
import java.util.ArrayList;
import java.util.List;

public class SeguridadSocial{
    private List<Persona> personasList;
    public SeguridadSocial() {
        personasList = new ArrayList<>();
    }

    // Debes comprobar que no se introduzcan dos personas con el mismo DNI/Número Seguridad Social
    public void altaPersona(Persona persona) {
        boolean existe=false;
        for (int i=0; i<personasList.size();i++){
            if(personasList.get(i).getDNI().equals(persona.getDNI()) || personasList.get(i).getNumSeguridadSocial().equals(persona.getNumSeguridadSocial())){
                existe=true;
            }
        }
        if(existe==false){
            personasList.add(persona);
        }
    }

    public void bajaPersona(String dni) {
        personasList.removeIf(persona -> persona.getDNI().equals(dni));
    }

    public Persona obtenerPersonaPorDNI(String dni) {
        int posicion=0;
        for (int i=0; i<personasList.size();i++){
            if(personasList.get(i).getDNI().equals(dni)){
                posicion=i;
                break;
            }
        }
        return personasList.get(posicion);
    }

    public Persona obtenerPersonaPorNumSS(String numSS) {
        int posicion=0;
        for (int i=0; i<personasList.size();i++){
            if(personasList.get(i).getNumSeguridadSocial().equals(numSS)){
                posicion=i;
                break;
            }
        }
        return personasList.get(posicion);
    }

    public List<Persona> obtenerPersonasRangoSalarial(double min, double max){
        List<Persona> listapersonas = new ArrayList<>();
        for (int i=0; i<personasList.size(); i++){
            if(personasList.get(i).getSalario()>=min && personasList.get(i).getSalario()<=max){
                listapersonas.add(personasList.get(i));
            }
        }
        return listapersonas;
    }

    public List<Persona> obtenerPersonasMayoresQue(int edad){
        List<Persona> listapersonas = new ArrayList<>();
        for (int i=0; i<personasList.size(); i++){
            if(personasList.get(i).getEdad()>edad){
                listapersonas.add(personasList.get(i));
            }
        }
        return listapersonas;
    }

    public List<Persona> obtenerTodas(){
        return personasList;
    }

    @Override
    public String toString() {
        return "SeguridadSocial{" +
                "personasList=" + personasList +
                '}';
    }
}