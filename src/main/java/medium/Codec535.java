package medium;

import java.util.HashMap;
import java.util.Map;

public class Codec535 {
    Map<String, String> map = new HashMap<>();
    int count = 0;

    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        String value = String.valueOf(count++);
        map.put(longUrl, value);
        map.put(value, longUrl);
        return value;
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        return map.get(shortUrl);
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(url));