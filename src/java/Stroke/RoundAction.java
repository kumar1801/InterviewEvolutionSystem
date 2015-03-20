/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stroke;

import Procedure.RCMOperation;
import Procedure.RoundOperation;
import Prototypical.RCM;
import Prototypical.Round;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;
import java.util.*;

/**
 *
 * @author Jyotil
 */
public class RoundAction extends ActionSupport implements ModelDriven, Preparable {

    Round round;
    List<Round> listround;
    List<RCM> listrcm;
       private String listSelectedData;
       private int roundId;

    public String getListSelectedData() {
        return listSelectedData;
    }

    public void setListSelectedData(String listSelectedData) {
        this.listSelectedData = listSelectedData;
    }

    public int getRoundId() {
        return roundId;
    }

    public void setRoundId(int roundId) {
        this.roundId = roundId;
    }
       
       
       
    

    public List<Round> getListround() {
        return listround;
    }

    public void setListround(List<Round> listround) {
        this.listround = listround;
    }

    @Override
    public Object getModel() {
        return round;
    }

    @Override
    public void prepare() throws Exception {
        round = new Round();
    }
    /**
     *
     * @return
     */
   
      
    
    
    public String viewR(){
       
        RoundOperation ro1 = new RoundOperation();
        
        listround = ro1.asdewes();
        RCMOperation rcmop = new RCMOperation();
         listrcm = rcmop.dataretrival();
        return SUCCESS;
    }
    
    public int[] getBatchIds() {
        StringTokenizer stSelectedDataId = new StringTokenizer(listSelectedData, ":");
        String d = "";
        int selectedDataId[] = new int[stSelectedDataId.countTokens()];
        int i = 0;
        while (stSelectedDataId.hasMoreTokens()) {
            d = stSelectedDataId.nextToken();
            
            selectedDataId[i] = Integer.parseInt(d);
            i++;
        }
        return selectedDataId;
    }
    
     public String retriveData(){
        
        RoundOperation joo = new RoundOperation();
        listround = joo.asdewes();
        return SUCCESS;
    }
    
    public String deleteMultiple() {
        int selectedDataId[] = getBatchIds();
      RoundOperation rnd = new RoundOperation();
       RCMOperation rcmop = new RCMOperation();
        listrcm = rcmop.dataretrival();
        boolean check = rnd.deleteMultipleCourse(selectedDataId);
        if (check) {
            retriveData();
            return SUCCESS;
        } else {
            return ERROR;
        }
    }
    
    
    
    public String saveRound(){
        RoundOperation ro = new RoundOperation();
        RCMOperation rcmop = new RCMOperation();
         listrcm = rcmop.dataretrival();
        boolean save =  ro.insRound(round);
        if(save){
            return SUCCESS;
        }else{
            return ERROR;
        }
    }

    public List<RCM> getListrcm() {
        return listrcm;
    }

    public void setListrcm(List<RCM> listrcm) {
        this.listrcm = listrcm;
    }
    
    
}
