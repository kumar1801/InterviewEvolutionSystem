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
    public String saveRound(){
        RoundOperation ro = new RoundOperation();
        
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
