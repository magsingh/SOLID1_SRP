package srp;

public class ConversionService {
	private Logger logger;
	private NotificationService notificationService;
	
	public ConversionService(Logger l, NotificationService ns) {
		logger = l;
		notificationService = ns;
	}
	
	public void convertToPdf(String file) {
		System.out.println("Converting to PDF: " + file);
		logger.logAction("PDF ", file);
		notificationService.sendNotification("Connverted to PDF: " + file);
	}

}
