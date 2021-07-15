package lab4p16;

import java.util.Scanner;

class Clock
{
    private int hours;
    private int minutes;
    private int seconds;

    Clock()
    {
        this.hours = 12;
        this.minutes = 0;
        this.seconds = 0;
    }

    Clock(int hours, int minutes, int seconds)
    {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    Clock(int seconds)
    {
        this.hours = seconds / 3600;
        if(hours > 23)
        {
            hours = 0;
        }
        seconds = seconds % 3600;
        this.minutes = seconds / 60;
        this.seconds = seconds % 60;
    }

    //getters
    public int getHours() { return this.hours; }
    public int getMinutes() { return this.minutes; }
    public int getSeconds() { return this.seconds; }

    //setters
    public void setHours(int hours) { this.hours = hours; }
    public void setMinutes(int minutes) { this.minutes = minutes; }
    public void setSeconds(int seconds) { this.seconds = seconds; }
    public void setClock(int seconds)
    {
        this.hours = seconds / 3600;
        this.minutes = seconds % 3600 / 60;
        this.seconds = seconds % 60;
    }

    //methods
    public void tick()
    {
        int seconds = this.seconds + getMinutes() * 60 + getHours() * 3600 + 1;
        if (seconds > 24 * 60 * 60) seconds = seconds - 24 * 60 * 60;
        this.hours = seconds / 3600;
        this.minutes = seconds % 3600 / 60;
        this.seconds = seconds % 60;
    }

    public void tickDown()
    {
        int seconds = this.seconds + getMinutes() * 60 + getHours() * 3600 - 1;
        if (seconds <= 0) seconds = 24 * 60 * 60 - seconds;
        setClock(seconds);
    }

    public Clock addClock(Clock second)
    {
        int totalSeconds = this.getSeconds() + this.getHours() * 3600 + this.getMinutes() * 60 + second.getSeconds() + second.getHours() * 3600 + second.getMinutes();
        totalSeconds = totalSeconds % (24 * 60 * 60);
        return new Clock(totalSeconds);
    }

    public Clock subtractClock(Clock second) {

        int totalSeconds = this.getSeconds() + this.getHours() * 3600 + this.getMinutes() * 60 - second.getSeconds() - second.getHours() * 3600 - second.getMinutes();
        totalSeconds = totalSeconds % (24 * 60 * 60);
        return new Clock(Math.abs(totalSeconds));
    }

    public String toString()
    {
        String temp = "";
        if(this.hours <= 9)
        {
            temp += "0";
        }
        temp += this.hours + ":";
        if(this.minutes <= 9)
        {
            temp += "0";
        }
        temp += this.minutes + ":";
        if(this.seconds <= 9)
        {
            temp += "0";
        }
        temp += this.seconds;

        return temp;
    }

}



public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Seconds Since Midnight: ");
        int inp = input.nextInt();

        Clock firstClock = new Clock(inp);
        for(int i = 0; i < 10; ++i)
        {
            firstClock.tick();
            System.out.printf("Tick %d : %s\n", i, firstClock);
        }

        System.out.print("Enter Hours Minutes Seconds(Spaced Integers): ");
        int h = input.nextInt();
        int m = input.nextInt();
        int s = input.nextInt();

        Clock secondClock = new Clock(h, m, s);
        for(int i = 0; i < 10; ++i)
        {
            secondClock.tick();
            System.out.printf("Tick %d : %s\n", i, secondClock);
        }

        firstClock = firstClock.addClock(secondClock);
        System.out.println(firstClock);
        System.out.println(secondClock);

        Clock thirdClock = firstClock.subtractClock(secondClock);
        System.out.println(thirdClock);
    }
}
