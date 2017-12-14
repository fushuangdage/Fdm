package com.example.admin.fdm;

import android.view.View;
import android.widget.ImageView;

import com.example.admin.fdm.base.BaseActivity;
import com.example.admin.fdm.ui.activity.ClaimHouseActivity;
import com.example.admin.fdm.ui.activity.CrabListActivity;
import com.example.admin.fdm.ui.activity.OrderListActivity;
import com.example.admin.fdm.ui.activity.SelfCenterActivity;
import com.example.admin.fdm.ui.activity.TakeLookListActivity;

import butterknife.OnClick;

public class MainActivity extends BaseActivity {


    @Override
    public int setLayout() {
        return R.layout.activity_main;
    }

    @Override
    public void initEvent() {
        ImageView imageView = (ImageView) findViewById(R.id.iv_agent);

    }

    @Override
    public void initData() {

    }

    @OnClick({R.id.ll_claim_house,R.id.iv_agent,R.id.ll_order_list,R.id.ll_take_look,R.id.ll_crab_order})
    public void onClick(View view){
        switch (view.getId()) {
            case R.id.ll_crab_order:
                startActivity(CrabListActivity.class);
                break;
            case R.id.ll_claim_house:
                startActivity(ClaimHouseActivity.class);
                break;
            case R.id.iv_agent:
                startActivity(SelfCenterActivity.class);
                break;
            case R.id.ll_order_list:
                startActivity(OrderListActivity.class);
                break;
            case R.id.ll_take_look:
                startActivity(TakeLookListActivity.class);
                break;
        }
    }
}
