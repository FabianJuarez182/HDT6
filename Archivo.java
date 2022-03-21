import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Archivo {
    ArrayList<String> array = new ArrayList<String>();
    
     /*****************************************************************
	 * Creara el archivo donde iran los 3000 numeros
    public void Filewrite(){
        try {
            String ruta = "ListadoProducto.txt";
            String contenido = "";
            File file = new File(ruta);
            // Si el archivo no existe es creado
            if (!file.exists()) {
                file.createNewFile();
            }
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            for(int i=0; i < size ;i ++)
                contenido += array[i] + "\n";
            bw.write(contenido);
            bw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    //****************************************************************

/*****************************************************************
	 * FileReader: Lee el archivo.
     */
    public boolean read() throws FileNotFoundException{
        boolean read = false;
        try{
            read = true;
            File file = new File("ListadoProducto.txt");
            Scanner reader = new Scanner(file);
            while(reader.hasNextLine()){
                array.add(reader.nextLine());
            }
            reader.close();
        }catch(FileNotFoundException e){
            String s = "SortController.read:" + e.getMessage();
            throw new FileNotFoundException(s);
        }
        return read;
    }
    //****************************************************************
}
