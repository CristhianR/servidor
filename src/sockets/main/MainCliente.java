
package sockets.main;

// Se importan los paquetes a utilizar.
import java.io.IOException;
import sockets.cliente.Cliente;


/**
 * Se declara la Clase principal que hará uso del cliente.
 * @author cristhian
 * @version 17/09/15
 */
public class MainCliente
{
    public static void main(String[] args) throws IOException
    {  
        //Se crea el cliente
        Cliente cli = new Cliente(); 
        
        System.out.println("Iniciando cliente\n");
        //Se inicia el cliente
        cli.startClient(); 
    }
}