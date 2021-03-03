package com.atpingan.jiekou;

/**
 * @author shkstart
 * @create 2021-02-25 9:48
 */
public interface Football extends Sports
{
    public void homeTeamScored(int points);
    public void visitingTeamScored(int points);
    public void endOfQuarter(int quarter);
    public void setHomeTeam(int age);

}
