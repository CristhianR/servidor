
package sockets.conexion;

// Se importan los paquetes a utilizar.
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *Se declara la clase conexión.
 * @author cristhian
 * @version 17/09/15
 */
public class Conexion
{
    // Se declaran los atributos de la clase
    
    //Puerto para la conexión
    private final int PUERTO = 8080;
    //Host para la conexión
    private final String HOST = "localhost"; 
    //Mensajes entrantes (recibidos) en el servidor
    protected String mensajeServidor; 
    //Socket del servidor
    protected ServerSocket ss; 
    //Socket del cliente
    protected Socket cs; 
    //Flujo de datos de salida
    protected DataOutputStream salidaServidor, salidaCliente; 
    
    
    /**
     * Se crea el constructor de la clase.
     * @param tipo
     * @throws IOException 
     */
    public Conexion(String tipo) throws IOException 
    {
        if(tipo.equalsIgnoreCase("servidor"))
        {
            //Se crea el socket para el servidor en puerto 8080
            ss = new ServerSocket(PUERTO);
            //Socket para el cliente
            cs = new Socket(); 
        }
        else
        {
            //Socket para el cliente en localhost en puerto 8080
            cs = new Socket(HOST, PUERTO); 
        }
    }
}

