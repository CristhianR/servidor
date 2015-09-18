
package sockets.main;

// Se importan los paquetes a utilizar.
import java.io.IOException;
import sockets.servidor.Servidor;


/**
 * Se declara la Clase principal que hará uso del servidor.
 * @author cristhian
 * @version 17/09/15
 */
public class MainServidor
{
    public static void main(String[] args) throws IOException
    {   
        //Se crea el servidor
        Servidor serv = new Servidor(); 
        
        //Se inicia el servidor
        System.out.println("Iniciando servidor\n");
        serv.startServer(); 
    }
}
