package Exception;

public class SaqueNaoPermitidoException extends Exception {

    /**
     * -
     */
    public static final String MSG = "Saque não permitido. Tente Novamente.";

    public SaqueNaoPermitidoException() {

        super(MSG);
    }

}
