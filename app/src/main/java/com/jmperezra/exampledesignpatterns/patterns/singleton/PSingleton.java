package com.jmperezra.exampledesignpatterns.patterns.singleton;

/**
 * Class PSingleton
 *
 * Clase ejemplo que implementa un patrón singleton.
 *
 * @author jmperezramos.net
 */
public class PSingleton {

    //Variable que contendrá la única instancia de la clase.
    private static PSingleton pSingleton = new PSingleton();


    /**
     * Se declara el contructor privado para evitar que se instancien más objetos de la clase.
     */
    private PSingleton(){ }

    /**
     * Método estático que servirá para obtener la instancia de la clase.
     * Si no ha sido creada, se crea y se devuelve. Si ya ha sido creada, se devuelve.
     *
     * @return PSingleton
     */
    public static PSingleton getInstance(){
        if (pSingleton == null)
            createInstance();
        return pSingleton;
    }


    /**
     * Método que crea la instancia del objeto. Sólo se accede al código sincronizado si la instancia
     * aún no ha sido creada.
     */
    private static void createInstance() {
        if (pSingleton == null) {
            synchronized(PSingleton.class) {
                if (pSingleton == null) {
                    pSingleton = new PSingleton();
                }
            }
        }
    }


    /**
     * Evitamos también que el objeto pueda ser clonado. Si se intenta, lanzamos una excepción.
     *
     * @return
     * @throws CloneNotSupportedException
     */
    public Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }
}
