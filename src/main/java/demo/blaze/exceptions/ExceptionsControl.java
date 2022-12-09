package demo.blaze.exceptions;

public class ExceptionsControl extends AssertionError{
    public static final String userNameFail = "El nombre del usuario presentado en el home no es esperado";
    public static final String compenenteFail = "El nombre del componente presentado en el carrito no es el esperado";

    public ExceptionsControl(String message, Throwable cause){
        super(message, cause);
    }
}
