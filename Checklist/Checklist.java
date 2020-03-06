package com.applications.koushik.ugcnetpractice.Tools.Checklist;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Checklist {
    private int count;
    private ChecklistCompletedListener checklistCompletedListener;
    private int copyCount;
    private ActionBundle actionBundle;
    List<Action> allActions;

    public Checklist(){
        actionBundle = new ActionBundle();
        allActions = new ArrayList<>();
    }


    public void addChecklistCompletedListener(ChecklistCompletedListener listener){
        checklistCompletedListener = listener;
    }

    public void actionCompleted(){
        if(count == 0)
            throw new RuntimeException("Checklist is empty!");
        else{
            count--;
            if(count == 0){
                checklistCompletedListener.OnChecklistCompleter(actionBundle);
            }
        }
    }

    public void addAction(Action action){
        count++;
        copyCount = count;
        allActions.add(action);
    }

    public void putInBundle(String key , Object object) {
        actionBundle.put(key,object);
    }

    public void start(){
        for(Action action : allActions)
            action.start();
    }

    public void resetChecklist(){
        count = copyCount;
        allActions.clear();
        actionBundle.bundleMap.clear();
    }







}
