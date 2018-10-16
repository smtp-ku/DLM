package util.hm;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import main.dbManager;

public class bpupdate {
	private static final int num_search_page = 3;
	private static final String board_humor = "http://v12.battlepage.com/??=Board.Humor.Table";
	private static final String board_etc = "http://v12.battlepage.com/??=Board.ETC.Table";
	private List<String> log_list = new ArrayList<>();
	private dbManager dm;
	
	public bpupdate(dbManager dm) {
		try {
			this.dm = dm;
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public Map<String, String> LoadBP() {
		Map<String, String> data_map = new TreeMap<>();
		try {
			log_list = dm.getLogs("v12.battlepage.com");
			for(int i=1; i<=num_search_page; i++) {
				Document doc = Jsoup.connect(board_humor+"&page="+i).get();
				Element table = doc.select("#div_content_containter > div:nth-child(2) > div.detail_container > div.ListTable").get(0);
				for(Element e : table.getElementsByAttribute("href")) {
					String url = e.attr("href").replace("&page="+i, "");
					if(!log_list.contains(url) && url.contains("no=")) {
						String title = e.getElementsByClass("search_title").get(0).text();
						data_map.put(url, title);
					}
				}
			}
			for(int i=1; i<=num_search_page; i++) {
				Document doc = Jsoup.connect(board_etc+"&page="+i).get();
				Element table = doc.select("#div_content_containter > div:nth-child(2) > div.detail_container > div.ListTable").get(0);
				for(Element e : table.getElementsByAttribute("href")) {
					String url = e.attr("href").replace("&page="+i, "");
					if(!log_list.contains(url) && url.contains("no=")) {
						String title = e.getElementsByClass("search_title").get(0).text();
						data_map.put(url, title);
					}
				}
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return data_map;
	}
}
