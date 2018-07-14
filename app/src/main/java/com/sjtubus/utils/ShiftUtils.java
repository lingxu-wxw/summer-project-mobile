package com.sjtubus.utils;

import java.util.Calendar;

public class ShiftUtils {

    private String[] line_list = {"闵行到徐汇", "徐汇到闵行", "闵行到七宝", "七宝到闵行"};
    private String[] line_list_E = {"MinToXu", "XuToMin", "MinToQi", "QiToMin"};

    private String[] type_list = {"在校期-工作日", "在校期-双休日、节假日", "寒暑假-工作日","寒暑假-双休日"};
    private String[] type_list_E = {"NormalWorkday","NormalWeekendAndLegalHoliday","HolidayWorkday","HolidayWeekend"};

    public static String ERROR = "error";

    private StringCalendarUtils stringCalendarUtils;

    public String getTypeByCalendar(Calendar calendar){
        //date = calendar.getTime();
        boolean isWeekendFlag = stringCalendarUtils.isWeekend(calendar);
        boolean isHoildayFlag = stringCalendarUtils.isHoilday(calendar);
        if (!isHoildayFlag && !isWeekendFlag){
            return type_list[0];
        }
        else if (!isHoildayFlag){
            return type_list[1];
        }
        else if (!isWeekendFlag){
            return type_list[2];
        }
        else{
            return type_list[3];
        }
    }

    public String getLineByDepartureAndArrive(String departure_place_str, String arrive_place_str){
        if (departure_place_str.equals("闵行") || arrive_place_str.equals("徐汇")) {
            return line_list_E[0];
        }
        else if (departure_place_str.equals("徐汇") || arrive_place_str.equals("闵行")) {
            return line_list_E[1];
        }
        else if (departure_place_str.equals("闵行") || arrive_place_str.equals("七宝")) {
            return line_list_E[2];
        }
        else if (departure_place_str.equals("七宝") || arrive_place_str.equals("闵行")) {
            return line_list_E[3];
        }
        else {
            return ERROR;
        }
    }
}
