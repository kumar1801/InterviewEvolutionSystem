/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stroke;

import Procedure.*;
import Prototypical.*;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;
import java.util.ArrayList;
import org.jfree.chart.JFreeChart;

/**
 *
 * @author Jyotil
 */
public class ResultAction extends ActionSupport implements ModelDriven, Preparable {

    Result result;
    int personid, roundId;
    ArrayList<Interviewee> dispint;
    ArrayList<Round> disprnd;
    JFreeChart chart;

    @Override
    public Object getModel() {
        return result;
    }

    @Override
    public void prepare() throws Exception {
        result = new Result();
    }

    public int getPersonid() {
        return personid;
    }

    public void setPersonid(int personid) {
        this.personid = personid;
    }

    public int getRoundId() {
        return roundId;
    }

    public void setRoundId(int roundId) {
        this.roundId = roundId;
    }

    public String saveResult() {
        ResultOperation op = new ResultOperation();
        ResultId resultId = new ResultId(personid, roundId);
        result.setId(resultId);
        boolean save = op.saveR(result);
        dispint = op.Dispi();
        disprnd = op.Disprnd();
        if (save) {
            addActionMessage("SUCCESSFULLY INSERTED");
            return SUCCESS;
        } else {
            return ERROR;
        }
    }

    public ArrayList<Interviewee> getDispint() {
        return dispint;
    }

    public void setDispint(ArrayList<Interviewee> dispint) {
        this.dispint = dispint;
    }

    public ArrayList<Round> getDisprnd() {
        return disprnd;
    }

    public void setDisprnd(ArrayList<Round> disprnd) {
        this.disprnd = disprnd;
    }

    public String DisplayIntRnd() {
        ResultOperation op = new ResultOperation();
        dispint = op.Dispi();
        disprnd = op.Disprnd();
        if (!dispint.isEmpty() && !disprnd.isEmpty()) {
            return SUCCESS;
        } else {
            return ERROR;
        }
    }

    public JFreeChart getChart() {
        return chart;
    }

    public void setChart(JFreeChart chart) {
        this.chart = chart;
    }

    public String BarChartResult() {
        ResultOperation op = new ResultOperation();
        chart = op.getResultChart();
        return SUCCESS;
    }
}
