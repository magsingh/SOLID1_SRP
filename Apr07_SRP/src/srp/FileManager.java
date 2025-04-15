package srp;

import java.util.ArrayList;
import java.util.List;

public class FileManager {
	private List<String> files;
	
	private Logger logger;
	private NotificationService notificationService;

	public FileManager(Logger l, NotificationService ns) {
		files = new ArrayList<>();
		logger = l;
		notificationService = ns;
	}
	
	public void saveFile(String file) {
		System.out.println("Saving file " + file);
		files.add(file);
		logger.logAction("Save ", file);
		notificationService.sendNotification("Save complete: " + file);
		
	}
	
	public void openFile(String file) {
		if (files.contains(file)) {
			System.out.println("Opening file: " + file);
			logger.logAction("Open ", file);
			notificationService.sendNotification("Opened file: " + file);
		} else {
			notificationService.sendNotification("File not found: " + file);
		}
	}
}
