package DataConversion;
import java.io.File;
import net.sourceforge.tess4j.Tesseract;

public class FileConversion {
	public String file_conversion( String ivFolderdirectory, String ivFileDirectory) {
		String evTexto = null;
		Tesseract tesseract = new Tesseract(); 
		try { 
	  
	            tesseract.setDatapath(ivFolderdirectory); 
	            String txt  = tesseract.doOCR(new File(ivFileDirectory));
	            evTexto = txt;
		}catch (Exception e) { 
			evTexto = "Não foi possivel fazer a conversão dos dados.";
	    } 
		
		return evTexto;
	}
}
