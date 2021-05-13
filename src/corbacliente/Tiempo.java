/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package corbacliente;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author harde
 */
public class Tiempo {
    Calendar fecha = new GregorianCalendar();
    String hora= Integer.toString(fecha.get(Calendar.HOUR_OF_DAY));
    String minuto= Integer.toString(fecha.get(Calendar.MINUTE));
    String horaComp= hora+":"+minuto;
}
