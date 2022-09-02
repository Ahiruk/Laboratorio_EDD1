import java.io.FileReader;
import java.io.BufferedReader;
public class trabajo {
    public static void main (String[] args) {
        try {
            FileReader fr = new FileReader ("datos de tarjetas de credito.txt");
            BufferedReader br =new BufferedReader(fr);
            String cadena;
            while((cadena=br.readLine())!=null){
                System.out.println(""+cadena);
            }
        }catch(Exception ex ){
        }
    }
}