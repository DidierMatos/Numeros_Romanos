package numerosromanos;
import javax.swing.JOptionPane;

/**
 *
 * @author didier
 */
public class NumerosRomanos {

    static String valor;
    
    static final String INSTRUCCIONES = "Escriba un número entero en un rango de 1 a 1000";
    static final String ERRORNUM = "Este no es un número válido, porfavor ingresa uno correcto";
    static final String ERRORGRAL = "Ha ocurrido un error, comunicate con el desarrollador y toma en cuenta el rango a ingresar";
    
    public static int millares = 0, centenas = 0, decenas = 0, unidades = 0;
    public static String[][] romanos = {{"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"},
    {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXX", "XC"},
    {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"},
    {"", "M"}};

    

    public static void main(String[] args) {
        
        valor = JOptionPane.showInputDialog(INSTRUCCIONES);
       
        NumerosRomanos.fConvertir(valor);
    }

    private static void fConvertir(String numero) {
        try {
            NumerosRomanos.fUnidades(Integer.valueOf(numero));
            //System.out.println(NumerosRomanos.obtenerRomano());
            JOptionPane.showMessageDialog(null,"El número convertido a romano es: " + NumerosRomanos.fNumRomano());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null,ERRORNUM);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,ERRORGRAL);
        }

    }

    public static void fUnidades(int numero) {
        millares = (int) numero / 1000;
        centenas = (int) numero % 1000 / 100;
        decenas = (int) numero % 1000 % 100 / 10;
        unidades = (int) numero % 1000 % 100 % 10;
    }

    public static String fNumRomano() {
        return romanos[3][millares] + ""
                + romanos[2][centenas] + ""
                + romanos[1][decenas] + ""
                + romanos[0][unidades] + "";
    }

}
    

