package agentpc.DBOperations;


import agentpc.BusinessLogic.UserDetails;
import agentpc.Interfaces.AgentSelectionWindow;
import com.mysql.jdbc.PreparedStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class DBOperations {

    String url = "jdbc:mysql://localhost:3306/agent";
    String username = "root";
    String password = "";
    Connection con = null;
    PreparedStatement pst = null;
    ResultSet rs=null;
    
    PreparedStatement pst1;
    PreparedStatement pst2;
    
    static int rid=1;

    AgentSelectionWindow asw=new AgentSelectionWindow();
    
    public boolean addUser(String table,UserDetails acd) {

        try {
            con = (Connection) DriverManager.getConnection(url, username, password);
            String quary = "INSERT INTO "+table+" VALUES (?,?,?,?,?,?,?,?)";
            pst = (PreparedStatement) con.prepareStatement(quary);

            pst.setString(1, acd.getRegid());//add values to the sql quary
            pst.setString(2, acd.getFirstname());
            pst.setString(3, acd.getLastname());
            pst.setInt(4, acd.getAge());
            pst.setString(5, acd.getCompany());
            pst.setString(6, acd.getEmail());
            pst.setString(7, acd.getUsername());
            pst.setString(8, acd.getPassword()); 
            pst.executeUpdate();//execute the sql quary and insert the values to the values table

            return true;

        } catch (Exception e) {
            System.out.println(e);
            return false;

        } finally {
            try {
                if (con != null) {
                    con.close();
                }
                if (pst != null) {
                    pst.close();
                }
            } catch (Exception e) {
            }
        }
    }
    
    public int checkData(String table,String colomn,String email){
        try {
            con = (Connection) DriverManager.getConnection(url, this.username, password);
            String quary = "SELECT "+colomn+" FROM "+table;
            
            pst=(PreparedStatement)con.prepareStatement(quary);
            
            rs=pst.executeQuery();
            while(rs.next()){
                if(email.equals(rs.getString(1))){
                    return 0;//the username provided already exits in the db
                }
            }
            return 1;//the username provided does not exits in the db
            
        } catch (Exception e) {
            System.out.println(e);
            return 2;
        } finally {
            try {
                if (con != null) {
                    con.close();
                }
                if (pst != null) {
                    pst.close();
                }
            } catch (Exception e) {
            }
        }
    }

    
    
    public int checkLogin(String table,String username,String password) {
        try {
            con = (Connection) DriverManager.getConnection(url, this.username, this.password);
            String quary1 = "SELECT username FROM "+table;
            String quary2 = "SELECT password FROM "+table;
            
            pst1=(PreparedStatement)con.prepareStatement(quary1);
            pst2=(PreparedStatement)con.prepareStatement(quary2);
            
            ResultSet rs1=pst1.executeQuery();
            ResultSet rs2=pst2.executeQuery();
            
            while(rs1.next() && rs2.next()){
                if(username.equals(rs1.getString(1)) && password.equals(rs2.getString(1))){
                    return 0;
                }
            }
            
            return 1;//the username provided does not exits in the db
            
        } catch (Exception e) {
            System.out.println(e+"catch point 1");
            return 2;
        } finally {
            try {
                if (con != null) {
                    con.close();
                }
                if ((pst1 != null) && (pst2 != null)) {
                    pst1.close();
                    pst2.close();
                }
            } catch (Exception e){
                System.out.println(e+"catch point 2");
            }
        }
    }
    
    public int checkRegID(String table){
        try {
            
            con = (Connection) DriverManager.getConnection(url, this.username, password);
            String quary = "SELECT regid FROM "+table;
            
            pst=(PreparedStatement)con.prepareStatement(quary);
            
            rs=pst.executeQuery();
            while(rs.next()){
                rid=Integer.parseInt(Character.toString(rs.getString(1).charAt(3)));
                //return rid ++;
            }
            
            return rid+1;//the username provided does not exits in the db
            
            
        } catch (Exception e) {
            System.out.println(e);
            return 2;
        } finally {
            try {
                if (con != null) {
                    con.close();
                }
                if (pst != null) {
                    pst.close();
                }
            } catch (Exception e) {
            }
        }
    }
    
    //2014/09/23 kamba
    public ArrayList<UserDetails> getUser(String table){
        try {
            ArrayList<UserDetails> slist=new ArrayList<UserDetails>();
            con= (Connection)DriverManager.getConnection(url, username, password);
            String quary="select * FROM "+table;
            pst=(PreparedStatement)con.prepareStatement(quary);
            
            rs=pst.executeQuery();
            
            while(rs.next()){
                UserDetails s=new UserDetails();
                
                s.setRegID(rs.getString(1));
                s.setFirstname(rs.getString(2));
                s.setLastname(rs.getString(3));
                s.setAge(rs.getInt(4));
                s.setCompany(rs.getString(5));
                s.setEmail(rs.getString(6));
                
                slist.add(s);
            }
            return slist;
            
        } catch (SQLException ex) {
            System.out.println(ex);
            return null;        
        }
        finally{
            try{
                if(con!=null){
                    con.close();
                }
                if(pst!=null){
                    pst.close();
                }
            }catch(Exception e){
                
            }
        }
    }
    
    public boolean updateUser(String table,UserDetails em){
        try {
            con= (Connection)DriverManager.getConnection(url, username, password);
            String quary="UPDATE "+table+" SET firstname='"+em.getFirstname()+"',lastname='"+em.getLastname()+"',age="+em.getAge()+",company='"+em.getCompany()+"',email='"+em.getEmail()+"'WHERE regid='"+em.getRegid()+"'";
            //String quary2="UPDATE rep SET firstname='"+em.getFirstname()+"',lastname='"+em.getLastname()+"',age="+em.getAge()+",address='"+em.getAddress()+"',gender='"+em.getGender()+"',faculty='"+em.getFaculty()+"',department='"+em.getDepartment()+"',yearOfReg="+em.getYearOfReg()+" WHERE regid="+em.getRegid();
            pst=(PreparedStatement)con.prepareStatement(quary);
            
            
            
            pst.executeUpdate();//execute the sql quary and insert the values to the values table
            return true;
            
        } catch (SQLException ex) {
            System.out.println(ex);
            return false;
        }
        finally{
            try{
                if(con!=null){
                    con.close();
                }
                if(pst!=null){
                    pst.close();
                }
            }catch(Exception e){
                
            }
        }
    }
    
    public boolean deleteUser(String table,UserDetails em){
        try {
            con= (Connection)DriverManager.getConnection(url, username, password);
            String quary="DELETE FROM "+table+" WHERE regid='"+em.getRegid()+"'";
            pst=(PreparedStatement)con.prepareStatement(quary);
            
            pst.executeUpdate();//execute the sql quary and insert the values to the values table
            return true;
            
        } catch (SQLException ex) {
            System.out.println(ex);
            return false;
        }
        finally{
            try{
                if(con!=null){
                    con.close();
                }
                if(pst!=null){
                    pst.close();
                }
            }catch(Exception e){
                
            }
        }
    }
    
}
