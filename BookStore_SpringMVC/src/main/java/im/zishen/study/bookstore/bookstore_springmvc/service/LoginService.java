package im.zishen.study.bookstore.bookstore_springmvc.service;

import im.zishen.study.bookstore.bookstore_springmvc.model.User;

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
        System.out.println(user.getName());
        System.out.println(user.getPassword());
        return true;
    }
}
