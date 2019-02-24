package apollo.hospitals.rotationtask;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity
{
    private ImageView imageView;
    private Button button;
    private Random random = new Random();
    int degree, oldDegree;
    //37 sector 9.72 degree each
    private static final float factor = 4.7368f;//.86f;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = findViewById(R.id.imageView);
        button = findViewById(R.id.button);
        textView = findViewById(R.id.textView);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                oldDegree = degree*360;
                degree = random.nextInt(38);//+720;
                Log.e("degreeIs",degree+"");
                degree = degree+720;
                Log.e("degreesIs",degree+"");
                RotateAnimation rotateAnimation = new RotateAnimation(oldDegree,degree,RotateAnimation.RELATIVE_TO_SELF,0.5f,RotateAnimation.RELATIVE_TO_SELF,0.5f);
                rotateAnimation.setDuration(1000);
                rotateAnimation.setFillAfter(true);
                rotateAnimation.setInterpolator(new AccelerateDecelerateInterpolator());
                rotateAnimation.setAnimationListener(new Animation.AnimationListener() {
                    @Override
                    public void onAnimationStart(Animation animation) {
                        textView.setText("");
                    }

                    @Override
                    public void onAnimationEnd(Animation animation) {
                        textView.setText(currentNumber(360 - (degree%360)));
                        Log.e("selectedIs",currentNumber(360 - (degree%360)));
                    }

                    @Override
                    public void onAnimationRepeat(Animation animation) {

                    }
                });
                imageView.startAnimation(rotateAnimation);
            }
        });

    }

    private String currentNumber(int degrees)
    {
        String text = "";
        if (degrees >= (factor * 1) && degrees < (factor * 3))
        {
            text = "32 black";
        }
        if (degrees >= (factor * 3) && degrees < (factor *  5))
        {
            text = "15 red";
        }
        if (degrees >= (factor * 5) && degrees < (factor * 7))
        {
            text = "19 black";
        }
        if (degrees >= (factor * 7) && degrees < (factor * 9))
        {
            text = "4 red";
        }
        if (degrees >= (factor * 9) && degrees < (factor * 11))
        {
            text = "21 black";
        }
        if (degrees >= (factor * 11) && degrees < (factor * 13))
        {
            text = "2 red";
        }
        if (degrees >= (factor * 13) && degrees < (factor * 15))
        {
            text = "25 black";
        }
        if (degrees >= (factor * 15) && degrees < (factor * 17))
        {
            text = "17 red";
        }
        if (degrees >= (factor * 17) && degrees < (factor * 19))
        {
            text = "34 black";
        }
        if (degrees >= (factor * 19) && degrees < (factor * 21))
        {
            text = "37 red";
        }
        if (degrees >= (factor * 21) && degrees < (factor * 23))
        {
            text = "6 black";
        }
        if (degrees >= (factor * 23) && degrees < (factor * 25))
        {
            text = "27 red";
        }
        if (degrees >= (factor * 25) && degrees < (factor * 27))
        {
            text = "13 black";
        }
        if (degrees >= (factor * 27) && degrees < (factor *  29))
        {
            text = "36 red";
        }
        if (degrees >= (factor * 29) && degrees < (factor * 31))
        {
            text = "11 black";
        }
        if (degrees >= (factor * 31) && degrees < (factor * 33))
        {
            text = "30 red";
        }
        if (degrees >= (factor * 33) && degrees < (factor * 35))
        {
            text = "8 black";
        }
        if (degrees >= (factor * 35) && degrees < (factor * 37))
        {
            text = "23 red";
        }
        if (degrees >= (factor * 37) && degrees < (factor * 39))
        {
            text = "10 black";
        }
        if (degrees >= (factor * 39) && degrees < (factor * 41))
        {
            text = "5 red";
        }
        if (degrees >= (factor * 41) && degrees < (factor * 43))
        {
            text = "24 black";
        }
        if (degrees >= (factor * 43) && degrees < (factor * 45))
        {
            text = "16 red";
        }
        if (degrees >= (factor * 45) && degrees < (factor * 47))
        {
            text = "33 black";
        }
        if (degrees >= (factor * 47) && degrees < (factor *  49))
        {
            text = "1 red";
        }
        if (degrees >= (factor * 49) && degrees < (factor * 51))
        {
            text = "20 black";
        }
        if (degrees >= (factor * 51) && degrees < (factor * 53))
        {
            text = "14 red";
        }
        if (degrees >= (factor * 53) && degrees < (factor * 55))
        {
            text = "31 black";
        }
        if (degrees >= (factor * 55) && degrees < (factor * 57))
        {
            text = "9 red";
        }
        if (degrees >= (factor * 57) && degrees < (factor * 59))
        {
            text = "22 black";
        }
        if (degrees >= (factor * 59) && degrees < (factor * 61))
        {
            text = "18 red";
        }
        if (degrees >= (factor * 61) && degrees < (factor * 63))
        {
            text = "29 black";
        }
        if (degrees >= (factor * 63) && degrees < (factor * 65))
        {
            text = "7 red";
        }
        if (degrees >= (factor * 65) && degrees < (factor * 67))
        {
            text = "28 black";
        }
        if (degrees >= (factor * 67) && degrees < (factor * 69))
        {
            text = "12 red";
        }
        if (degrees >= (factor * 69) && degrees < (factor * 71))
        {
            text = "35 black";
        }
        if (degrees >= (factor *71) && degrees < (factor * 73))
        {
            text = "3 red";
        }
        if (degrees >= (factor *73) && degrees < (factor * 75))
        {
            text = "26 black";
        }
        if ((degrees >= (factor *75) && degrees < 360)|| (degrees>0 && degrees<(factor*1)))
        {
            text = "0 green";
        }

        return text;
    }
}
