package com.keyin.time;

//QAP 1 - Software Design, Architecture, and Testing
//Written By: Kara Balsom
//Date Written: February 1, 2023


//Creates the Time class and the three private instance variables:
public class Time {
    private int hour;
    private int minute;
    private int second;

    // Creates a constructor with three integer parameters: h, m, and s. It sets the
    // hour, minute, and second of the Time object to the values of the parameters
    // passed in:
    public Time(int h, int m, int s) {
        this.hour = h;
        this.minute = m;
        this.second = s;
    }

    // Creates a get method, which gets the hour of the Time object on which the
    // method is invoked and returns the hour:
    public int getHour() {
        return this.hour;
    }

    // Creates a get method, which gets the minute of the Time object on which the
    // method is invoked and returns the minute:
    public int getMinute() {
        return this.minute;
    }

    // Creates a get method, which gets the second of the Time object on which the
    // method is invoked and returns the second:
    public int getSecond() {
        return this.second;
    }

    // Creates a set method, which sets the hour of the Time object on which the
    // method is invoked to the integer passed in as a parameter. Returns nothing
    // because it is void.
    public void setHour(int h) {
        this.hour = h;
    }

    // Creates a set method, which sets the minute of the Time object on which the
    // method is invoked to the integer passed in as a parameter. Returns nothing
    // because it is void.
    public void setMinute(int m) {
        this.minute = m;
    }

    // Creates a set method, which sets the second of the Time object on which the
    // method is invoked to the integer passed in as a parameter. Returns nothing
    // because it is void.
    public void setSecond(int s) {
        this.second = s;
    }

    // Creates a set method, which sets all three variables of the Time object on
    // which the method is invoked to the integers passed in as parameters. An
    // if/else statement makes sure that the variables are within the apropriate
    // ranges. If the variable is not within the apropriate range, a throw
    // statement is used with the exception type IllegalArgumentException. The
    // IllegalArgumetnException is built-in, and indicates the argument being
    // passed in is unsuitable for the method (example, hour cannot be 26).
    // Throwing this exception prevents Java from setting the time to a default
    // when an inapropriate variable is entered, and the program from continuing
    // on with the default.
    public void setTime(int h, int m, int s) {
        if (h > 23 || h < 00) {
            throw new IllegalArgumentException("Has to be below 24.");
        } else if (m > 59 || m < 00) {
            throw new IllegalArgumentException("Has to be below 60.");
        } else if (s > 59 || s < 00) {
            throw new IllegalArgumentException("Has to be below 60.");
        } else {
            this.hour = h;
            this.minute = m;
            this.second = s;
        }

    }

    // Creates a method toString() which returns a string. The String.format()
    // method is used and given a format ("%02d:%02d:%02d") and the three variables.
    // In "%02d", the %..d refers to an integer, the 2 refers to the number of
    // digits, and the 0 indicates to pad with zeros if the integer passed in is not
    // the
    // correct amount of digits. So if the integer is only
    // one digit, a leading zero will be added to make it 2 digits.
    public String toString() {
        return String.format("%02d:%02d:%02d", this.hour, this.minute, this.second);
    }

    // Creates a method nextSecond(), which adds a second onto the Time object and
    // returns the whole object. If statements cause the hour, minutes, and/or
    // seconds to roll over when they reach the top of their range.
    public Time nextSecond() {
        this.second += 1;
        if (this.second == 60) {
            this.second = 00;
            this.minute += 1;
            if (this.minute == 60) {
                this.minute = 00;
                this.hour += 1;
                if (this.hour == 24) {
                    this.hour = 00;
                }
            }
        }
        return this;
    }

    // Creates a method previousSecond(), which subtracts a second from the Time
    // object and returns the whole object. If statements cause the hour,
    // minutes, and/or seconds to roll down when they reach the bottom of their
    // range.
    public Time previousSecond() {
        this.second -= 1;
        if (this.second == -1) {
            this.second = 59;
            this.minute -= 1;
            if (this.minute == -1) {
                this.minute = 59;
                this.hour -= 1;
                if (this.hour == -1) {
                    this.hour = 23;
                }
            }
        }
        return this;
    }
}