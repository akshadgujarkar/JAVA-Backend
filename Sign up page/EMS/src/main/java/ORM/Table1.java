/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ORM;
import javax.persistence.*;
import java.util.*;
import org.hibernate.*;
/**
 *
 * @author Admin
 */
@Entity
public class Table1 {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id = 0;
    private  String username;
    private String password;
    
    public Table1()
    {
        super();
    }
    public Table1(int id, String username,String password)
    {
        this.id=id;
        this.username=username;
        this.password=password;
    }
    public void setId(int id)
    {
        this.id = id;
    }
    public void setUsername(String username)
    {
        this.username = username;
    }
    public void setPassword(String password)
    {
        this.password = password;
    }
    public int getId()
    {
        return this.id;
    }
    public String getUsername()
    {
        return this.username;
    }
    public  String getPassword()
    {
        return this.password;
    }
    
    
}
