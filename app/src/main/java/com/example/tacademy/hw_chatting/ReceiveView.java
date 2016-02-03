package com.example.tacademy.hw_chatting;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Tacademy on 2016-01-28.
 */
public class ReceiveView extends FrameLayout {
    public ReceiveView(Context context){
        super(context);
        init();
    }

    ImageView iconView;
    TextView messageView;
    ReceiveData data;

    private void init(){
        inflate(getContext(), R.layout.view_send, this);
        iconView = (ImageView)findViewById(R.id.image_icon);
        messageView = (TextView)findViewById(R.id.text_message);
    }

    public void setData(ReceiveData data) {
        this.data = data;
        iconView.setImageResource(data.iconId);
        messageView.setText(data.message);
    }
}
