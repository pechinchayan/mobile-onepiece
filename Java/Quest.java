package com.example.android.tflitecamerademo;

public class Quest {
    private int questID;
    private String questName;
    //Constructores
    public Quest() {}
    public  Quest(int questID, String questName){
        this.questID = questID;
        this.questName = questName;
    }
    //Métodos
    public void setStudentName(String questName) {
        this.questName = questName;
    }

}
