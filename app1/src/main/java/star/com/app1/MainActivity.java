package star.com.app1;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;


public class MainActivity extends Activity {
	private RoundProgressBar mRoundProgressBar1;
	private int progress = 0;
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_cricle_progress);
		
		mRoundProgressBar1 = (RoundProgressBar) findViewById(R.id.roundProgressBar1);
		

				new Thread(new Runnable() {
					
					@Override
					public void run() {
						while(progress <= 60){
							progress += 3;
							
							System.out.println(progress);
							
							mRoundProgressBar1.setProgress(progress);
							
							try {
								Thread.sleep(100);
							} catch (InterruptedException e) {
								e.printStackTrace();
							}
						}
						
					}
				}).start();
			}



}
