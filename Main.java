import java.util.HashMap;

public class Main{
    private HashMap<String, String> urlMap;

    public Main() {
        urlMap = new HashMap<>();
    }

    public String shortenURL(String originalURL) {
        String shortURL = generateShortURL();
        urlMap.put(shortURL, originalURL);
        return shortURL;
    }

    public String getOriginalURL(String shortURL) {
        return urlMap.get(shortURL);
    }

    private String generateShortURL() {
        
        return "shortURL";
    }

    public static void main(String[] args) {
        Main urlShortener = new Main();

        // Test the URL shortener
        String originalURL = "https://www.Google.com";
        String shortURL = urlShortener.shortenURL(originalURL);
        System.out.println("Short URL: " + shortURL);

        String retrievedURL = urlShortener.getOriginalURL(shortURL);
        System.out.println("Retrieved URL: " + retrievedURL);
    }
}
