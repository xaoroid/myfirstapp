package jp.xaoroid.myfirstapp;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity implements View.OnClickListener
{
	private Button button;
	
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        button=(Button)this.findViewById(R.id.widget55);
        button.setOnClickListener(this);
    }
    
    public void onClick(View view) {
    	if (view==button) {
    		showDialog(this,"","input");
      	}
    }
    
    public static void showDialog(final Activity activity, String title, String text) {
    	AlertDialog.Builder ad=new AlertDialog.Builder(activity);
    	ad.setTitle(title);
    	ad.setMessage(text);
    	ad.setPositiveButton("OK", new DialogInterface.OnClickListener() {
    		public void onClick(DialogInterface dialog, int whichButton) {
    			activity.setResult(Activity.RESULT_OK);
    		}
    	});
		ad.create();
		ad.show();
    }
}
