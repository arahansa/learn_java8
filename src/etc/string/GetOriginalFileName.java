package etc.string;

public class GetOriginalFileName {

	
	public static void main(String[] args) {
		String url = "http://121.78.146.87/contents/transcoded/3421___20160318_185425_343_20160309_101212/20160318_185425_343_20160309_1012122.jpg";
		StringUrlExtractor(url);
		
		
		url="test";
		StringUrlExtractor(url);
	}
	
	public static void StringUrlExtractor(String url){
		int indexLastSlash = url.lastIndexOf("/");
		int indexLastDot = url.lastIndexOf(".");
		System.out.println("FileName " + url.substring(indexLastSlash+1));
		System.out.println("first : "+ ( indexLastSlash+1) + ", lastDOt : "+indexLastDot);
		System.out.println("FileName Ext " + url.substring(indexLastSlash+1, indexLastDot));
	}
}
