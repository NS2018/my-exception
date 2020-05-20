package demo.service;


import demo.model.User;

/**
 * 用户业务接口
 */
public interface UserService {

    /**
     *
     * @param user 用户对象
     * @return 成功返回success 失败返回错误信息
     */
    String addUser(User user);


}
