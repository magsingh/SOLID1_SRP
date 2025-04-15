package srp;

public class SrpStart {
	
	//SOLID- Single Responsibility Principle
	//A class should have only one reason to change, meaning that it should have only one responsibility or job

	public static void main(String[] args) {
		System.out.println("#### SRP Start ####");
		Logger logger = new Logger();
		NotificationService notificationService = new NotificationService();
		
		FileManager fileMgr = new FileManager(logger, notificationService);
		fileMgr.saveFile("File1");
		fileMgr.saveFile("File2");
		fileMgr.openFile("File2");
		fileMgr.openFile("File3");
		fileMgr.saveFile("File3");
		fileMgr.openFile("File3");
		
		ConversionService cs = new ConversionService(logger, notificationService);
		cs.convertToPdf("File2");
		
		ThumbnailService ts = new ThumbnailService(logger, notificationService);
		ts.generateThumbnail("File3");

	}

}
