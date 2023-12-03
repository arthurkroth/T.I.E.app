/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.ArrayList;
/**
 *
 * @author arthurkroth
 */
public class UserList {
    private ArrayList<User> users;
    
    private UserList()
    {
        users = new ArrayList<User>();
    }
    
    private static UserList INSTANCE = new UserList();
    
    public static UserList getInstance()
    {
        return INSTANCE;
    }
    
    public void addEmployee(User user)
    {
        users.add(user);
    }
    
    
}
