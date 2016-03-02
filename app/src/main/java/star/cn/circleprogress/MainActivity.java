package star.cn.circleprogress;

import android.app.Activity;
import android.os.Bundle;

public class MainActivity extends Activity {
    private RoundProgressBar mRoundProgressBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRoundProgressBar = (RoundProgressBar) findViewById(R.id.roundProgressBar1);
        mRoundProgressBar.setProgress(40,34,"苏州");
    }
}
