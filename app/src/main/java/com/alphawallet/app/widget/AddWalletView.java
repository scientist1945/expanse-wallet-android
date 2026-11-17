package com.alphawallet.app.widget;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
<<<<<<< HEAD
=======

import androidx.annotation.LayoutRes;
>>>>>>> upstream/master

import com.alphawallet.app.R;


public class AddWalletView extends FrameLayout implements View.OnClickListener {
    private OnNewWalletClickListener onNewWalletClickListener;
    private OnImportWalletClickListener onImportWalletClickListener;
    private OnWatchWalletClickListener onWatchWalletClickListener;
    private OnCloseActionListener onCloseActionListener;
<<<<<<< HEAD
//    private OnHardwareCardActionListener onHardwareCardClickListener;
=======
    private OnHardwareCardActionListener onHardwareCardClickListener;
>>>>>>> upstream/master

    public AddWalletView(Context context) {
        this(context, R.layout.layout_dialog_add_account);
    }

    public AddWalletView(Context context, @LayoutRes int layoutId) {
        super(context);

        init(layoutId);
    }

    private void init(@LayoutRes int layoutId) {
        LayoutInflater.from(getContext()).inflate(layoutId, this, true);
        findViewById(R.id.new_account_action).setOnClickListener(this);
        findViewById(R.id.import_account_action).setOnClickListener(this);
        findViewById(R.id.watch_account_action).setOnClickListener(this);
        findViewById(R.id.hardware_card).setOnClickListener(this);
    }

    @Override
<<<<<<< HEAD
    public void onClick(View view) {
=======
    public void onClick(View view)
    {
>>>>>>> upstream/master
        if (view.getId() == R.id.close_action)
        {
            if (onCloseActionListener != null)
            {
                onCloseActionListener.onClose(view);
<<<<<<< HEAD
=======
            }
        }
        else if (view.getId() == R.id.new_account_action)
        {
            if (onNewWalletClickListener != null)
            {
                onNewWalletClickListener.onNewWallet(view);
            }
        }
        else if (view.getId() == R.id.import_account_action)
        {
            if (onImportWalletClickListener != null)
            {
                onImportWalletClickListener.onImportWallet(view);
            }
        }
        else if (view.getId() == R.id.watch_account_action)
        {
            if (onWatchWalletClickListener != null)
            {
                onWatchWalletClickListener.onWatchWallet(view);
            }
        }
        else if (view.getId() == R.id.hardware_card)
        {
            if (onHardwareCardClickListener != null)
            {
                onHardwareCardClickListener.detectCard(view);
>>>>>>> upstream/master
            }
        }
        else if (view.getId() == R.id.new_account_action)
        {
            if (onNewWalletClickListener != null)
            {
                onNewWalletClickListener.onNewWallet(view);
            }
        }
        else if (view.getId() == R.id.import_account_action)
        {
            if (onImportWalletClickListener != null)
            {
                onImportWalletClickListener.onImportWallet(view);
            }
        }
        else if (view.getId() == R.id.watch_account_action)
        {
            if (onWatchWalletClickListener != null)
            {
                onWatchWalletClickListener.onWatchWallet(view);
            }
        }
//        else if (view.getId() == R.id.hardware_card)
//        {
//            if (onHardwareCardClickListener != null)
//            {
//                onHardwareCardClickListener.detectCard(view);
//            }
//        }
    }

    public void setOnNewWalletClickListener(OnNewWalletClickListener onNewWalletClickListener) {
        this.onNewWalletClickListener = onNewWalletClickListener;
    }

    public void setOnImportWalletClickListener(OnImportWalletClickListener onImportWalletClickListener) {
        this.onImportWalletClickListener = onImportWalletClickListener;
    }

    public void setOnWatchWalletClickListener(OnWatchWalletClickListener onWatchWalletClickListener) {
        this.onWatchWalletClickListener = onWatchWalletClickListener;
    }

<<<<<<< HEAD
//    public void setOnHardwareCardClickListener(OnHardwareCardActionListener onHardwareCardClickListener)
//    {
//        this.onHardwareCardClickListener = onHardwareCardClickListener;
//    }
=======
    public void setOnHardwareCardClickListener(OnHardwareCardActionListener onHardwareCardClickListener)
    {
        this.onHardwareCardClickListener = onHardwareCardClickListener;
    }
>>>>>>> upstream/master

    public void setOnCloseActionListener(OnCloseActionListener onCloseActionListener) {
        this.onCloseActionListener = onCloseActionListener;
    }

    public interface OnNewWalletClickListener {
        void onNewWallet(View view);
    }

    public interface OnImportWalletClickListener {
        void onImportWallet(View view);
    }

    public interface OnWatchWalletClickListener {
        void onWatchWallet(View view);
    }

    public interface OnCloseActionListener {
        void onClose(View view);
    }

    public interface OnHardwareCardActionListener
    {
        void detectCard(View view);
    }

<<<<<<< HEAD
//    public void setHardwareActive(boolean isStub)
//    {
//        TextView hardwareText = findViewById(R.id.hardware_card);
//        if (isStub)
//        {
//            hardwareText.setVisibility(View.GONE);
//        }
//    }
=======
    public void setHardwareActive(boolean isStub)
    {
        TextView hardwareText = findViewById(R.id.hardware_card);
        if (isStub)
        {
            hardwareText.setVisibility(View.GONE);
        }
    }
>>>>>>> upstream/master
}
