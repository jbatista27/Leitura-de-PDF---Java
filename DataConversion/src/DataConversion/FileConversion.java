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
			evTexto = "N�o foi possivel fazer a convers�o dos dados.";
	    } 
		
		return evTexto;
	}
}
