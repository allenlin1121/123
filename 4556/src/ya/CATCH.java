package ya;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class CATCH{
	public static void main(String[] args)  throws Exception{
		//for(int m=01;m<=12;m++){	
			//for(int d=01;d<=31;d++){
			//String s,q;
			//s=String.format("%02d",m);
			//q=String.format("%02d",d);
			String datehistory ="http://www.cnyes.com/futures/History.aspx?mydate=20170307&code=INDU";
			String a;
			File history = new File(datehistory);
			//BufferedReader history1 = new BufferedReader(new FileReader(history));
			Document doc;
			doc = Jsoup.connect(datehistory).get();
			Elements title = doc.select("td[class=g]");
			a= title.text();
			System.out.println(a);
			//history1.close();
			
			
			//}
		//}
		
		
		
	}
	
	
	
	
	
	
}