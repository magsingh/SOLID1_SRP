package nonsrp;

import java.util.ArrayList;
import java.util.List;

public class FileManagerNonSRP {

	private List<String> files;
	
	public FileManagerNonSRP() {
		files = new ArrayList<>();
	}
	
	public void saveFile(String file) {
		System.out.println("Saving file " + file);
		files.add(file);
		logAction("Save ", file);
		sendNotification("Save complete: " + file);
		
	}
	
	public void openFile(String file) {
		if (files.contains(file)) {
			System.out.println("Opening file: " + file);
			logAction("Open ", file);
			sendNotification("Opened file: " + file);
		} else {
			sendNotification("File not found: " + file);
		}
	}
	
	public void generateThumbnail(String file) {
		System.out.println("Generating thumbnail for file " + file);
		logAction("Thumbnail ", file);
		sendNotification("Thumbnail generated for: " + file);
	}
	
	public void convertToPdf(String file) {
		System.out.println("Converting to PDF: " + file);
		logAction("PDF ", file);
		sendNotification("Connverted to PDF: " + file);
	}

	private void logAction(String string, String file) {
		System.out.println("Logging: " + string + " " + file);
	}
	
	private void sendNotification(String string) {
		System.out.println("Notification: " + string);
		System.out.println();
	}

}
