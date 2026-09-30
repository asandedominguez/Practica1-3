import javax.xml.stream.*;
import java.io.FileOutputStream;
import java.io.IOException;

public class ObjetoXML {
    public static void main(String[] args) {
        ObjetoXML xml = new ObjetoXML();
        try {
            XMLOutputFactory documento = XMLOutputFactory.newInstance();
            XMLStreamWriter escritura = documento.createXMLStreamWriter(new FileOutputStream("autores.xml"), "UTF-8");

            escritura.writeStartDocument("1.0");
            escritura.writeStartElement("autores");
            escritura.writeStartElement("autor");
            escritura.writeAttribute("codigo", "a1");

            escritura.writeStartElement("nome");
            escritura.writeCharacters("Alexandre Dumas ");
            escritura.writeEndElement();

            escritura.writeStartElement("titulo");
            escritura.writeCharacters(" El conde de montecristo");
            escritura.writeEndElement();

            escritura.writeStartElement("titulo");
            escritura.writeCharacters(" Los miserables ");
            escritura.writeEndElement();

            escritura.writeEndElement();

            escritura.writeStartElement("autor");
            escritura.writeAttribute("codigo", "a2");

            escritura.writeStartElement("nome");
            escritura.writeCharacters("Fiodor Dostoyevski");
            escritura.writeEndElement();

            escritura.writeStartElement("titulo");
            escritura.writeCharacters(" El idiota");
            escritura.writeEndElement();

            escritura.writeStartElement("titulo");
            escritura.writeCharacters(" Noches blancas ");
            escritura.writeEndElement();

            escritura.writeEndElement();

            escritura.writeEndElement();
            escritura.writeEndDocument();

            escritura.flush();
            escritura.close();
        }
        catch (XMLStreamException | IOException e) {
            System.out.println("No se puede crear el documento");

        }

    }
}
