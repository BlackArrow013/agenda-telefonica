import java.util.HashMap;
/**
 * Write a description of class AgendaTelefonica here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AgendaTelefonica
{
    // instance variables - replace the example below with your own
    private HashMap<String, String> agenda;

    /**
     * Constructor for objects of class AgendaTelefonica
     */
    public AgendaTelefonica()
    {
        // initialise instance variables
        agenda = new HashMap<>();
    }

    /**
     * Permite introducir a personas con su número de teléfono.
     */
    public void enterNumber(String name, String number) {
        agenda.put(name, number);
    }
    
    /**
     * Permite buscar el número de teléfono de una persona.
     */
    public void lookUpNumber(String name) {
        System.out.println(agenda.get(name));
    }
}
