package utility;

import com.mailosaur.MailosaurClient;
import com.mailosaur.MailosaurException;
import com.mailosaur.models.*;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotNull;

import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.testng.annotations.Test;

public class AppTest {
	  private static final int MAX_RETRIES = 5;
	    private static final int DELAY_MS = 5000; // 5 seconds delay between retries

	@Test 
	public String testExample() throws IOException, MailosaurException, InterruptedException {
		// Available in the API tab of a server
		 String APIkey = "m7bza8ShjeJxo5N3dXcKxobBgJqXASui";

	        String severID = "1qa4x41w";

	        String serverDomain = "1qa4x41w.mailosaur.net";

	        MailosaurClient mailosaur = new MailosaurClient(APIkey);

	        MessageSearchParams params = new MessageSearchParams();
	        params.withServer(severID);

	        SearchCriteria criteria = new SearchCriteria();
	        criteria.withSentTo("anything@" + serverDomain);

	        Pattern pattern = Pattern.compile("\\b[0-9]{4}\\b");

	        for (int attempt = 1; attempt <= MAX_RETRIES; attempt++) {
	            Message message = mailosaur.messages().get(params, criteria);
	            
	            System.out.println(message.subject());
	            System.err.println(message.cc());
	            System.out.println(message.to());

	            // Print both text and HTML body for debugging
	            System.out.println("Text Body: " + message.text().body());
	            System.out.println("HTML Body: " + message.html().body());

	            Matcher matcher = pattern.matcher(message.html().body());

	            if (matcher.find()) {
	                String otp = matcher.group();
	                System.out.println("The OTP is: " + otp);
	                return otp;
	            }

	            // Delay before the next attempt
	            try {
	                Thread.sleep(DELAY_MS);
	            } catch (InterruptedException e) {
	                Thread.currentThread().interrupt();
	                throw new RuntimeException("Thread was interrupted", e);
	            }
	        }

	        throw new RuntimeException("OTP not found after " + MAX_RETRIES + " attempts.");
	    }
	}

