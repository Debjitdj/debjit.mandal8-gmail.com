package tech.a0by0.mycalendar;

/**
 * Created by Debjit on 23-Oct-17.
 */

public interface OnWeekDayViewClickListener {

    void onClick(String date, String time);

    void onLongClick(String date, String time);

}