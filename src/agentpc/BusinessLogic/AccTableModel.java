package agentpc.BusinessLogic;
////g jhtmyf mfm
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class AccTableModel extends AbstractTableModel{
    
    private static final String[] COLUMN_NAMES={"RegcID","First Name","Last Name","Company","Email"};
    private static ArrayList<AccountantDetails> list;

    public AccTableModel(ArrayList<AccountantDetails> stdList) {
        list=stdList;
    }
    
    
    @Override
    public int getRowCount(){
        return list.size();
    }
    
    @Override
    public String getColumnName(int columnIndex){
        return COLUMN_NAMES[columnIndex];
    }
    
    @Override
    public int getColumnCount() {
        return COLUMN_NAMES.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex){
            case 0:
                return list.get(rowIndex).getRegid();
            case 1:
                return list.get(rowIndex).getFirstname();
            case 2:
                return list.get(rowIndex).getLastname();
            case 3:
                return list.get(rowIndex).getCompany();
            case 4:
                return list.get(rowIndex).getEmail();
            default:
                return "Error";
        }
    }
    
}
