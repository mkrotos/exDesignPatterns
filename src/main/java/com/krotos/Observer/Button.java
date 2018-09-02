package com.krotos.Observer;

public class Button {
    private OnClickListener listener;

    public void setListener(OnClickListener listener) {
        this.listener = listener;
    }
    public void removeListener(){
        listener=null;
    }
    public void click(){
        listener.onClick();
    }
}
