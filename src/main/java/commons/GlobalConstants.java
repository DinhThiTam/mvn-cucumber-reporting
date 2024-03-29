package commons;

import java.io.File;

public class GlobalConstants {
	public static final String DEV_APP_URL = "http://demo.guru99.com";
	public static final String STAGING_APP_URL = "https://staging.nopcommerce.com";
	public static final String TESTING_APP_URL = "https://test.nopcommerce.com";
	
	public static final long SHORT_TIMEOUT = 5;
	public static final long LONG_TIMEOUT = 30;
	
	public static final String PROJECT_PATH = System.getProperty("user.dir");
	public static final String UPLOAD_FOLDER_PATH = PROJECT_PATH + File.separator + "uploadFiles" + File.separator;
	public static final String DOWNLOAD_FOLDER_PATH = PROJECT_PATH + "\\downloadFiles";
	
	
	public static final String EMAIL_ADDRESS_ADMIN_NOPCOMERCE = "admin@yourstore.com";
	public static final String PASSWORD_ADMIN_NOPCOMERCE = "admin";


	
	
	
	

}