package wanda.base.pojo.vo;

public class ActiveUser   implements   java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String userid;//用户账号
	private String username;//用户名称
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getGroupid() {
		return groupid;
	}
	public void setGroupid(String groupid) {
		this.groupid = groupid;
	}
	public String getGroupname() {
		return groupname;
	}
	public void setGroupname(String groupname) {
		this.groupname = groupname;
	}
	public String getSysid() {
		return sysid;
	}
	public void setSysid(String sysid) {
		this.sysid = sysid;
	}
	public String getSysmc() {
		return sysmc;
	}
	public void setSysmc(String sysmc) {
		this.sysmc = sysmc;
	}
	private String groupid;//用户类型
	private String groupname;//用户类型名称

//	private Menu menu;//操作菜单
//	private List<Operation> operationList;//操作权限，包括用户点击菜单及操作菜单功能所有链接权限
	
	private String sysid;//用户所属单位id
	private String sysmc;//单位名称

}
