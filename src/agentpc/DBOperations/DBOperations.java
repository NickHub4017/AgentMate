package agentpc.DBOperations;

import agentpc.BusinessLogic.CompanyDetails;
import agentpc.BusinessLogic.ItemDetails;
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
    
    ;

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
    
    public boolean resetPassword(String Data,String name) {
        
        try {
            con= (Connection)DriverManager.getConnection(url, username, password);
            String quary="UPDATE agentdetails SET password='"+Data+"' where username='"+name+"'";
 
            pst=(PreparedStatement)con.prepareStatement(quary);
            
            
            
            pst.executeUpdate();//execute the sql quary and insert the values to the values table
            System.out.println("UPDATED");
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
        } //To change body of generated methods, choose Tools | Templates.
    }
    public boolean addItem(String table,ItemDetails acd) {
            System.out.println(acd.getItemID());
        try {
            con = (Connection) DriverManager.getConnection(url, username, password);
            String quary = "INSERT INTO "+table+" VALUES (?,?,?,?,?,?,?,?,?,?,?,?)";
            pst = (PreparedStatement) con.prepareStatement(quary);

            pst.setString(1, acd.getItemID());//add values to the sql quary
            pst.setString(2, acd.getItemName());
            pst.setString(3, acd.getSuplier());
            pst.setString(4, acd.getItemType());
            pst.setDouble(5, acd.getGetPrice());
            pst.setDouble(6, acd.getSelPrice());
            pst.setDouble(7, acd.getLblPrice());
            pst.setDouble(8, acd.getCompanyDisc());
            pst.setDouble(9, acd.getSalesDisc());
            pst.setInt(10, acd.getQuantity());
            pst.setString(11, acd.getComplain());
            pst.setString(12, acd.getDescription());
            pst.executeUpdate();//execute the sql quary and insert the values to the values table
            System.out.println("inserted");
            return true;

        } catch (Exception e) {
            System.out.println(e);
            //System.out.println("error occured");
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
    
    public int checkData(String table,String colomn,String data){
        try {
            con = (Connection) DriverManager.getConnection(url, this.username, password);
            String quary = "SELECT "+colomn+" FROM "+table;
            
            pst=(PreparedStatement)con.prepareStatement(quary);
            
            rs=pst.executeQuery();
            while(rs.next()){
                if(data.equals(rs.getString(1))){
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
    public String[] getTypes(String table,String colomn){
        String list[]=new String[20];
        try {
            con = (Connection) DriverManager.getConnection(url, this.username, password);
            String quary = "SELECT "+colomn+" FROM "+table+" group by "+colomn;
            
            pst=(PreparedStatement)con.prepareStatement(quary);
            
            rs=pst.executeQuery();
            int i=0;
            while(rs.next()){
                list[i++]=rs.getString(1);
            }
            return list;//the username provided does not exits in the db
            
        } catch (Exception e) {
            System.out.println(e);
            return list;
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
    
    
    public int checkItem(String type,String name){
        try {
            con = (Connection) DriverManager.getConnection(url, this.username, password);
            String quary = "SELECT itemname FROM item where itemtype='"+type+"'";
            
            pst=(PreparedStatement)con.prepareStatement(quary);
            
            rs=pst.executeQuery();
            while(rs.next()){
                if(name.equals(rs.getString(1))){
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
    
    public int checkRegID(String table, String colomn){
            int rid=1;
            String ri;
        try {
            
            con = (Connection) DriverManager.getConnection(url, this.username, password);
            String quary = "SELECT "+colomn+" FROM "+table;
            pst=(PreparedStatement)con.prepareStatement(quary);
            
            rs=pst.executeQuery();
            while(rs.next()){
                //rid=Integer.parseInt(Character.toString(rs.getString(1).charAt(3)));
                ri=rs.getString(1).substring(2);
                rid=Integer.parseInt(ri);
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
            }catch (Exception e) {
            }
        }
    }
    
    public String checkItemID(String table, String colomn,String type){
        int itm;
        try {
            
            con = (Connection) DriverManager.getConnection(url, this.username, password);
            String quary = "SELECT "+colomn+" FROM "+table+" where itemtype ='"+type+"'";
            pst=(PreparedStatement)con.prepareStatement(quary);
            
            rs=pst.executeQuery();
            System.out.println(rs.getFetchSize());
            //if(rs.getFetchSize()==0){
            //while(rs.next()){
                //rid=Integer.parseInt(Character.toString(rs.getString(1).charAt(3)));
                //return rid ++;
                if(rs.last()){
                itm=this.getnumber(rs.getString(1));
            }
            
            else
                itm=0;
            
            return type.substring(0, 2)+Integer.toString(itm+1);//the username provided does not exits in the db
            
            
        } catch (Exception e) {
            System.out.println(e);
            return type+"";
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
    
    public int getnumber(String k){
        int len=k.length();
        String res="";
        for (int i=0;i<len-2;i++){
            res=res+k.charAt(i+2);
        }
        if (!res.equals("")){
            return Integer.parseInt(res);
        }
        return -1;
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
    public UserDetails getUser1(String table,String regid){
        try {
            con= (Connection)DriverManager.getConnection(url, username, password);
            String quary="select * FROM "+table+" where RegID='"+regid+"'";
            pst=(PreparedStatement)con.prepareStatement(quary);
            
            rs=pst.executeQuery();
            
            //while(rs.next()){
                UserDetails s=new UserDetails();
                
                s.setRegID(rs.getString(1));
                s.setUsername(rs.getString(2));
                s.setPassword(rs.getString(3));
                s.setQuestion(rs.getInt(4));
                s.set(rs.getString(5));
                s.setEmail(rs.getString(6));
                
           
            return s;
            
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
    /*
    public RepDetails getRep(String Data){
        try {
            //RepDetails slist=new RepDetails();
            con= (Connection)DriverManager.getConnection(url, username, password);
            String quary="select * FROM rep where regid ='"+Data+"'";
            pst=(PreparedStatement)con.prepareStatement(quary);
            
            rs=pst.executeQuery();
            
            //while(rs.next()){
                RepDetails s=new RepDetails();
                
                s.setRegID(rs.getString(1));
                s.setFirstname(rs.getString(2));
                s.setLastname(rs.getString(3));
                s.setAge(rs.getInt(4));
                s.setCompany(rs.getString(5));
                s.setEmail(rs.getString(6));
                s.setQuestion(rs.getString(8));
                s.setAnswer(rs.getString(9));
                
                //slist.add(s);
            //}
            return s;
            
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
    }*/
    
    public ArrayList<ItemDetails> getItem(String table,String sort){
        try {
            ArrayList<ItemDetails> itlist=new ArrayList<ItemDetails>();
            con= (Connection)DriverManager.getConnection(url, username, password);
            String quary="select * FROM "+table+" order BY "+ sort.toLowerCase();
            pst=(PreparedStatement)con.prepareStatement(quary);
            
            rs=pst.executeQuery();
            
            while(rs.next()){
                ItemDetails s=new ItemDetails();
                
                s.setItemId(rs.getString(1));
                s.setItemName(rs.getString(2));
                s.setSuplier(rs.getString(3));
                s.setItemType(rs.getString(4));
                s.setGetPrice(rs.getDouble(5));
                s.setSelPrice(rs.getDouble(6));
                s.setLblPrice(rs.getDouble(7));
                s.setCompanyDisc(rs.getDouble(8));
                s.setSalesDisc(rs.getDouble(9));
                s.setQuantity(rs.getInt(10));
                s.setComplain(rs.getString(11));
                s.setDescription(rs.getString(12));
                
                itlist.add(s);
            }
            return itlist;
            
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
    
    public boolean deleteRecord(String table,String colomn ,String data){
        try {
            con= (Connection)DriverManager.getConnection(url, username, password);
            String quary="DELETE FROM "+table+" WHERE "+colomn+"='"+data+"'";
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

    public boolean editItem(ItemDetails id) {
        
        try {
            con= (Connection)DriverManager.getConnection(url, username, password);
            String quary="UPDATE item SET itemname='"+id.getItemName()+"',suplier='"+id.getSuplier()+"',itemtype='"+id.getItemType()+"',getprice="+id.getGetPrice()+",lblprice="+id.getLblPrice()+",companydisc="+id.getSalesDisc()+",salesdisc="+id.getSalesDisc()+",quantity="+id.getQuantity()+",complain='"+id.getComplain()+"',description='"+id.getDescription()+"',selprice="+id.getSelPrice()+"WHERE itemid='"+id.getItemID()+"'";
            //String quary2="UPDATE rep SET firstname='"+em.getFirstname()+"',lastname='"+em.getLastname()+"',age="+em.getAge()+",address='"+em.getAddress()+"',gender='"+em.getGender()+"',faculty='"+em.getFaculty()+"',department='"+em.getDepartment()+"',yearOfReg="+em.getYearOfReg()+" WHERE regid="+em.getRegid();
            pst=(PreparedStatement)con.prepareStatement(quary);
            
            
            
            pst.executeUpdate();//execute the sql quary and insert the values to the values table
            System.out.println("updATED");
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
        } //To change body of generated methods, choose Tools | Templates.
    }
    
    /// 2012.10.14
    
    public int CompanycheckRegID(){
        int rid=1;
        try {
            
            con = (Connection) DriverManager.getConnection(url, this.username, password);
            String quary = "SELECT regid FROM company";
            
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
    
    public boolean addCompany(CompanyDetails acd) {

        try {
            con = (Connection) DriverManager.getConnection(url, username, password);
            String quary = "INSERT INTO company VALUES (?,?,?,?,?,?)";
            pst = (PreparedStatement) con.prepareStatement(quary);

            pst.setString(1, acd.getRegid());//add values to the sql quary
            pst.setString(2, acd.getCompanyname());
            pst.setString(3, acd.getAddress());
            pst.setString(4, acd.getEmail());
            pst.setInt(5, acd.getPhone());
            pst.setInt(6, acd.getFax());
            
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
    
    public int checkCompanyname(String companyname) {
        try {
            con = (Connection) DriverManager.getConnection(url, this.username, password);
            String quary = "SELECT company FROM company";
            
            pst=(PreparedStatement)con.prepareStatement(quary);
            
            rs=pst.executeQuery();
            while(rs.next()){
                if(companyname.equals(rs.getString(1))){
                    return 0;//the companyname provided already exits in the db
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
    
    public boolean deleteCompany(CompanyDetails em){
        try {
            con= (Connection)DriverManager.getConnection(url, username, password);
            String quary="DELETE FROM company WHERE regid='"+em.getRegid()+"'";
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
    
    public boolean updateCompany(CompanyDetails em){
        try {
            con= (Connection)DriverManager.getConnection(url, username, password);
            String quary="UPDATE company SET company='"+em.getCompanyname()+"',address='"+em.getAddress()+"',email='"+em.getEmail()+"',phone="+em.getPhone()+",fax="+em.getFax()+" WHERE regid='"+em.getRegid()+"'";
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
    public ArrayList<CompanyDetails> getCompany(){
        try {
            ArrayList<CompanyDetails> slist=new ArrayList<CompanyDetails>();
            con= (Connection)DriverManager.getConnection(url, username, password);
            String quary="select * FROM company";
            pst=(PreparedStatement)con.prepareStatement(quary);
            
            rs=pst.executeQuery();
            
            while(rs.next()){
                CompanyDetails s=new CompanyDetails();
                
                s.setRegID(rs.getString(1));
                s.setCompanyname(rs.getString(2));
                s.setAddress(rs.getString(3));
                s.setEmail(rs.getString(4));
                s.setPhone(rs.getInt(5));
                s.setFax(rs.getInt(6));
                
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
    
    public boolean addtoStore(String id, int data){
        try {
            con= (Connection)DriverManager.getConnection(url, username, password);
            String quary="UPDATE item SET quantity="+data+" WHERE itemid='"+id+"'";
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
    
}


