package clase_02.extra;

public class ConversionDeTipoDeDato {
    public static void main(String[] args) {

        char caracterPrimitivo         = 'A'; // Código ANSI 65 = A
        int numeroEnteroPrimitivo      = 125;
        float numeroDecimalPrimitivo1  = 175.50f;
        double numeroDecimalPrimitivo2 = 255.75;

        Character caracterObjeto    = '5';
        Integer numeroEnteroObjeto  = 125;
        Float numeroDecimalObjeto1  = 175.50f;
        Double numeroDecimalObjeto2 = 255.75;

        String numeroEnteroStringObjeto  = "50";
        String numeroDecimalStringObjeto = "750.25";
        String letraStringObjeto         = "Hola Mundo";


        // Conversiones entre primitivos: Se logra por medio de un casting
        int primitivoFloatToPrimitivoInt     = (int) numeroDecimalPrimitivo1;
        int primitivoDoubleToPrimitivoInt    = (int) numeroDecimalPrimitivo1;
        float primitivoIntToPrimitivoFloat   = (float) numeroEnteroPrimitivo;
        double primitivoIntToPrimitivoDouble = (double) numeroEnteroPrimitivo;

        // Conversiones de objetos a primitivos:
        int objetoFloatToPrimitivoInt         = numeroDecimalObjeto1.intValue();
        int objetoDoubleToPrimitivoInt        = numeroDecimalObjeto2.intValue();
        float objetoIntegerToPrimitivoFloat   = numeroEnteroObjeto.floatValue();
        double objetoIntegerToPrimitivoDouble = numeroEnteroObjeto.doubleValue();

        // Conversiones de objetos a objetos:
        Integer objetoFloatToObjetoInt       = numeroDecimalObjeto1.intValue();
        Integer objetoDoubleToObjetoInt      = numeroDecimalObjeto2.intValue();
        Float objetoIntegerToObjetoFloat     = numeroEnteroObjeto.floatValue();
        Double objetoIntegerToObjetoDouble   = numeroEnteroObjeto.doubleValue();
        String objetoCharacterToObjetoString = caracterObjeto.toString();

        Integer objetoStringToObjetoInt   = Integer.parseInt(numeroEnteroStringObjeto);
        Float objetoStringToObjetoFloat   = Float.parseFloat(numeroDecimalStringObjeto);
        Double objetoStringToObjetoDouble = Double.parseDouble(numeroDecimalStringObjeto);

        char[] objetoStringToPrimitivoCharArray = letraStringObjeto.toCharArray();
    }
}