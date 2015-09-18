
package sockets.servidor;

// Se importan los paquetes a utilizar.
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import sockets.conexion.Conexion;

/**
 * Se Declara la clase Servidor la cual hereda de conexión para hacer uso de los sockets y demás.
 * @author cristhian
 * @version 17/09/15
 */
public class Servidor extends Conexion 
{
    /**
     * Se usa el constructor para servidor de Conexion
     * @throws IOException 
     */
    public Servidor() throws IOException{super("servidor");} 
    
    //Método para iniciar el servidor
    public void startServer()
    {
        try
        {
            //Esperando conexión
            System.out.println("Esperando..."); 
            
            //Accept comienza el socket y espera una conexión desde un cliente
            cs = ss.accept(); 

            System.out.println("Cliente en línea");

            //Se obtiene el flujo de salida del cliente para enviarle mensajes
            salidaCliente = new DataOutputStream(cs.getOutputStream());

            //Se le envía un mensaje al cliente usando su flujo de salida
            salidaCliente.writeUTF("Petición recibida y aceptada");
            
            //Se obtiene el flujo entrante desde el cliente
            BufferedReader entrada = new BufferedReader(new InputStreamReader(cs.getInputStream()));
            
            //Mientras haya mensajes desde el cliente
            while((mensajeServidor = entrada.readLine()) != null) 
            {
                //Se muestra por pantalla el mensaje recibido
                System.out.println(mensajeServidor);
            }
            
            System.out.println("Fin de la conexión");
            
            ss.close();//Se finaliza la conexión con el cliente
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}
