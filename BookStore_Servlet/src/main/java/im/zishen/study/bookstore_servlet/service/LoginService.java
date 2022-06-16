package im.zishen.study.bookstore_servlet.service;

import im.zishen.study.bookstore_servlet.model.User;

public class LoginService {
    private volatile static LoginService loginServiceSingleton;
    private LoginService(){


    }
    public static LoginService getInstance(){
        if(loginServiceSingleton == null){
            synchronized (LoginService.class){
                if(loginServiceSingleton == null){
                    loginServiceSingleton = new LoginService();
                }
            }
        }
        return loginServiceSingleton;
    }

    public boolean login(User user){
        return true;
    }
}
