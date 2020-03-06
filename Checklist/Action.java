package com.applications.koushik.ugcnetpractice.Tools.Checklist;
public class Action implements AddAction {

    Checklist checklist;

    public Action(Checklist checklist) {
        this.checklist = checklist;
    }

    @Override
    public void addAction() {

    }

    public void completed(){
        checklist.actionCompleted();
    }

    public void putInBundle(String key , Object object){
        checklist.putInBundle(key,object);
    }

    public void start(){
        addAction();
    }

}