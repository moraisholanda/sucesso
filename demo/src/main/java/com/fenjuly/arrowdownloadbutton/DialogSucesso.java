package com.fenjuly.arrowdownloadbutton;

import android.app.Dialog;
import android.app.DialogFragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;

import com.fenjuly.library.CheckSucesso;
import com.fenjuly.library.ListenerAnimacao;


public class DialogSucesso extends DialogFragment implements ListenerAnimacao{

    private CheckSucesso button;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view =inflater.inflate(R.layout.second,container,false);
        button = (CheckSucesso) view.findViewById(R.id.arrow_download_button);
        button.setListenerAnimacao(this);
        button.startAnimating();
        return view;
    }

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        // The only reason you might override this method when using onCreateView() is
        // to modify any dialog characteristics. For example, the dialog includes a
        // title by default, but your custom layout might not need it. So here you can
        // remove the dialog title, but you must call the superclass to get the Dialog.
        Dialog dialog = super.onCreateDialog(savedInstanceState);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);

        return dialog;
    }

    public DialogSucesso showDialog(AppCompatActivity activity) {

        if (!activity.isFinishing() &&
                activity.getSupportFragmentManager().findFragmentByTag(getClass().getSimpleName()) == null) {
            show(activity.getFragmentManager(), getClass().getSimpleName());
        }


        return this;
    }

    @Override
    public void finish() {
        dismiss();
    }
}
