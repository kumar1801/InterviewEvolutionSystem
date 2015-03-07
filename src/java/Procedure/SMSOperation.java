/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Procedure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;

/**
 *
 * @author Jyotil
 */
public class SMSOperation {

    public static String retval = "";

    public String SMSSender(String msisdn, String msg) {
        String rsp = "";

        try {
            // Construct The Post Data
            String data = URLEncoder.encode("user", "UTF-8") + "=" + URLEncoder.encode("mykarsoltechnologies", "UTF-8");
            data += "&" + URLEncoder.encode("password", "UTF-8") + "=" + URLEncoder.encode("704815", "UTF-8");
            data += "&" + URLEncoder.encode("msisdn", "UTF-8") + "=" + URLEncoder.encode(msisdn, "UTF-8");
            data += "&" + URLEncoder.encode("msg", "UTF-8") + "=" + URLEncoder.encode(msg, "UTF-8");
            data += "&" + URLEncoder.encode("sid", "UTF-8") + "=" + URLEncoder.encode("WebSMS", "UTF-8");
            data += "&" + URLEncoder.encode("fl", "UTF-8") + "=" + URLEncoder.encode("0", "UTF-8");

            //Push the HTTP Request
            URL url = new URL("http://smslane.com/vendorsms/pushsms.aspx");
            URLConnection conn = url.openConnection();
            conn.setDoOutput(true);

            OutputStreamWriter wr = new OutputStreamWriter(conn.getOutputStream());
            wr.write(data);
            wr.flush();

            //Read The Response
            BufferedReader rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            String line;
            while ((line = rd.readLine()) != null) {
                // Process line...
                retval += line;
            }
            wr.close();
            rd.close();

            System.out.println(retval);
            rsp = retval;

        } catch (IOException e) {
            e.printStackTrace();
        }
        return rsp;
    }

}
