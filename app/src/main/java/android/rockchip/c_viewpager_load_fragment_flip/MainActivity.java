package android.rockchip.c_viewpager_load_fragment_flip;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import android.content.res.Resources;
import android.os.Bundle;
import android.util.TypedValue;

//https://github.com/baopengjian/Ray_DailyWork/tree/master/app/src/main/java/com/example/baopengjian/ray_dailywork/eighth
public class MainActivity extends AppCompatActivity {
    private ViewPager vp;
    protected static final String[] PAGE_TITLES = new String[]{"Page 1", "Page 2",
            "Page 3", "Page 4", "Page 5"};

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViewPager();
        initViewPager1();
    }

    private void initViewPager1() {
//        ViewPager vp = findViewById(R.id.vp);
//        vp.setAdapter(new ShrinkPagerAdapter(ShrinkViewpagerActivity.this));
    }

    private void initViewPager() {
        FlipViewPager mPager = findViewById(R.id.flipViewPager);
        mPager.setAdapter(new FlipFragmentAdapter(getSupportFragmentManager(),
                MainActivity.this, PAGE_TITLES));
        mPager.setAnimationEnabled(true);
        mPager.setFadeEnabled(false);
//        mPager.setFadeFactor(0.6f);
        mPager.setPageMargin(dp2px(getResources(), 80));
    }
    public int dp2px(Resources resource, int dp) {
        return (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, dp, resource.getDisplayMetrics());
    }
}