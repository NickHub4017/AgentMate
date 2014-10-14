package agentpc.BusinessLogic;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class ItemTableModel extends AbstractTableModel{
    
    private  final String[] COLUMN_NAMES={"ItemID","ItemName","CompanyName","Selling Price","Quantity"};
    private  ArrayList<ItemDetails> list;

    public ItemTableModel(ArrayList<ItemDetails> stdList) {
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
                return list.get(rowIndex).getItemID();
            case 1:
                return list.get(rowIndex).getItemName();
            case 2:
                return list.get(rowIndex).getSuplier();
            case 3:
                return list.get(rowIndex).getSelPrice();
            case 4:
                return list.get(rowIndex).getQuantity();
            
            default:
                return "Error";
        }
    }
    
}

