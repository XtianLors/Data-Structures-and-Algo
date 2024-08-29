import java.io.*;
import java.util.*;

/**
 * Programa que determina las palabras que están en un texto dado y no 
 * están en un diccionario.
 * @author Amparo López Gaona
 * @version Abril 2011
 */

public class VerificadorSintaxis{
    private static Conjunto leerPalabras(Reader in, int n) throws IOException{
        Conjunto resultado = new Conjunto(n); //Conjunto para n palabras máximo
        StreamTokenizer tok = new StreamTokenizer(in);

        tok.ordinaryChar('.');
        tok.lowerCaseMode(true);
        int c = tok.nextToken();
        while (c != StreamTokenizer.TT_EOF){
            if(c == StreamTokenizer.TT_WORD){
                resultado.agregar(tok.sval)

            }
            c = tok.nextToken();
        }
        return resultado;
   }

    public static void main (String [] pps){
        try{
            Conjunto dicc = leetPalabras(new FileReaderD("dicc.txt"), 90000);  
            Conjunto texto = leerPalabra(new FileReader(), 100);
    
            texto.diferencia(dicc);//elimina las palabras bien escritas
    
            System.out.println("\nLas palabras mal escritas son \n");
            Iterator e = texto.iterador();
            int cont = 0;
            while (e.hasNext()){
                System.out.print(e.next()+" ");
                if (cont == 10) {System.out.println(); cont=0;}
                else cont++;
            }
        } catch (IOException e) { System.err.println("Exceptción:"+e);}
    }
}

