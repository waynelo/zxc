package cn.lwh.zxc.pojo;

/**
 * 用户数据对象
 * @author luoweihong 
 * @date  2018年4月4日
 */
public class UserDO {
    private Integer id; //用户ID
    private String username; //用户名
    private String password;//密码
    private String gender;// 性别
    private String createDatatime;//用户创建时间
    private String lastLoginDatatime;//最后一次登陆时间
    private boolean deleted;//是否删除
    
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public String getCreateDatatime() {
        return createDatatime;
    }
    public void setCreateDatatime(String createDatatime) {
        this.createDatatime = createDatatime;
    }
    public String getLastLoginDatatime() {
        return lastLoginDatatime;
    }
    public void setLastLoginDatatime(String lastLoginDatatime) {
        this.lastLoginDatatime = lastLoginDatatime;
    }
    public boolean isDeleted() {
        return deleted;
    }
    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }
    @Override
    public String toString() {
        return "UserDO [id=" + id + ", username=" + username + ", password=" + password + ", gender=" + gender
                + ", createDatatime=" + createDatatime + ", lastLoginDatatime=" + lastLoginDatatime + ", deleted="
                + deleted + "]";
    }
  
    
}
