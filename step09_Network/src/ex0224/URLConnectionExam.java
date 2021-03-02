package ex0224;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.Scanner;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class URLConnectionExam {
	private static String getTagValue(String tag, Element eElement) {
		NodeList nlList = eElement.getElementsByTagName(tag).item(0).getChildNodes();
		Node nValue = (Node) nlList.item(0);
		if(nValue == null) 
			return null;
		return nValue.getNodeValue();
	}
	
	public static void main(String[] args) throws IOException, SAXException, ParserConfigurationException {
		int count = 0;
		Scanner s = new Scanner(System.in);
		System.out.print("시/군을 입력해주세요 : ");
		String si = s.next();
		String serviceKey = "dcd638f7e92f4a43a1ec0455f988de49";
		StringBuilder urlBuilder = new StringBuilder("https://openapi.gg.go.kr/Animalhosptl"); /*URL*/
		urlBuilder.append("?" + URLEncoder.encode("KEY","UTF-8") + "=" + serviceKey); /*Service Key*/
		urlBuilder.append("&" + URLEncoder.encode("Type","UTF-8") + "=" + URLEncoder.encode("TXT", "UTF-8")); /*페이지번호*/
		urlBuilder.append("&" + URLEncoder.encode("pIndex","UTF-8") + "=" + URLEncoder.encode("1", "UTF-8")); /*한 페이지 결과 수*/
		urlBuilder.append("&" + URLEncoder.encode("pSize","UTF-8") + "=" + URLEncoder.encode("5", "UTF-8")); /*요청자료형식(XML/JSON)Default: XML*/
		urlBuilder.append("&" + URLEncoder.encode("SIGUN_NM","UTF-8") + "=" + URLEncoder.encode(si, "UTF-8")); /*요청자료형식(XML/JSON)Default: XML*/
		URL url = new URL(urlBuilder.toString());
		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		conn.setRequestMethod("GET");
		conn.setRequestProperty("Content-type", "application/json");
		BufferedReader rd;
		
        if(conn.getResponseCode() >= 200 && conn.getResponseCode() <= 300) {
            rd = new BufferedReader(new InputStreamReader(conn.getInputStream(), "UTF-8"));
        } else {
            rd = new BufferedReader(new InputStreamReader(conn.getErrorStream()));
        }
		
		DocumentBuilderFactory dbFactoty = DocumentBuilderFactory.newInstance();
		DocumentBuilder dBuilder = dbFactoty.newDocumentBuilder();
		Document doc = dBuilder.parse(urlBuilder.toString());
		
		doc.getDocumentElement().normalize();
		NodeList nodeList = doc.getElementsByTagName("row");
		
		for(int temp =0; temp<nodeList.getLength(); temp++) {
			Node nNode = nodeList.item(temp);
			Element element = (Element) nNode;
			if(nNode.getNodeType()==Node.ELEMENT_NODE 
					&& getTagValue("BSN_STATE_NM", element).equals("정상")) {
				System.out.println("##########################");
				System.out.println("시군명: "+getTagValue("SIGUN_NM", element));
				System.out.println("사업장명: "+getTagValue("BIZPLC_NM", element));
				System.out.println("인허가일자: "+getTagValue("LICENSG_DE", element));
				System.out.println("소재지시설전화번호: "+getTagValue("LOCPLC_FACLT_TELNO", element));
				System.out.println("소재지면적정보: "+getTagValue("LOCPLC_AR_INFO", element));
				System.out.println("도로명우편번호: "+getTagValue("ROADNM_ZIP_CD", element));
				System.out.println("소재지도로명주소: "+getTagValue("REFINE_ROADNM_ADDR", element));
				System.out.println("소재지지번주소: "+getTagValue("REFINE_LOTNO_ADDR", element));
				count++;
			}
		}
		
		System.out.println();
		System.out.println("──────────────────");
		System.out.println("총 " + count + "곳이 검색되었습니다.");
		System.out.println("──────────────────");
	}
}