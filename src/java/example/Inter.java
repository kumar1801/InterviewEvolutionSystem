/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package example;

import Procedure.JobOpeningOperation;
import Prototypical.Jobopeningdetails;
import static com.opensymphony.xwork2.Action.SUCCESS;
import com.opensymphony.xwork2.ActionSupport;
import java.util.List;

/**
 *
 * @author Devank
 */
public class Inter extends ActionSupport {
    private List<Jobopeningdetails> listjod;
    @Override
    public String execute()
    {
        JobOpeningOperation joo = new JobOpeningOperation();
        listjod = joo.dataretrival();
        return SUCCESS;
    } 
}
