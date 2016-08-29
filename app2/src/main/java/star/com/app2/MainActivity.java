package star.com.app2;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;

/**
 * 测试类
 *
 * @author yung7086 2015年12月9日 21:51:49
 */
public class MainActivity extends Activity {

    private int preColor = Color.parseColor("#2c2200");
    private int progressColor = Color.parseColor("#6bb849");
    private int CircleColor = Color.parseColor("#CCCCCC");
    private int textColor = Color.parseColor("#9bb879");
    private CircleProgress pv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pv = (CircleProgress) findViewById(R.id.progressview1);
        pv.setTextColor(textColor)
                .setCircleBackgroud(CircleColor)
                .setPreProgress(progressColor).
                setProgress(preColor)
                .setProdressWidth(50).
                setPaddingscale(0.8f);
        han.sendEmptyMessageDelayed(1, 100);
    }

    Handler han = new Handler() {
        public void handleMessage(android.os.Message msg) {
            pv.setValue(msg.what);
            han.sendEmptyMessageDelayed(msg.what + 1, 100);
        };
    };
}
