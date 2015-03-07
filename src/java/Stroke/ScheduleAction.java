/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stroke;

import Procedure.ResultOperation;
import Procedure.SchedualOperation;
import Prototypical.*;
import Procedure.SMSOperation;
import static com.opensymphony.xwork2.Action.ERROR;
import static com.opensymphony.xwork2.Action.SUCCESS;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Jyotil
 */
public class ScheduleAction extends ActionSupport implements ModelDriven, Preparable {

    Schedule schedule;
    ScheduleId scheduleId;
    ArrayList<Round> disprnd;
    int scheduleNo,roundId;

    public int getScheduleNo() {
        return scheduleNo;
    }

    public void setScheduleNo(int scheduleNo) {
        this.scheduleNo = scheduleNo;
    }

    public int getRoundId() {
        return roundId;
    }

    public void setRoundId(int roundId) {
        this.roundId = roundId;
    }

    public ArrayList<Round> getDisprnd() {
        return disprnd;
    }

    public void setDisprnd(ArrayList<Round> disprnd) {
        this.disprnd = disprnd;
    }

    public String goSchedule() {
        ResultOperation op = new ResultOperation();
        disprnd = op.Disprnd();
        if (!disprnd.isEmpty()) {
            return SUCCESS;
        } else {
            return ERROR;
        }
    }

    @Override
    public Object getModel() {
        return schedule;
    }

    @Override
    public void prepare() throws Exception {
        schedule = new Schedule();
    }

    public String saveSchedule() {
        schedule.setDate(new Date());
        scheduleId = new ScheduleId(scheduleNo, roundId);
        schedule.setId(scheduleId);
        SchedualOperation so = new SchedualOperation();
        boolean save = so.insSchedule(schedule);
        if (save) {
            SMSAction smsa = new SMSAction();
            smsa.SMSSend("919409430960", "Joile aavi gyo??");
            goSchedule();
            return SUCCESS;
        } else {
            return ERROR;
        }
    }
}
