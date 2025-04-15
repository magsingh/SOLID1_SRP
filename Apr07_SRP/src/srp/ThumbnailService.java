package srp;

public class ThumbnailService {
	private Logger logger;
	private NotificationService notificationService;
	
	public ThumbnailService(Logger l, NotificationService ns) {
		logger = l;
		notificationService = ns;
	}
	
	public void generateThumbnail(String file) {
		System.out.println("Generating thumbnail for file " + file);
		logger.logAction("Thumbnail ", file);
		notificationService.sendNotification("Thumbnail generated for: " + file);
	}
}
