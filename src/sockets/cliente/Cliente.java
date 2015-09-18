
package sockets.cliente;

// Se importan los paquetes a utilizar
import java.io.DataOutputStream;
import java.io.IOException;
import sockets.conexion.Conexion;

/**
 * Se declara la clase Cliente.
 * @author cristhian
 * @version 17/09/15
 */
public class Cliente extends Conexion
{
    /**
     * Se usa el constructor para cliente de Conexion
     * @throws IOException 
     */
    public Cliente() throws IOException{super("cliente");} 
    
     //Método para iniciar el cliente
    public void startClient()
    {
        try
        {            
            //Flujo de datos hacia el servidor
            salidaServidor = new DataOutputStream(cs.getOutputStream());

            //Se enviarán dos mensajes
            for (int i = 0; i < 2; i++)
            {
                //Se escribe en el servidor usando su flujo de datos
                salidaServidor.writeUTF("Este es el mensaje número " + (i+1) + "\n");                
            }           

            cs.close();//Fin de la conexión

        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}
