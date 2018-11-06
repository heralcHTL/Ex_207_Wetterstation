/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bl;

import java.util.LinkedList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Alex
 */
public class WeatherModel extends AbstractTableModel{

    private LinkedList<WeatherStation> list = new LinkedList<>();

    public WeatherModel() {
        list.add(new WeatherStation("Feldbach", 285, 12, 98));
    }
    
    public void addStation(WeatherStation ws)
    {
        list.add(ws);
    }
    
    public void removeStation(int i)
    {
        
    }
    
    @Override
    public int getRowCount() {
        return list.size();
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public Object getValueAt(int i, int i1) {
        WeatherStation ws = list.get(i);
        
        switch(i1)
        {
            case 0: return ws.getPlace();
            case 1: return ws.getSealevel() + "m";
            case 2: return ws.getTemperature() + "°";
            case 3: return ws.getHumidity() + "%";
            default: return "???";
        }
    }
    
}
