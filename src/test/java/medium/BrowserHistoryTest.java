package medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BrowserHistoryTest {

    @Test
    public void testHistory() {
        BrowserHistory browserHistory = new BrowserHistory("leetcode.com");
        browserHistory.visit("google.com");       // You are in "leetcode.com". Visit "google.com"
        browserHistory.visit("facebook.com");     // You are in "google.com". Visit "facebook.com"
        browserHistory.visit("youtube.com");      // You are in "facebook.com". Visit "youtube.com"
        assertEquals("facebook.com", browserHistory.back(1)); // You are in "youtube.com", move back to "facebook.com" return "facebook.com"
        assertEquals("google.com", browserHistory.back(1)); // You are in "facebook.com", move back to "google.com" return "google.com"
        assertEquals("facebook.com", browserHistory.forward(1)); // You are in "google.com", move forward to "facebook.com" return "facebook.com"
        browserHistory.visit("linkedin.com");     // You are in "facebook.com". Visit "linkedin.com"
        assertEquals("linkedin.com", browserHistory.forward(2));                // You are in "linkedin.com", you cannot move forward any steps.
        assertEquals("google.com", browserHistory.back(2));                   // You are in "linkedin.com", move back two steps to "facebook.com" then to "google.com". return "google.com"
        assertEquals("leetcode.com",browserHistory.back(7));                   // You are in "google.com", you can move back only one step to "leetcode.com". return "leetcode.com"
    }

}