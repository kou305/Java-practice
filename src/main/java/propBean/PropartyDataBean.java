package propBean;

import java.io.Serializable;

public class PropartyDataBean implements Serializable {
	/* DBURL */
	private String DBURL;
	/* DBユーザ */
	private String DBUser;
	/* DBパスワード */
	private String DBPass;
	/* 正常画面用のテンプレートHTML配置パス */
	private String templateHTMLPath;
	/* エラー画面用のテンプレートHTML配置パス */
	private String templateErrorHTMLPath;
	
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
	public String getTemplateErrorHTMLPath() {
		return templateErrorHTMLPath;
	}
	public void setTemplateErrorHTMLPath(String templateErrorHTMLPath) {
		this.templateErrorHTMLPath = templateErrorHTMLPath;
	}
	
}
