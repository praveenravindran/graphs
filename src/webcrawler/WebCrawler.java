package webcrawler;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
//import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
//import java.util.List;
import java.util.Queue;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WebCrawler {
	
	private Queue<String> queue;
	//private List<String> discoveredWebsites;
	private HashMap<String,Integer> websiteChecker;
	
	public WebCrawler(){
		this.queue = new LinkedList<String>();
		//this.discoveredWebsites = new ArrayList<String>();
		this.websiteChecker = new HashMap<String,Integer>();
	}
	
	public void webCrawler(String website){
		
		queue.add(website);
		//discoveredWebsites.add(website);
		websiteChecker.put(website, 1);
		while(!queue.isEmpty()){
			String v = queue.remove();
			//System.out.println(v);
			String rawHtml = readUrl(v);
			//System.out.println(rawHtml);
			String regExpress = "http://(\\w+\\.)*(\\w+)";
			Pattern p = Pattern.compile(regExpress);
			Matcher m = p.matcher(rawHtml);
			while(m.find()){
				String foundWebsites = m.group();
				
				if(websiteChecker.get(foundWebsites)==null ){
					System.out.println(foundWebsites);
			//		discoveredWebsites.add(foundWebsites);
					websiteChecker.put(foundWebsites, 1);
					queue.add(foundWebsites);
				}
			}
			
		
	}
		
	}
	
	public String readUrl(String website){
		String rawHtml ="";
		try{
			URL url = new URL(website);
			BufferedReader in= new BufferedReader(new InputStreamReader(url.openStream()));
			String inputLine ="";
			while( (inputLine = in.readLine()) != null){
				rawHtml += inputLine; 
			}
			in.close();
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
		return rawHtml;
	}
}


