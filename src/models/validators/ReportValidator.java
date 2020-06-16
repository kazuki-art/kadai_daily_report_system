package models.validators;

import java.util.ArrayList;
import java.util.List;

import models.Report;

public class ReportValidator {
    public static List<String> validate(Report r) {
        List<String> errors = new ArrayList<String>();

        String title_error = _validateTitle(r.getTitle());
        if(!title_error.equals("")) {
            errors.add(title_error);
        }

        String content_error = _validateContent(r.getContent());
        if(!content_error.equals("")) {
            errors.add(content_error);
        }

        /*String start_date_time_error = _validateStart_date_time(r.getStart_date_time());
        if(!start_date_time_error.equals("")) {
            errors.add(start_date_time_error);
        }

        String end_date_time_error = _validateEnd_date_time(r.getEnd_date_time());
        if(!end_date_time_error.equals("")) {
            errors.add(end_date_time_error);
        }*/

        return errors;
    }


    /*private static String _validateEnd_date_time(Integer end_date_time) {
        // TODO 自動生成されたメソッド・スタブ
        if(end_date_time == null || end_date_time.equals("")) {
            return "退勤時間を入力してください。";
        }
        return "";
    }


    private static String _validateStart_date_time(Integer start_date_time) {
        // TODO 自動生成されたメソッド・スタブ
        if(start_date_time == null || start_date_time.equals("")) {
            return "出勤時間を入力してください。";
        }
        return "";
    }*/


    private static String _validateTitle(String title) {
        // TODO 自動生成されたメソッド・スタブ
        if(title == null || title.equals("")) {
            return "タイトルを入力してください。";
        }
        return "";
    }

    private static String _validateContent(String content) {
        // TODO 自動生成されたメソッド・スタブ
        if(content == null || content.equals("")) {
            return "内容を入力してください。";
        }
        return "";
    }
}
