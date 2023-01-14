package designpatterns;

/**
 * Singleton Example
 */
public class Singleton {

    private static Singleton instance;
    public String value;
    public static final int oneSecond = 1000;

    /**
     * Creates a Singleton Instance of itself
     *
     * @param instanceValue A generic string
     * @return Singleton
     * @see Singleton
     */
    public static Singleton getInstance(String instanceValue) {
        if (instance == null) {
            instance = new Singleton(instanceValue);
        }
        return instance;
    }

    private Singleton(String instanceValue) {
        try {
            Thread.sleep(oneSecond);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        this.value = instanceValue;
    }
}