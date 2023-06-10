package propBean;

import java.io.Serializable;

public class PropartyDataBean implements Serializable {
	/*  */
	private String DBURL;
	/*  */
	private String DBUser;
	/*  */
	private String DBPass;
	/*  */
	private String templateHTMLPath;
	
	public String getDBURL() {
		return DBURL;
	}
	public void setDBURL(String dBURL) {
		DBURL = dBURL;
	}
	public String getDBUser() {
		return DBUser;
	}
	public void setDBUser(String dBUser) {
		DBUser = dBUser;
	}
	public String getDBPass() {
		return DBPass;
	}
	public void setDBPass(String dBPass) {
		DBPass = dBPass;
	}
	public String getTemplateHTMLPath() {
		return templateHTMLPath;
	}
	public void setTemplateHTMLPath(String templateHTMLPath) {
		this.templateHTMLPath = templateHTMLPath;
	}
	
}
