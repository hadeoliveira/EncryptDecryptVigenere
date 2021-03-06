package encrypt;

public class Encrypt {
	
	private String key = "UFABCSEGDADOS";
	private static final int BEGIN = 32; // SPACE 32
	private static final int END = 127; // 
	private static final int ALPHABET = END - BEGIN;
	
	private String messageEncrypted = "";
	
	public Encrypt(String message) {
		processEncrypt(message);
	}
	
	private void processEncrypt(String message) {
		
		for(int i = 0; i < message.length(); i++) {
			int numberChar = message.charAt(i) - BEGIN;
			int keyDelta = key.charAt(i % key.length()) - BEGIN;
			int position = ((numberChar + keyDelta) % ALPHABET) + BEGIN;

			messageEncrypted += (char) position;
		}	
	}
	
	public String getMessageEncrypted() {
		return this.messageEncrypted;
	}
}
