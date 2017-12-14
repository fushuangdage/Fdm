package com.example.admin.fdm.ui.activity;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.admin.fdm.R;
import com.example.admin.fdm.base.BaseActivity;
import com.example.admin.fdm.ui.adapter.ZhyBaseRecycleAdapter.CommonAdapter;
import com.example.admin.fdm.ui.adapter.ZhyBaseRecycleAdapter.base.ViewHolder;

import java.util.ArrayList;

import butterknife.BindView;

public class CrabListActivity extends BaseActivity {



    @BindView(R.id.recyclerView)
    RecyclerView recyclerView;

    ArrayList<String> arrayList=new ArrayList<>();
    @Override
    public int setLayout() {
        return R.layout.activity_crab_list;
    }

    @Override
    public void initEvent() {
        for (int i = 0; i < 10; i++) {
            arrayList.add("");
        }

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new CommonAdapter<String>(this,R.layout.item_crab_list,arrayList) {
            @Override
            protected void convert(ViewHolder holder, String o, int position) {

            }
        });

    }

    @Override
    public void initData() {

    }
}
