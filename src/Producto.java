import java.io.*;

public class Producto implements Serializable {
    String nome;
    int num1;
    double num2;


    public static void main(String[] args) {
        Producto producto = new Producto();

        producto.nome = "Alan";
        producto.num1 = 67;
        producto.num2 = 69;

        try {
            FileOutputStream fichero = new FileOutputStream("/home/dam26/serial.txt");
            ObjectOutputStream objetos = new ObjectOutputStream(fichero);

            objetos.writeObject(producto);
            objetos.flush();
            System.out.println("Operación completada con ẃxito");
        }
        catch (IOException e) {
            System.out.println("Error al escribir el fichero" + e.getMessage());
        }

        try {
            FileInputStream fichero = new FileInputStream("/home/dam26/serial.txt");
            ObjectInputStream objetos = new ObjectInputStream(fichero);

            Producto producto1 = (Producto) objetos.readObject();
            System.out.println(producto1.nome + " " + producto1.num1 + " " + producto1.num2);

        }
        catch (IOException | ClassNotFoundException e) {
            System.out.println("Error al escribir el fichero" + e.getMessage());
        }
    }
}