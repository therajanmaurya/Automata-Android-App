package dapsr.materialdesign.rm.FragmentAndActivity;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;

/**
 * Created by rajanmaurya on 21/4/15.
 */
public class About extends DialogFragment {

    public Dialog onCreateDialog(Bundle savedInstanceState) {
        // Use the Builder class for convenient dialog construction
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setMessage("Developed By :  Rajan Maurya \nDevesh Khandelwal\n\t\t\t\t\t\t \nThis app is for those who wants to study automata in small time and want to cover all the topics of automata :)\nThis app is open source you can find code on my github profile #therajanmaurya ")
                .setTitle("About")
                .setPositiveButton("My github profile", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {

                        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/pa1pal/ForceAlarm"));
                        startActivity(browserIntent);
                    }
                })
                .setNeutralButton("My Facebook Profile", new DialogInterface.OnClickListener(){
                    public void onClick(DialogInterface dialog, int id) {

                        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/pa1.pal"));
                        startActivity(browserIntent);
                    }
                })
                .setNegativeButton("OK", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        // User cancelled the dialog
                    }
                });
        // Create the AlertDialog object and return it
        return builder.create();
    }
}
