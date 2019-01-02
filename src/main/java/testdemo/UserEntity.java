package testdemo;

/**
 * @Derscription TODO
 * @auther David
 * @date 2018-11-14 16:42
 * @Version 1.o
 */
public class UserEntity {
    private String userName;
    private String userPwd;

    public UserEntity() {
    }

    public UserEntity(String userName, String userPwd) {
        this.userName = userName;
        this.userPwd = userPwd;
    }


    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPwd() {
        return userPwd;
    }

    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd;
    }
}
