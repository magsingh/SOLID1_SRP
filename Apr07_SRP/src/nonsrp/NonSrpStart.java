package nonsrp;

public class NonSrpStart {

	public static void main(String[] args) {
		System.out.println("#### NonSRP Start ####");
		FileManagerNonSRP fileMgr = new FileManagerNonSRP();
		fileMgr.saveFile("File1");
		fileMgr.saveFile("File2");
		fileMgr.openFile("File2");
		fileMgr.openFile("File3");
		fileMgr.saveFile("File3");
		fileMgr.openFile("File3");
		fileMgr.generateThumbnail("File1");
		fileMgr.convertToPdf("File2");
		
	}

}
