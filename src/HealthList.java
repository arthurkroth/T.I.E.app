/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author arthurkroth
 */
public class HealthList {
    private ArrayList<String> smokerTipsList;

    public HealthList() {
        this.smokerTipsList = new ArrayList<>();
        this.initializeSmokerTips();
    }

    private void initializeSmokerTips() {
        smokerTipsList.add("Consider joining a support group to quit smoking.");
        smokerTipsList.add("Identify triggers that make you want to smoke and find alternatives to cope.");
        smokerTipsList.add("Exercise regularly to reduce nicotine cravings and improve overall health.");
        smokerTipsList.add("Stay hydrated with water or herbal teas to help flush out toxins.");
        smokerTipsList.add("Replace smoking with healthier habits like chewing gum or snacking on fruits.");
        smokerTipsList.add("Seek professional help or counseling for quitting smoking.");
        smokerTipsList.add("Avoid situations or environments where smoking is prevalent.");
        smokerTipsList.add("Find a hobby or activity to keep your mind occupied and away from smoking.");
        smokerTipsList.add("Track your progress and celebrate small victories on your journey to quitting.");
    }

    public String getRandomSmokerTip() {
        Random random = new Random();
        int randomIndex = random.nextInt(smokerTipsList.size());
        return smokerTipsList.get(randomIndex);
    }
}
