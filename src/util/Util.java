package util;

import java.util.Date;
import java.util.GregorianCalendar;

import javax.swing.text.MaskFormatter;

public class Util {

	 public static MaskFormatter Mascara(String Mascara){
	        MaskFormatter F_Mascara = new MaskFormatter();
	        try{
	            F_Mascara.setMask(Mascara); //Atribui a mascara
	            F_Mascara.setPlaceholderCharacter(' ');//Caracter para preencimento 
	        }
	        catch (Exception excecao) {
	        excecao.printStackTrace();
	        } 
	        return F_Mascara;
	 }
	 
	 public static int geradorDeMatricula() {
		 	
		 	Date data = new Date();
		 	GregorianCalendar calendarioGregoriano = new GregorianCalendar();
			calendarioGregoriano.setTime(data);
			String ano = String.valueOf(calendarioGregoriano.get(GregorianCalendar.YEAR));
			String mes = String.valueOf(calendarioGregoriano.get(GregorianCalendar.MONTH));
			String dia = String.valueOf(calendarioGregoriano.get(GregorianCalendar.DAY_OF_MONTH));
			String milisegundos = String.valueOf(calendarioGregoriano.get(GregorianCalendar.MILLISECOND));
		 
			return Integer.parseInt(ano+mes+dia+milisegundos);
		 
	 }
	 
	 public static String removeMascaraCpf(String cpf) {
		 cpf = cpf.replace(".", "");
		 cpf = cpf.replaceAll("-","");
		 return cpf;
	 }
	 
	 public static String trataData(String data) {
		 data = data.replace("/", "");
		
		 return (data.substring(4, 8)+"-"+data.substring(2,4)+"-"+data.substring(0,2));
	 }
}
