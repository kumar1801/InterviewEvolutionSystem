/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stroke;

import Procedure.*;

/**
 *
 * @author Jyotil
 */
public class SMSAction {

    public void SMSSend(String mono, String msg) {
        SMSOperation smso = new SMSOperation();
        String response = smso.SMSSender(mono, msg);
        System.out.println(response);
    }
}
