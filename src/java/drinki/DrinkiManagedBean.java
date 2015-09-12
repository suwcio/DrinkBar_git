/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package drinki;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.model.DataModel;
import javax.faces.model.ListDataModel;

/**
 *
 * @author Piotr
 */
@ManagedBean(name="drinkiManagedBean")
@SessionScoped
public class DrinkiManagedBean {

    /**
     * Creates a new instance of DrinkiManagedBean
     */
    DrinkiHelper helper;
    private Drinki current;
    DataModel drinki;
    private int selectedItemIndex;
    
    public DrinkiManagedBean() {
        helper = new DrinkiHelper();
    }
    
    public DataModel getDrinki() {
        if(drinki == null) {
            drinki = new ListDataModel(helper.getDrinki());
        }
        return drinki;
    }
    
    public Drinki getSelected() {
        if (current == null) {
            current = new Drinki();
            selectedItemIndex = -1;
        }
        return current;
    }
    
    void recreateModel() {
        drinki = null;
    }
    
    public String prepareView() {
        current = (Drinki) getDrinki().getRowData();
        return "drink";
    }
    
    public String prepareEdit() {
        current = (Drinki) getDrinki().getRowData();
        return "edytujprzepis";
    }
    
    public String prepareAdd() {
        current = null;
        return "dodajprzepis";
    }
    
    public String prepareList() {
        recreateModel();
        return "drinki";
    }
    
    public String prepareSaveAndList() {
        helper.saveOrUpdate(current);
        recreateModel();
        return "drinki";
    }
    
}
