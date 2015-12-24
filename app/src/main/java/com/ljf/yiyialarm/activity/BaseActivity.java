package com.ljf.yiyialarm.activity;

import android.app.Activity;
import android.os.Bundle;

import com.androidquery.AQuery;

import butterknife.ButterKnife;

/**
 * Created by Harvest on 2015/11/6.
 */
public class BaseActivity extends Activity {
    protected AQuery aq;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ButterKnife.bind(this);
        aq =new AQuery(this);
    }
}
