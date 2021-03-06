package decrypt;

public class Decrypt {
	
	private String key = "UFABCSEGDADOS";
	private static final int BEGIN = 32; // SPACE 32
	private static final int END = 127; 
	private static final int ALPHABET = END - BEGIN;
	
	private String messageDecrypted = "";
	
	public Decrypt(String message) {
		processDecrypt(message);
	}
	
	private void processDecrypt(String message) {
		
		for(int i = 0; i < message.length(); i++) {
			int numberChar = message.charAt(i) - BEGIN;
			int keyDelta = key.charAt(i % key.length()) - BEGIN;
			int position = ((numberChar - keyDelta + ALPHABET) % ALPHABET)
					+ BEGIN;

			messageDecrypted += (char) position;
		}
	}
	
	public String getMessageDecrypted() {
		return this.messageDecrypted;
	}
}
