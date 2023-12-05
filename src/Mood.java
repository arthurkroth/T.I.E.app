/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Michael McCreary - x22171363
 */
public class Mood {
    
        public String generateMoodTips(int moodLevel, boolean socialiseRegularly, int unitsOfAlcohol, int hoursInNature) {
        StringBuilder tipsBuilder = new StringBuilder();

        // Mood Level Tips
        if (moodLevel < 5) {
            tipsBuilder.append("Your mood is quite low. Consider seeking support from friends or professionals. \n");
        } else if (moodLevel < 7) {
            tipsBuilder.append("Your mood is moderate. Engage in activities that bring you joy. \n");
        } else {
            tipsBuilder.append("You are in a good mood. Keep up the positive vibes! \n");
        }

        // Socialising Tips
        if (!socialiseRegularly) {
            tipsBuilder.append("Socializing is important for mental well-being. Make an effort to connect with others. \n");
        } else {
            tipsBuilder.append("Great job on maintaining regular social activities! \n");
        }

        // Alcohol Tips
        if (unitsOfAlcohol >= 3) {
            tipsBuilder.append("Binge drinking can negatively impact your mood. Consider cutting down on alcohol consumption." + '\n'
                    + "If you need help getting your alcohol consumption under control please visit: https://www.drinkaware.ie/  \n");
        } else if (unitsOfAlcohol > 0) {
            tipsBuilder.append("Your alcohol consumption is below recommended levels. Be mindful of its effects on your mood. \n");
        } else {
            tipsBuilder.append("You haven't consumed any alcohol. This is beneficial for your overall well-being. \n");
        }

        // Nature Tips
        if (hoursInNature < 2) {
            tipsBuilder.append("Spending more time in nature can improve your mood and well-being. \n");
        } else if (hoursInNature >= 2 && hoursInNature < 5) {
            tipsBuilder.append("You are spending a decent amount of time in nature. Consider increasing it for additional benefits. \n");
        } else {
            tipsBuilder.append("You are getting a good dose of nature! Keep enjoying the outdoors. \n");
        }

        return tipsBuilder.toString();
    }
}
